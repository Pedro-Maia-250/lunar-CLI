package com.lunarvoid.comandos;

import com.lunarvoid.interfaces.Comando;

public class HelpComand implements Comando {
    
    public void execute(String[] args){
        StringBuilder str = new StringBuilder();
        str.append("Lunar - CLI de utilitarios\n")
        .append("\n")
        .append("Uso:\n")
        .append("  lunar --convert <valor-decimal> <destino>\n")
        .append("  lunar --convert <origem> <valor> <destino>\n")
        .append("  lunar --convert --base <base-origem> <valor> <destino>\n")
        .append("  lunar --help\n")
        .append("  lunar --version\n")
        .append("\n")
        .append("Comandos:\n")
        .append("  --convert    Converte numeros entre bases.\n")
        .append("  --help       Mostra esta mensagem de ajuda.\n")
        .append("  --version    Mostra a versao atual do Lunar.\n")
        .append("\n")
        .append("Bases:\n")
        .append("  --bin        Base 2.\n")
        .append("  --oct        Base 8.\n")
        .append("  --dec        Base 10.\n")
        .append("  --hex        Base 16.\n")
        .append("  --base <n>   Base numerica personalizada.\n")
        .append("\n")
        .append("Exemplos:\n")
        .append("  lunar --convert 42 --bin\n")
        .append("  lunar --convert --bin 101010 --dec\n")
        .append("  lunar --convert --hex FF --dec\n")
        .append("  lunar --convert --base 3 102 --hex\n")
        .append("  lunar --convert --dec 255 --base 16\n")
        .append("\n")
        .append("Observacoes:\n")
        .append("  - Valores acima de 9 usam letras maiusculas: A, B, C...\n")
        .append("  - Para executar o JAR diretamente, use: java -jar target/lunar-2.5.2-SNAPSHOT.jar");
        System.out.println(str.toString());
    }
}
