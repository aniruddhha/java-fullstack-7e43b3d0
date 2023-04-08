package com.ani.netty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class NettyDemosApplication {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx =  SpringApplication.run(NettyDemosApplication.class, args);

		ctx.getBean(NettyHttpServer.class).server(5245);
	}

}
