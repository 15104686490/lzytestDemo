package leetcode;

import java.util.Stack;

public class Hot2 {
    public static void main(String[] args) {

    }

    public static boolean isValid(String s) {
        Stack<Character> temp = new Stack<>();
        if (s == null || s.isEmpty() || s.length() == 1) return false;
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (c == '(' || c == '[' || c == '{') {
                temp.push(c);
            } else {
                if(temp.isEmpty()) return false;
                char sc = temp.pop();
                if ((c == ')' && sc != '(') || (c == ']' && sc != '[') || (c == '}' && sc != '{')) return false;
            }
        }
        return temp.isEmpty();
    }
}
