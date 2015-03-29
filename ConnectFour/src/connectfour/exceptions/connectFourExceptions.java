/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour.exceptions;

/**
 *
 * @author Daniel
 */
public class connectFourExceptions extends Exception {

    /**
     * Creates a new instance of <code>connectFourExceptions</code> without
     * detail message.
     */
    public connectFourExceptions() {
    }

    /**
     * Constructs an instance of <code>connectFourExceptions</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public connectFourExceptions(String msg) {
        super(msg);
    }
}
