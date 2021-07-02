package com.stackroute.lamdbaexpression;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFunctionalInterface {
    //write logic to find the values that starts with letter I in the given list
    public List<String> findPattern(List<String> list) {
        List<String> resultList = new ArrayList<>();

        Predicate<String> predicate = values->values.startsWith("I");

        HashSet<String> h = new HashSet<>();

        for (String values:list){
            if (predicate.test(values)&&!h.contains(values)){
                resultList.add(values);
                h.add(values);
            }
        }
        return resultList;

    }
}
