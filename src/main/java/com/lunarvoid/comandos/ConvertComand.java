package com.lunarvoid.comandos;

import java.util.ArrayList;
import java.util.List;

import com.lunarvoid.interfaces.Comando;

public class ConvertComand implements Comando {
    
    public void execute(String[] args){
        String error = "";

        if (args[1].isEmpty() || args[2].isEmpty()) {
            error = "invalid sintax --convert X --Y or --help for informations";
            return;
        }
        else if (args[2].equals("--hex")){
            System.out.println(convertDecimal(Integer.valueOf(args[1]), 16));
        }
        else if (args[2].equals("--oct")){
            System.out.println(convertDecimal(Integer.valueOf(args[1]), 8));
        }
        else if (args[2].equals("--bin")){
            System.out.println(convertDecimal(Integer.valueOf(args[1]), 2));
        }
        else if (args[2].equals("--base")){
            if(!args[3].isEmpty()){
                System.out.println(convertDecimal(Integer.valueOf(args[1]), Integer.valueOf(args[3])));
            }else{
                error = "sintax error --base X (X is a numeric base)";
            }
        }
        else if (args[1].equals("--base")){
            if(!args[2].isEmpty()){
                System.out.println(values(Integer.valueOf(args[2])));
            }else{
                error = "sintax error --base X (X is a numeric base)";
            }
        }
        else{
            error = "invalid argument --help for informations";
        }

        if (!error.isBlank()){
            System.out.println(error);
        }
    }

    private static String convertNumberToChar(Integer x){
        if (x < 10){
            return x.toString();
        }

        return String.valueOf((char) ('A' + x - 10));
    }

    private static String convertDecimal(Integer value, Integer base){
        List<Integer> restos = new ArrayList<>();
        StringBuilder str = new StringBuilder();

        while (value >= base) {
           restos.add(value % base);
           value = value / base ;
        }

        restos.add(value);
    
        for(int i = restos.size() - 1; i >= 0; i--){
            str.append(convertNumberToChar(restos.get(i)));
        }

        return str.toString();
    }

    private static String values(Integer base){
        StringBuilder str = new StringBuilder("1-2-3-4-5-6-7-8-9");
        for(int i = 0; i < base - 10; i++){
            str.append("-" + (char) ('A' + i));
        }
        return str.toString();
    }
}
