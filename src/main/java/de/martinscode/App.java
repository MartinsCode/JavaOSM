
/**
 * Hello world!
 *
 */

package de.martinscode;

import java.util.logging.Logger;

public class App {
    protected App() {
        // prevents calls which are not expected
        throw new UnsupportedOperationException();
    }

    /**
     * Entry for the main program.
     * @param args options from command line
     *             not intended to be used though
     */
    public static void main(final String[] args) {
        Logger l = Logger.getLogger(App.class.getName());
        l.info("Program started!");
    }
}
