package com.zipcodewilmington.assessment1.part5;

import java.util.ArrayList;
import java.util.Arrays;

public class Palindrome {

    public Integer countPalindromes(String input) {
        Integer counter = 0;
        String[] allSubStrings = Palindrome.getSubStrings(input);
        for(int index = 0; index < allSubStrings.length; index++) {
            if(Palindrome.isPalindrome(allSubStrings[index])) {
                counter++;
            }
        }
        return counter;
    }

    public static String[] getSubStrings(String input) {
        ArrayList<String> allSubStrings = new ArrayList<>();
        for(int index = 0; index < input.length(); index++) {
            for(int index2 = index + 1; index2 <= input.length(); index2++) {
                allSubStrings.add(input.substring(index, index2));
            }
        }
        String[] subStringArray = new String[allSubStrings.size()];
        subStringArray = allSubStrings.toArray(subStringArray);
        return subStringArray;
    }

    public static boolean isPalindrome(String s) {
        if(Palindrome.reverseString(s).equals(s)) {
            return true;
        } else {
            return false;
        }
    }

    public static String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(Arrays.toString(palindrome.getSubStrings("aaa")));

        System.out.println(palindrome.isPalindrome("bAA"));
    }
}
