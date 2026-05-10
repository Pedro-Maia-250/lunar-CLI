package com.lunarvoid.comandos;

import com.lunarvoid.interfaces.Comando;

public class VersionComand implements Comando {
    
    public void execute(String[] args){
        System.out.println("version: 2.0-SNAPSHOT");
    }
}
