package com.ani.mvn;

import de.vandermeer.asciitable.AsciiTable;

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
        System.out.println("Hello World!");

        AsciiTable at = new AsciiTable();
        at.addRule();
        at.addRow("row 1 col 1", "row 1 col 2");
        at.addRule();
        at.addRow("row 2 col 1", "row 2 col 2");
        at.addRule();

        String rend = at.render();

        System.out.println(rend);
    }
}
