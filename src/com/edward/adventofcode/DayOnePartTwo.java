package com.edward.adventofcode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DayOnePartTwo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> newlist = new ArrayList<>();
        try{
            BufferedReader reader = new BufferedReader(new FileReader("inputdayone.txt"));
            int sum=0;
            String anotherLine = reader.readLine();
            for (int j = 0; j <anotherLine.length(); j ++){
                list.add(Character.getNumericValue(anotherLine.charAt(j)));
            }

            for(int i = 0; i < list.size(); i ++){
                int indexHalflist = list.size()/2+ i;
                if(indexHalflist >= list.size())
                {
                    indexHalflist = indexHalflist -list.size();
                }
                if(list.get(i) == list.get(indexHalflist)){
                    sum += list.get(i);
                }
            }
            System.out.println(sum);



        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
