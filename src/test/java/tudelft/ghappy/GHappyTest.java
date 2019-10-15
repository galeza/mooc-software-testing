package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class GHappyTest {

    @ParameterizedTest(name = "str={0}, expectedResult={1}")
    @CsvSource({ "'',true","'g',false","'gg',true"  })
    public void inputSmall(String str, boolean expectedResult) {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy(str);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "str={0}, expectedResult={1}")
    @CsvSource({ "'xxggxx',true","'xxggxxgg',true","'ggxxggxx',true"  })
    public void inputWithDoubleGOnDifferentPositionsInTheString(String str, boolean expectedResult) {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy(str);
        Assertions.assertEquals(expectedResult, result);
    }
    @ParameterizedTest(name = "str={0}, expectedResult={1}")
    @CsvSource({ "'xxgxx',false","'gxx',false","'vvxxg',false"  })
    public void inputWithSingleGOnDifferentPositionsInTheString(String str, boolean expectedResult) {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy(str);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "str={0}, expectedResult={1}")
    @CsvSource({ "'xxggyygxx',false","'gyyggxx',false","'ggxxg',false"  })
    public void inputWithDoubleSingleGOnDifferentPositionsInTheString(String str, boolean expectedResult) {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy(str);
        Assertions.assertEquals(expectedResult, result);
    }
}
