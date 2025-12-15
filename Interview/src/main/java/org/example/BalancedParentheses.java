package org.example;

import java.util.Stack;

public class BalancedParentheses {

    public static void main(String[] args) {

        String str = "{[])}";
        Stack<Character> stack = new Stack<>();

        boolean isBalanced = true;

        for (char ch : str.toCharArray()) {

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {

                // Stack empty → invalid
                if (stack.isEmpty()) {
                    isBalanced = false;
                    break;
                }

                char top = stack.pop();

                // Matching check
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    isBalanced = false;
                    break;
                }
            }
        }

        // Final check
        if (!stack.isEmpty()) {
            isBalanced = false;
        }

        if (isBalanced) {
            System.out.println("Balanced Parentheses");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
