package com.ani.spring;

import com.ani.spring.util.FileChecker;
import com.ani.spring.util.FileUtil;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
      
        FileUtil util = new FileUtil();

        FileChecker checker = new FileChecker(util);
    }
}
