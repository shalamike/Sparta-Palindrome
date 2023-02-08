package org.example;

import org.junit.platform.commons.util.StringUtils;

import java.util.Arrays;

public class Pallindrome {



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

    //Method 1
    public String sequenceOfPalindromes(String sentence){
        String[] wordArray = sentence.split(" ");
        String palindromeSequence = "";
        for (String word : wordArray){
            if (isAPalindrome(word))
                palindromeSequence += word + " ";
        }
        return palindromeSequence;
    }
    public String longestWordInSentance(String sentance){
        String currentLongestWord = "";
        if (!sentance.isBlank() && sentance.length()<3){
            return null;
        }
        else{
            String[] words = sentance.split(" ");
            for (String word : words){
                if (word.length() > currentLongestWord.length()){
                    currentLongestWord = word;
                }
            }
            return currentLongestWord;
        }

    }

    public String longestPalindrome(String sentance){
        if (!sentance.isBlank()){
            String palindromesInSentence = sequenceOfPalindromes(sentance);
            return longestWordInSentance(palindromesInSentence);
        }
        else {
            return "invalid string";
        }
    }




}
