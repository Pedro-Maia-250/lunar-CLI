package com.lunarvoid.comandos;

import com.lunarvoid.interfaces.Comando;

public class HelpComand implements Comando {
    
    public void execute(String[] args){
        StringBuilder str = new StringBuilder();
        str.append("--convert Y X to convert Y (decimal) for X\n")
        .append("X is a number\n")
        .append("Y valid values --bin for base 2 and --oct for base 8 and --hex for base 16 and --base X (X is a numeric base)");
        System.out.println(str.toString());
    }
}
