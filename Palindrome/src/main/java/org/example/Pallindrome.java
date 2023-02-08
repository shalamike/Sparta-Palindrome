package org.example;

import java.util.Arrays;

public class Pallindrome {

    //Method 1
    public String sequenceOfPalindromes(String sentence){
        return null;
    }

    public String[] createArrayOfPalindromes(String palindromeSequence){
        return null;
    }

    public String longestPalindrome(String[] palindromeArray){
        return null;
    }

    //method 2 using arrayList to eliminate the need to create a list of palindromes

    public Boolean isAPalindrome(String word){
        String reversedWord = wordToReverse(word);
        if (word.equals(reversedWord))
            return true;
        else
            return false;
    }

    public String wordToReverse(String word){
        String reversedWord = "";
        for(int i = word.length() -1; i>= 0; i--)
            reversedWord += word.charAt(i);
        return reversedWord;
    }
}
