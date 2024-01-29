package org.example;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.temporal.ChronoField;
import java.util.Random;

public class RecapProject {
    public static void main(String[] args) {
    String password= "aYse123%AS";
    System.out.println(checkPasswordLength(password));
    System.out.println(containsUpperundLowerCase(password));
    System.out.println(checkWeakPassword(password));
    System.out.println(checkSpecialChar(password));
    }
    public static int checkPasswordLength(String password){
        return password.length();
    }
    public static boolean containsUpperundLowerCase(String password){
        boolean wert1= !password.equals(password.toLowerCase());
        boolean wert2= !password.equals(password.toUpperCase());

        if(wert1 && wert2)
            return true;
        else
            return false;
    }
    public static boolean checkWeakPassword(String password){
     boolean hasLower= false;
     boolean hasUpper= false;
     boolean hasDigit=false;
     boolean hasConsecutiveDigit=false;

        for (int i=0;i<password.length();i++){
            char ch = password.charAt(i);
            if(Character.isLowerCase(ch))
                hasLower=true;
            else if(Character.isUpperCase(ch)) {
                hasUpper=true;
            }
            else if(Character.isDigit(ch)){
                hasDigit=true;
            }

        }
        if(hasLower && hasUpper && hasDigit )
           return true;
        else
            return false;
    }
    public static boolean checkSpecialChar(String password){
        int count=0;
        char[] SPECIAL_CHARACTERS = { '~', '`', '!', '@', '#',
                '$', '%', '^', '&', '*', '(', ')', '-', '_', '=', '+', '[', '{',
                ']', '}', '\\', '|', ';', ':', '\'', '"', ',', '<', '.', '>', '/',
                '?' };
        for (int i=0; i<password.length();i++){
            for (int j = 0; j < SPECIAL_CHARACTERS.length ; j++) {
                char ch = password.charAt(i);
                if(password.charAt(i) == SPECIAL_CHARACTERS[j])
                    count++;
            }
        }
        if(count>0)
            return  true;
        else
            return false;
    }
}


