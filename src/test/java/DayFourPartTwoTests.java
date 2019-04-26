import org.junit.Test;

import static junit.framework.Assert.assertFalse;


public class DayFourPartTwoTests {
    @Test
    public void anagramCompare(){
        DayFourPartTwo dayFourPartTwo = new DayFourPartTwo();
        assertFalse( dayFourPartTwo.anagramCompare("abcde","fghij"));


    }
}

