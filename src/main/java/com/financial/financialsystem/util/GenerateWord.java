package com.financial.financialsystem.util;

public class GenerateWord {

    public static String generateWord(){
        StringBuffer buff = new StringBuffer();
        String chars = "abcdefghijklmnopqrstuvwxyz";
        buff.append(chars.charAt((int)(Math.random() * 26)));
        return  buff.toString();
    }

}
