package com.lunarvoid.comandos;

import java.util.ArrayList;
import java.util.List;

import com.lunarvoid.interfaces.Comando;

public class ConvertComand implements Comando {
    
    public void execute(String[] args){
        String error = "";

        if(args[1].isBlank()){
            error = "Sintaxe invalida --help para mais informações";
        }

        switch (args[1]) {

            case "--hex":

                if (!args[2].isBlank() || !args[3].isBlank() || !args[4].isBlank()) {
                    error = "Sintaxe invalida --help para mais informações";
                }

                
                switch (args[3]) {
                    case "--hex": {

                        String dec = convertToDecimal(args[2], 16);
                        System.out.println(convertDecimal(Integer.valueOf(dec), 16));
                        return;
                    }
                    case "--dec": {
                        String dec = convertToDecimal(args[2], 16);
                        System.out.println(convertDecimal(Integer.valueOf(dec), 10));
                        return;
                    }
                    case "--oct": {
                        String dec = convertToDecimal(args[2], 16);
                        System.out.println(convertDecimal(Integer.valueOf(dec), 8));
                        return;
                    }
                    case "--bin": {
                        String dec = convertToDecimal(args[2], 16);
                        System.out.println(convertDecimal(Integer.valueOf(dec), 2));
                        return;
                    }
                    case "--base": {
                        if(!args[4].isBlank()){
                            String dec = convertToDecimal(args[2], 16);
                            System.out.println(convertDecimal(Integer.valueOf(dec), Integer.valueOf(args[4])));
                            return;
                        }else{
                            error = "Sintaxe invalida --help para mais informações";
                            break;
                        }
                    }
                
                    default:
                        error = "Sintaxe invalida --help para mais informações";
                    break;
                }
            break;

            case "--dec":

                if (!args[2].isBlank() || !args[3].isBlank() || !args[4].isBlank()) {
                    error = "Sintaxe invalida --help para mais informações";
                }

                
                switch (args[3]) {
                    case "--hex": {

                        String dec = convertToDecimal(args[2], 10);
                        System.out.println(convertDecimal(Integer.valueOf(dec), 16));
                        return;
                    }
                    case "--dec": {
                        String dec = convertToDecimal(args[2], 10);
                        System.out.println(convertDecimal(Integer.valueOf(dec), 10));
                        return;
                    }
                    case "--oct": {
                        String dec = convertToDecimal(args[2], 10);
                        System.out.println(convertDecimal(Integer.valueOf(dec), 8));
                        return;
                    }
                    case "--bin": {
                        String dec = convertToDecimal(args[2], 10);
                        System.out.println(convertDecimal(Integer.valueOf(dec), 2));
                        return;
                    }
                    case "--base": {
                        if(!args[4].isBlank()){
                            String dec = convertToDecimal(args[2], 10);
                            System.out.println(convertDecimal(Integer.valueOf(dec), Integer.valueOf(args[4])));
                            return;
                        }else{
                            error = "Sintaxe invalida --help para mais informações";
                            break;
                        }
                    }
                
                    default:
                        error = "Sintaxe invalida --help para mais informações";
                    break;
                }
            break;

            case "--oct":

                if (!args[2].isBlank() || !args[3].isBlank() || !args[4].isBlank()) {
                    error = "Sintaxe invalida --help para mais informações";
                }

                
                switch (args[3]) {
                    case "--hex": {

                        String dec = convertToDecimal(args[2], 8);
                        System.out.println(convertDecimal(Integer.valueOf(dec), 16));
                        return;
                    }
                    case "--dec": {
                        String dec = convertToDecimal(args[2], 8);
                        System.out.println(convertDecimal(Integer.valueOf(dec), 10));
                        return;
                    }
                    case "--oct": {
                        String dec = convertToDecimal(args[2], 8);
                        System.out.println(convertDecimal(Integer.valueOf(dec), 8));
                        return;
                    }
                    case "--bin": {
                        String dec = convertToDecimal(args[2], 8);
                        System.out.println(convertDecimal(Integer.valueOf(dec), 2));
                        return;
                    }
                    case "--base": {
                        if(!args[4].isBlank()){
                            String dec = convertToDecimal(args[2], 8);
                            System.out.println(convertDecimal(Integer.valueOf(dec), Integer.valueOf(args[4])));
                            return;
                        }else{
                            error = "Sintaxe invalida --help para mais informações";
                            break;
                        }
                    }
                
                    default:
                        error = "Sintaxe invalida --help para mais informações";
                    break;
                }
            break;

            case "--bin":

                if (!args[2].isBlank() || !args[3].isBlank() || !args[4].isBlank()) {
                    error = "Sintaxe invalida --help para mais informações";
                }

                
                switch (args[3]) {
                    case "--hex": {

                        String dec = convertToDecimal(args[2], 2);
                        System.out.println(convertDecimal(Integer.valueOf(dec), 16));
                        return;
                    }
                    case "--dec": {
                        String dec = convertToDecimal(args[2], 2);
                        System.out.println(convertDecimal(Integer.valueOf(dec), 10));
                        return;
                    }
                    case "--oct": {
                        String dec = convertToDecimal(args[2], 2);
                        System.out.println(convertDecimal(Integer.valueOf(dec), 8));
                        return;
                    }
                    case "--bin": {
                        String dec = convertToDecimal(args[2], 2);
                        System.out.println(convertDecimal(Integer.valueOf(dec), 2));
                        return;
                    }
                    case "--base": {
                        if(!args[4].isBlank()){
                            String dec = convertToDecimal(args[2], 2);
                            System.out.println(convertDecimal(Integer.valueOf(dec), Integer.valueOf(args[4])));
                            return;
                        }else{
                            error = "Sintaxe invalida --help para mais informações";
                            break;
                        }
                    }
                
                    default:
                        error = "Sintaxe invalida --help para mais informações";
                    break;
                }
            break;

            case "--base":

                if (!args[3].isBlank() || !args[4].isBlank() || !args[5].isBlank()) {
                    error = "Sintaxe invalida --help para mais informações";
                }

                
                switch (args[4]) {
                    case "--hex": {

                        String dec = convertToDecimal(args[3], Integer.valueOf(args[2]));
                        System.out.println(convertDecimal(Integer.valueOf(dec), 16));
                        return;
                    }
                    case "--dec": {
                        String dec = convertToDecimal(args[3], Integer.valueOf(args[2]));
                        System.out.println(convertDecimal(Integer.valueOf(dec), 10));
                        return;
                    }
                    case "--oct": {
                        String dec = convertToDecimal(args[3], Integer.valueOf(args[2]));
                        System.out.println(convertDecimal(Integer.valueOf(dec), 8));
                        return;
                    }
                    case "--bin": {
                        String dec = convertToDecimal(args[3], Integer.valueOf(args[2]));
                        System.out.println(convertDecimal(Integer.valueOf(dec), 2));
                        return;
                    }
                    case "--base": {
                        if(!args[5].isBlank()){
                            String dec = convertToDecimal(args[3], Integer.valueOf(args[2]));
                            System.out.println(convertDecimal(Integer.valueOf(dec), Integer.valueOf(args[5])));
                            return;
                        }else{
                            error = "Sintaxe invalida --help para mais informações";
                            break;
                        }
                    }
                
                    default:
                        error = "Sintaxe invalida --help para mais informações";
                    break;
                }
            break;

            case "--values":

                if (!args[2].isBlank()) {
                    error = "Sintaxe invalida --help para mais informações";
                }else{
                    System.out.println(values(Integer.valueOf(args[2])));
                    return;
                }

            break;
        
            default:

                if (!args[2].isBlank()) {
                    error = "Sintaxe invalida --help para mais informações";
                }

                
                switch (args[2]) {
                    case "--hex": {

                        System.out.println(convertDecimal(Integer.valueOf(args[1]), 16));
                        return;
                    }
                    case "--dec": {
                        System.out.println(convertDecimal(Integer.valueOf(args[1]), 10));
                        return;
                    }
                    case "--oct": {
                        System.out.println(convertDecimal(Integer.valueOf(args[1]), 8));
                        return;
                    }
                    case "--bin": {
                        System.out.println(convertDecimal(Integer.valueOf(args[1]), 2));
                        return;
                    }
                    case "--base": {
                        if(!args[3].isBlank()){
                            System.out.println(convertDecimal(Integer.valueOf(args[1]), Integer.valueOf(args[3])));
                        return;
                        }else{
                            error = "Sintaxe invalida --help para mais informações";
                            break;
                        }
                    }
                
                    default:
                        error = "Sintaxe invalida --help para mais informações";
                    break;
                }
            break;
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

    private static Integer convertCharToNumber(char x){
        if (x >= '0' && x <= '9') {
            return x - '0';
        }else{
            return (x - 'A') + 10;
        }
    }

    private static String convertToDecimal(String in, Integer base){
        List<Integer> numeros = new ArrayList<>();

        in = in.trim();
        for (int i = 0; i < in.length() ; i++) {
            if(convertCharToNumber(in.charAt(i)) < base){
                numeros.add(convertCharToNumber(in.charAt(i)));
            }else{
                throw new IllegalArgumentException("Entrada invalida para a base especificada: " + base);
            }
        }

        Integer resultado = 0;

        int e = 0;

        for (int i = numeros.size() - 1; i >= 0; i --) {
            resultado += numeros.get(i) * (int) Math.pow(base, e);
            e++;
        }

        return resultado.toString();
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
