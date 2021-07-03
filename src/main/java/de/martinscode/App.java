package de.martinscode;

/**
 * Hello world!
 *
 */
public class App {
    protected App() {
        // prevents calls which are not expected
        throw new UnsupportedOperationException();
    }

    /**
     * Entry for the main program.
     * @param args options from command line
     */
    public static void main(final String[] args) {
        System.out.println("Hello World!");
    }
}
