package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;


public class TwoNumbersSumTest {

    @Test
    public void addTwoNumbers() {
        ArrayList<Integer> firstNum = new ArrayList<Integer>(Arrays.asList(2, 4, 3));
        ArrayList<Integer> secondNum = new ArrayList<Integer>(Arrays.asList(5, 6, 4));
        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(firstNum, secondNum);
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(7, 0, 8));
        Assertions.assertEquals(expected,result);
    }
}
