package com.lunarvoid;

import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        String error = "";
        if (args.length == 0) {
            error = "lunar expera parametros --help para mais informações";  
        }else{
            try{

                switch (args[0]) {
                    case "--convert":
                        
                        if (args[1].isEmpty() || args[2].isEmpty()) {
                            error = "invalid sintax --convert X --Y or --help for informations";
                            break;
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
                        else{
                            error = "invalid argument --help for informations";
                        }
                
                    break;

                    case "--version":
                        System.out.println("lunar version: 1.1-SNAPSHOT");
                    break;
                    
                    case "--help":
                        StringBuilder str = new StringBuilder();
                        str.append("--convert Y X to convert Y (decimal) for X\n")
                        .append("X is a number\n")
                        .append("Y valid values --bin for base 2 and --oct for base 8 and --hex for base 16 and --base X (X is a numeric base)");
                        System.out.println(str.toString());
                    break;
                        
                    default:
                        error = "invalid argument --help for sintax";
                    break;
                }
            }
            catch(Exception e){
                error = e.getMessage();
            }
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
}
