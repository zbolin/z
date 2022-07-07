package com.z.algos;

import java.util.*;
public class MissingNumber {

    public int findMissingNumber(String s) {
        String[] arr = s.replaceAll("\\[","").replaceAll("\\]","").split(",");

        Integer[] values = Arrays.stream(arr)
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        Arrays.sort(values);
        for(int i=0; i<values.length; i++) {
            // next digit must be one larger

            if(i!=values.length-1) {
                int expected = values[i] +1;
                int actual = values[i+1];
                if(expected != actual) {
                    return expected;
                }
            }
            else {
                //do nothing?
            }
        }
        return -1;
    }
}
