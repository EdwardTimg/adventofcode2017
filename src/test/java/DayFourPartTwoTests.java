


import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;


public class DayFourPartTwoTests {
    DayFourPartTwo dayFourPartTwo = new DayFourPartTwo();
    @Test
    public void anagramCompare_NoAnagram(){

        assertFalse( dayFourPartTwo.anagramCompare("abcde","fghij"));
    }
    @Test
    public void anagramCompare_Anagram(){

        assertTrue( dayFourPartTwo.anagramCompare("aa","aa"));
    }

    @Test
    public void checkPasscode_Valid(){
        assertTrue(dayFourPartTwo.checkValidPasscode( "aa bb cc dd ee"));
    }
    @Test
    public void checkPasscode_inValid(){
        assertFalse(dayFourPartTwo.checkValidPasscode( "aa bb cc dd aa"));
    }



}

