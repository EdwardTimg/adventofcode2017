import com.sun.source.tree.WhileLoopTree;

import javax.swing.text.StyledEditorKit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class DayFive {
    public static void main(String[] args) {
        DayFive dayFive = new DayFive();
        //Part 1
        System.out.println(dayFive.jump(dayFive.readInputFile("inputdayfive.txt"),true));
        //Part 2
        System.out.println(dayFive.jump(dayFive.readInputFile("inputdayfive.txt"),false));

    }

    public List<Integer> readInputFile(String path){
        List<Integer> list = new ArrayList<>();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;
            while((line = reader.readLine())!=null){
                list.add(Integer.parseInt(line));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return list;
    }


    public int jump(List<Integer>list, Boolean ordinaryIncrement ){
        int posision = 0;
        int nrjump= 0;
        while(posision<list.size()){
            int newPosision = list.get(posision)+ posision;
            if(ordinaryIncrement||list.get(posision)<3){
                list.set(posision, list.get(posision)+1);
            }else{
                list.set(posision, list.get(posision)-1);
            }
            posision = newPosision;
            nrjump ++;
        }
        return nrjump;

    }


}
