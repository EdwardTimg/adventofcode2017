import java.util.Arrays;

public class DayFourPartTwo {

    //here will be some code
    // here will there be more code


    public boolean anagramCompare(String first, String second)
    {
        if(first.length() != second.length()){
            return false;
        }else{
            char[] firstArray = first.toLowerCase().toCharArray();
            char[] secondArray = second.toLowerCase().toCharArray();
            Arrays.sort(firstArray);
            Arrays.sort(secondArray);
            return firstArray.equals(secondArray);
        }
    }
}
