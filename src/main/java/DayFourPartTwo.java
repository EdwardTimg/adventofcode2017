import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class DayFourPartTwo {

    public static void main(String[] args) {
        DayFourPartTwo dayFourPartTwo = new DayFourPartTwo();
        try{
            int nrValidPasscodes = 0;
            BufferedReader reader = new BufferedReader(new FileReader("inputdayfour.txt"));
            String line;
            while((line = reader.readLine())!=null){
                if(dayFourPartTwo.checkValidPasscode(line)){
                    nrValidPasscodes ++;
                }
            }
            System.out.println(nrValidPasscodes);

        }catch (IOException e){
            e.printStackTrace();
        }
    }


    public boolean anagramCompare(String first, String second)
    {
        if(first.length() != second.length()){
            return false;
        }else{
            char[] firstArray = first.toLowerCase().toCharArray();
            char[] secondArray = second.toLowerCase().toCharArray();
            Arrays.sort(firstArray);
            Arrays.sort(secondArray);
            return Arrays.equals(firstArray, secondArray);
            //return firstArray.equals(secondArray);
        }
    }
    public boolean checkValidPasscode(String line){
        String[] values = line.split("\\s+");
        for (int i = 0; i <values.length ; i++) {
            for (int j = 0; j <values.length ; j++) {
                    if(i != j && anagramCompare(values[i], values[j])){
                        return false;
                    }
            }
        }
        return  true;
    }
}
