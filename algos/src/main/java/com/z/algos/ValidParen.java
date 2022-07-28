package com.z.algos;

import java.util.*;

public class ValidParen {

    public boolean isValid(String input) {
        Stack<Character> stack = new Stack<>();
        for(char c : input.toCharArray()) {
            if(c == '(') {
                stack.push(')');
            }
            else if(stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
