package com.z.algos;

import java.util.*;

public class ReverseString {

    public String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        return sb.toString();
    }

    public String reverseTwo(String s) {
        String reversedString = "";
        for(int i=s.length()-1; i>=0; i--){
            reversedString = reversedString + s.charAt(i);
        }
        return reversedString;
    }
}
