package com.edward.adventofcode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DayTwo {
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
                int min = list.get(0);
                int max= list.get(0);
                for(int i = 0; i< list.size(); i++)
                {
                    if(list.get(i)>max)
                    {
                        max = list.get(i);
                    }
                    if(list.get(i)<min) {
                        min = list.get(i);
                    }

                }
                list.clear();
                sumdif += (max -min);

            }
            System.out.println(sumdif);
            System.out.println(list.size());


        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
