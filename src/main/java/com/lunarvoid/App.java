package com.lunarvoid;

import java.util.HashMap;
import java.util.Map;

import com.lunarvoid.comandos.ConvertComand;
import com.lunarvoid.comandos.HelpComand;
import com.lunarvoid.comandos.VersionComand;
import com.lunarvoid.interfaces.Comando;

public class App 
{
    public static void main( String[] args )
    {
        try{

            if (args.length == 0) {
                System.out.println("Espera-se argumentos --help para mais informações");
                return;
            }else{
                Map<String,Comando> comandos = new HashMap<>();
                
                comandos.put("--version", new VersionComand());
                comandos.put("--help", new HelpComand());
                comandos.put("--convert", new ConvertComand());
                
                Comando comando = comandos.get(args[0]);
                
                if(comando == null){
                    System.out.println("Comando invalido --help para mais informações");
                    return;
                }
                
                comando.execute(args);
            }
        }catch(NumberFormatException e){
            System.out.println("Entrada invalida para a base expecificada: " + e.getMessage());
            return;
        }catch(IllegalArgumentException e){
            System.out.println("Entrada invalida: " + e.getMessage());
        }
        
    }
}
