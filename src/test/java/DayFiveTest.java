import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class DayFiveTest {
    DayFive dayFive = new DayFive();


    @Test
    public void jump(){
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(0, 3, 0, 1, -3));
        assertTrue(dayFive.jump(list) == 5);
    }

    @Test
    public void readInputFile(){
        assertTrue(dayFive.readInputFile("inputdayfive.txt").size() > 0);
    }


}
