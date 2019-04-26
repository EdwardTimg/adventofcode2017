import com.sun.source.tree.WhileLoopTree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class DayFive {

    public static void main(String[] args) {
        DayFive dayFive = new DayFive();
        System.out.println(dayFive.jump(dayFive.readInputFile("inputdayfive.txt")));
        System.out.println(dayFive.Jumpoffsetchange(dayFive.readInputFile("inputdayfive.txt")));
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

    public int jump(List<Integer> list){
        int posision = 0;
        int nrjump = 0;
        while (posision < list.size()){
            int newPosision = posision + (list.get(posision));
            list.set(posision, list.get(posision)+1);
            posision = newPosision;
            nrjump++;
        }
        return nrjump;
    }

    public int Jumpoffsetchange(List<Integer>list){
        int posision = 0;
        int nrjump= 0;
        while(posision<list.size()){
            int newPosision = list.get(posision)+ posision;
            if(list.get(posision)<3){
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
