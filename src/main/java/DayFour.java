import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DayFour {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Set set = new HashSet<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("inputdayfour.txt"));
            String line;
            int okayPassCode = 0;
            while((line = reader.readLine())!=null){
                String[] values = line.split("\\s+");
                for(String value: values){
                    list.add(value);
                    set.add(value);
                }
                if(set.size() == list.size()){
                    okayPassCode++;
                }
                list.clear();
                set.clear();
            }
            System.out.println(okayPassCode);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
