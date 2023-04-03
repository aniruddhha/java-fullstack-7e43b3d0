package com.ani.spring.excel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ani.spring.util.FileUtil;

@Component
public class XLManager {

    @Autowired
    private XLReader reader; // this ref should point to object created inside ioc container
    
    @Autowired
    private XLFormatter formatter;

    @Autowired // works perfectly
    private FileUtil util; // it will autowire with the bean in container, which is having same name as variable i.e. util

    @Autowired
    @Qualifier("utilData")
    private FileUtil utilAbc;

    // @Autowired
    // public void setUtilAbc(FileUtil utilAbc) {
    //     this.utilAbc = utilAbc;
    // }

    public void configXL() {
        reader.setReadLimit(10);
        formatter.setFont("abc");
        util.fileSize();
        utilAbc.fileSize();
    }
}
