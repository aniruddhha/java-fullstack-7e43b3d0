package com.ani.netty;

import org.springframework.stereotype.Component;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpHeaderNames;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.HttpVersion;

@Component
public class NettyHttpServer {
    
    public void server(int port) throws Exception {
        EventLoopGroup bossGroup = new NioEventLoopGroup(1);
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        
      try {
        
        ServerBootstrap bootstrap = new ServerBootstrap()
                    .group(bossGroup, workerGroup)
                    .channel(NioServerSocketChannel.class)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {
                            
                            ChannelPipeline pipeline = ch.pipeline();
                            
                            pipeline.addLast(new HttpServerCodec());
                            pipeline.addLast(new HttpObjectAggregator(65356));
                            pipeline.addLast(new SimpleChannelInboundHandler<FullHttpRequest>() {

                                @Override
                                protected void channelRead0(ChannelHandlerContext ctx, FullHttpRequest msg)
                                        throws Exception {
                                    String content = "<h1> Hello Word </h1>";

                                    FullHttpResponse response = new DefaultFullHttpResponse(
                                                        HttpVersion.HTTP_1_1, 
                                                        HttpResponseStatus.OK, 
                                                        Unpooled.wrappedBuffer(content.getBytes())
                                                    );
                                    response.headers()
                                        .set(HttpHeaderNames.CONTENT_TYPE, "text/plain");

                                    response.headers()
                                        .set(HttpHeaderNames.CONTENT_LENGTH, response.content().readableBytes());
                                    
                                    ctx.writeAndFlush(response).addListener(ChannelFutureListener.CLOSE);
                                }
                            
                                @Override
                                public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
                                        throws Exception {
                                    cause.printStackTrace();
                                   ctx.close();
                                }
                            });
                        }
                        
                    });

                    ChannelFuture future = bootstrap.bind(port).sync();
                    System.out.println("Server started on port " + port);
      
                } finally {
        bossGroup.shutdownGracefully();
        workerGroup.shutdownGracefully();
      }
    }
}
