package cracking_the_coding_interview;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PermutationsOfAStringInsideStringTest {

    private PermutationsOfAStringInsideString permutationsOfAStringInsideString;

    @Before
    public void setup() {
        permutationsOfAStringInsideString = new PermutationsOfAStringInsideString();
    }

    @Test
    public void should_correctly_return_the_single_permutation() {
        String permutation = "car";
        String fullLengthWord = "yraccu";
        assertEquals(new ArrayList<String>() {{
            add("rac");
        }}, permutationsOfAStringInsideString.calculate(permutation, fullLengthWord));
    }

    @Test
    public void should_correctly_return_multiple_permutations() {
        String permutation = "dog";
        String fullLengthWord = "gododg";
        assertEquals(new ArrayList<String>() {{
            add("god");
            add("odg");
        }}, permutationsOfAStringInsideString.calculate(permutation, fullLengthWord));
    }

    @Test
    public void should_correctly_return_matching_length_word_permutation() {
        String permutation = "chris";
        String fullLengthWord = "sirhc";
        assertEquals(new ArrayList<String>() {{
            add("sirhc");
        }}, permutationsOfAStringInsideString.calculate(permutation, fullLengthWord));
    }

    @Test
    public void should_correctly_return__no_matching_permutations() {
        String permutation = "elf";
        String fullLengthWord = "flfgeeee";
        assertEquals(new ArrayList<String>() {{
        }}, permutationsOfAStringInsideString.calculate(permutation, fullLengthWord));
    }
}
