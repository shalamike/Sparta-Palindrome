import org.example.Pallindrome;
import org.example.Pallindrome2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UnitTests2 {

    @ParameterizedTest
    @DisplayName("palindromes")
    @ValueSource(strings = {"racecar", "deified", "rotator", "deed", "wow"})
    public void GivenAValidPalindrome_ReturnTrue(String word){
        Pallindrome2 paliWord = new Pallindrome2();
        Boolean actual = paliWord.isAPalindrome(word);
        Assertions.assertTrue(actual);
    }

    //bad practice using assert false below
    @ParameterizedTest
    @DisplayName("not palindromes")
    @ValueSource(strings = {"holiday", "world", "state", "dead", "won"})
    public void GivenAnInvalidPalindrome_ReturnTrue(String word){
        Pallindrome2 paliWord = new Pallindrome2();
        Boolean actual = paliWord.isAPalindrome(word);
        Assertions.assertFalse(actual);
    }

    @Test
    @DisplayName("longest palindrome in sentence")
    public void LongestPalindromeInSentence1(){
        Pallindrome2 pallindrome = new Pallindrome2();
        String sentence = "i want to kayak today but the deed is done";
        String longestPalindrome = pallindrome.longestPalindromeInSentence(sentence);
        String actualLongestPalindrome = "kayak";
        Assertions.assertEquals(longestPalindrome,actualLongestPalindrome );
    }

    @ParameterizedTest
    @DisplayName("the longest palindrome in these sentences should be tattarrattat")
    @ValueSource(strings = {"i had a tattarrattat today inviting me to drive a racecar",
            "I want to tattarrattat a kayak",
            "kayak repaper tattarrattat wow noon"})
    public void LongestPalindromeInSentencesShouldBeTattarrattat(String sentence){
        Pallindrome2 pallindrome = new Pallindrome2();
        String actualLongestPallindrome ="tattarrattat";
        String longestPalindrome = pallindrome.longestPalindromeInSentence(sentence);
        Assertions.assertEquals(actualLongestPallindrome, longestPalindrome);

    }

//    @Test
//    @DisplayName("testing lonest words")
//    public void LongestWordInSentence(){
//        Pallindrome2 palindrome = new Pallindrome2();
//        String sentence = kayak, repaper, tattarrattat, wow, noon"
//    }
}
