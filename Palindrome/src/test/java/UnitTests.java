import org.example.Pallindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UnitTests {

    @ParameterizedTest
    @DisplayName("palindromes")
    @ValueSource(strings = {"racecar", "deified", "rotator", "deed", "wow"})
    public void GivenAValidPalindrome_ReturnTrue(String word){
        Pallindrome paliWord = new Pallindrome();
        Boolean actual = paliWord.isAPalindrome(word);
        Assertions.assertTrue(actual);
    }

    //bad practice using assert false below
    @ParameterizedTest
    @DisplayName("not palindromes")
    @ValueSource(strings = {"holiday", "world", "state", "dead", "won"})
    public void GivenAnInvalidPalindrome_ReturnTrue(String word){
        Pallindrome paliWord = new Pallindrome();
        Boolean actual = paliWord.isAPalindrome(word);
        Assertions.assertFalse(actual);
    }

    @Test
    @DisplayName("longest palindrome in sentence")
    public void LongestPalindromeInSentence1(){
        Pallindrome pallindrome = new Pallindrome();
        String sentence = "i want to kayak today but the deed is done";
        String longestPalindrome = pallindrome.longestPalindrome(sentence);
        String actualLongestPalindrome = "kayak";
        Assertions.assertEquals(longestPalindrome,actualLongestPalindrome );
    }

    @ParameterizedTest
    @DisplayName("the longest palindrome in these sentences should be tattarrattat")
    @ValueSource(strings = {"i had a tattarrattat today inviting me to drive a racecar",
            "I want to tattarrattat a kayak",
            "kayak, repaper, tattarrattat, wow, noon"})
    public void LongestPalindromeInSentencesShouldBeTattarrattat(String sentence){
        Pallindrome pallindrome = new Pallindrome();
        String actualLongestPallindrome ="tattarrattat";
        String longestPalindrome = pallindrome.longestPalindrome(sentence);
        Assertions.assertEquals(actualLongestPallindrome, longestPalindrome);

    }


}
