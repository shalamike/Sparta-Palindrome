package org.example;

import java.util.ArrayList;

public class Pallindrome2 {
    public Boolean isAPalindrome(String word){
        String reversedWord = wordToReverse(word);
        if (word.equals(reversedWord))
            return true;
        else
            return false;
    }

    public String wordToReverse(String word){
        return new StringBuilder(word).reverse().toString();
    }

    public ArrayList<String> listOfPalindromes(String sentence){
        ArrayList<String> listOfPalindromes = new ArrayList<String>();
        String[] wordsInSentence = sentence.split(" ");
        for(String word : wordsInSentence){
            if (isAPalindrome(word)){
                listOfPalindromes.add(word);
            }

        }
        return listOfPalindromes;
    }

    public String longestWordInList(ArrayList<String> wordList){
        String currentLongestWord = "";
        for(String word: wordList){
            if (word.length() > currentLongestWord.length())
                currentLongestWord = word;
        }
        return currentLongestWord;
    }

    public String longestPalindromeInSentence(String sentence){
        ArrayList<String> listOfPalindromes = listOfPalindromes(sentence);
        return longestWordInList(listOfPalindromes);
    }
}
