package HelperClasses;

import java.util.regex.Pattern;
import javax.swing.JLabel;

public class Validation {

    public static boolean isInteger(String query) {
        return Pattern.matches("[1-9][0-9]+|0", query);
    }
    
    public static boolean isWord(String query){
        return Pattern.matches("[a-zA-Z]+", query);
    }
    
    public static boolean isEmail(String query){
        return Pattern.matches("^(.+)@(.+)$", query);
    }
}