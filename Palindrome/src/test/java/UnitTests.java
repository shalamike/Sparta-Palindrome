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

    @ParameterizedTest
    @DisplayName("not palindromes")
    @ValueSource(strings = {"holiday", "world", "state", "dead", "won"})
    public void GivenAnInvalidPalindrome_ReturnTrue(String word){
        Pallindrome paliWord = new Pallindrome();
        Boolean actual = paliWord.isAPalindrome(word);
        Assertions.assertFalse(actual);
    }

}
