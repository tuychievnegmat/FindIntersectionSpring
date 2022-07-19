package com.coderbyte.FindIntersectionSpring.model;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
    public static void main(String[] args) {

    }

    private static List<String> splitMethod(String str){
        List<String> list = new ArrayList<>();
        String filtred = str.replaceAll("[^0-9,]", "");
        String[] numbers = filtred.split(",");
        for (String s : numbers) {
            list.add(s);
        }
        return list;

    }

    public static String findIntersection(String strArr[]){

        List<String> first = splitMethod(strArr[0]);
        List<String> second = splitMethod(strArr[1]);


        first.retainAll(second);

        String text = String.join(",", first);
        if(text.isEmpty() ) return "EMPTY";
        return text;

    }
}
