/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.martin.datastructdb.cmd;

import org.martin.datastructdb.cmd.exceptions.CompilationErrorException;

/**
 *
 * @author martin
 */
public class Compiler {
    private static final char SPACE = ' ';
    
    public Compiler() {
    }
    
    public String compile(String command){
        return compile(new Command(command));
    }
    
    public String compile(Command cmd){
        StringBuilder sbCompiler = new StringBuilder();
        switch(cmd.getOrder().toUpperCase()){
            case Order.CREATE:
                sbCompiler.append("CR3");
                sbCompiler.append(SPACE);
                compileCreateCmd(cmd, sbCompiler);
                break;
                
            case Order.DEL:
                sbCompiler.append("D3");
                sbCompiler.append(SPACE);
                compileDeleteCmd(cmd, sbCompiler);
                break;
            
            case Order.DELETE:
                sbCompiler.append("D3");
                sbCompiler.append(SPACE);
                compileDeleteCmd(cmd, sbCompiler);
                break;
                
            case Order.GET:
                sbCompiler.append("G1");
                sbCompiler.append(SPACE);
                compileGetCmd(cmd, sbCompiler);
                break;
                
            case Order.INSERT:
                sbCompiler.append("I9");
                sbCompiler.append(SPACE);
                compileInsertCmd(cmd, sbCompiler);
                break;
                
            case Order.SET:
                sbCompiler.append("S1");
                sbCompiler.append(SPACE);
                compileSetCmd(cmd, sbCompiler);
                break;
                
            case Order.LOGIN:
                sbCompiler.append("L1");
                sbCompiler.append(SPACE);
                compileLoginCmd(cmd, sbCompiler);
                break;
        }
        return sbCompiler.toString();
    }
    
    private void compileCreateCmd(Command cmd, StringBuilder sbCompiler) throws CompilationErrorException{
        if (!cmd.hasOptions())
            throw new CompilationErrorException("No se especifica nombre de lista a crear");
        else if (cmd.getOptionsCount() > 1) {
            throw new CompilationErrorException("Número de paŕametros excedido");
        }
        sbCompiler.append(cmd.getFirstOption());
    }
    
    private void compileDeleteCmd(Command cmd, StringBuilder sbCompiler){
    }
    
    private void compileGetCmd(Command cmd, StringBuilder sbCompiler){
        
    }
    
    private void compileInsertCmd(Command cmd, StringBuilder sbCompiler){
        
    }
    
    private void compileSetCmd(Command cmd, StringBuilder sbCompiler){
        
    }
    
    private void compileLoginCmd(Command cmd, StringBuilder sbCompiler){
        
    }
    
}
