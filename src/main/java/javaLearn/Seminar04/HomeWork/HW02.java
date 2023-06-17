package javaLearn.Seminar04.HomeWork;

import java.util.Stack;

public class HW02 {
    public static void main(String[] args) {
        System.out.println("isValid(\"()\") = " + isValid("()"));
        System.out.println("isValid(\"(){}[]\") = " + isValid("(){}[]"));
        System.out.println("isValid(\"(]\") = " + isValid("(]"));
        System.out.println("isValid(\"({})\") = " + isValid("({})"));
    }


    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            switch (c){
                case '{':
                case '(':
                case '[':
                    stack.push(c);
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') return false;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}
