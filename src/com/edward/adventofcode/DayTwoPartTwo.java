package com.edward.adventofcode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DayTwoPartTwo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        try{
            BufferedReader reader = new BufferedReader(new FileReader("inputdaytwo.csv"));
            int sumdif = 0;
            String line;
            while((line = reader.readLine())!=null)
            {
                String[] values = line.split("\\s+");
                for(String value: values){
                    list.add(Integer.parseInt(value));
                }

                for(int i = 0; i< list.size(); i++)
                {
                    for(int j = 0; j<list.size(); j++){
                        if(list.get(i) % list.get(j)== 0&& list.get(i)!=list.get(j)){
                            sumdif += (list.get(i)/list.get(j));
                        }
                    }

                }
                list.clear();
            }
            System.out.println(sumdif);
            System.out.println(list.size());


        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
