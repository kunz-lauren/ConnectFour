/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour.exceptions;

/**
 *
 * @author SuperMommy
 */
public class MoreExceptions extends Exception {

    /**
     * Creates a new instance of <code>MoreExceptions</code> without detail
     * message.
     */
    public MoreExceptions() {
    }

    /**
     * Constructs an instance of <code>MoreExceptions</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public MoreExceptions(String msg) {
        super(msg);
    }
}
