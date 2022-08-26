package educ.leet_code.easy.valid_parentheses;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        System.out.println(isValid("((){}){}"));

    }


    public static boolean isValid(String s) {

        if(s.length()%2 != 0) return false;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if(stack.empty()){
                stack.push(s.charAt(i));
                continue;
            }

            char current = s.charAt(i);

            if(!stack.empty()){

                if(stack.peek() == '{' && current == '}' ||
                        stack.peek() == '[' && current == ']'||
                        stack.peek() == '(' && current == ')'){

                    stack.pop();

                }else {

                    stack.push(current);

                }

            }
        }

        if(!stack.empty()) return false;

        return true;
    }
}
