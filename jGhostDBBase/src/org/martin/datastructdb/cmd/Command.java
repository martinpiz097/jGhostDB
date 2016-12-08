/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.martin.datastructdb.cmd;

import java.util.StringTokenizer;

/**
 *
 * @author martin
 */
public class Command {
    private final String order;
    private final Object[] options;

    public Command(String strCommand){
        String[] splitCmd = strCommand.split(" ");
        order = splitCmd[0];
        if (splitCmd.length > 1) {
            options = new String[splitCmd.length-1];
            for (int i = 0; i < splitCmd.length-1; i++)
                options[i] = splitCmd[i+1];
        }
        else
            options = null;
    }
    
    public boolean hasOptions(){
        return options != null;
    }
    
    public int getOptionsCount(){
        if (hasOptions())
            return options.length;
        return 0;
    }

    public String getOrder() {
        return order;
    }

    public Object[] getOptions() {
        return options;
    }
    
    public Object getFirstOption(){
        return hasOptions() ? options[0] : null;
    }
    
    public String getFirstOptionAsString(){
        Object fo = getFirstOption();
        return fo == null ? null : fo.toString();
    }
    
    public Object getOptionAt(final int index){
        if (hasOptions())
            return options[index];
        return null;
    }
    
    public Number getOptionAsNumber(final int index){
        Object option = getOptionAt(index);
        if (option == null)
            return null;
        
        if (option instanceof String)
            return null;
        
        String strOpt = option.toString();
        
        if (strOpt.contains("."))
            return (Double) option;
        else
            return (Long) option;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(order).append(' ');
        
        if (hasOptions())
            for (int i = 0; i < options.length; i++)
                sb.append(options[i]).append(' ');
        sb.deleteCharAt(sb.length()-1);
        String toString = sb.toString();
        sb = null;
        return toString;
    }
    
}
