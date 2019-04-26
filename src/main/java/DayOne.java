import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DayOne {

    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("inputdayone.txt"));
            //String result = "";
            int sum=0;
            String anotherLine = reader.readLine();
                for (int j = 1; j <anotherLine.length(); j ++){
                    if(Character.getNumericValue(anotherLine.charAt(j-1)) == Character.getNumericValue(anotherLine.charAt(j))){
                        sum += Character.getNumericValue((anotherLine.charAt(j)));
                    }
                }
                int stringLenght = anotherLine.length() -1;
                if(Character.getNumericValue(anotherLine.charAt(0))== Character.getNumericValue(anotherLine.charAt(stringLenght))){
                    sum += Character.getNumericValue(anotherLine.charAt(0));
                }

            System.out.println(sum);

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
