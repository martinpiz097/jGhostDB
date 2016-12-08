/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.martin.datastructdb.cmd.exceptions;

/**
 *
 * @author martin
 */
public class CompilationErrorException extends Exception {

    /**
     * Creates a new instance of <code>CompilationErrorException</code> without
     * detail message.
     */
    public CompilationErrorException() {
    }

    /**
     * Constructs an instance of <code>CompilationErrorException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public CompilationErrorException(String msg) {
        super(msg);
    }
}
