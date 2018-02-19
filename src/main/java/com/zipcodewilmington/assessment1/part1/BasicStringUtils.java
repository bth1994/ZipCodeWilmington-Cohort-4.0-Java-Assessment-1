package com.zipcodewilmington.assessment1.part1;

import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder reversedString = new StringBuilder();
        reversedString.append(str);
        return reversedString.reverse().toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String reversedString = BasicStringUtils.reverse(str);
        return reversedString.substring(0, 1).toUpperCase() + reversedString.substring(1);
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return str.substring(1, str.length() - 1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String[] strSplit = str.split("");
        for(int i = 0; i < strSplit.length; i++) {
            if(strSplit[i] == strSplit[i].toLowerCase()) {
                strSplit[i] = strSplit[i].toUpperCase();
            } else {
                strSplit[i] = strSplit[i].toLowerCase();
            }
        }
        return String.join("", strSplit);
    }
}
