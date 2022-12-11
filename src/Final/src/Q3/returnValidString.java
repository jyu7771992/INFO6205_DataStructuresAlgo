package Q3;

import java.util.ArrayList;
import java.util.Stack;

public class returnValidString {
    private static String returnValidString(String str) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> indexList = new ArrayList<>();
        //go through each string
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(i);
            } else if (str.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    indexList.add(i);
                } else {
                    stack.pop();
                }
            }
        }
        // if stack is not empty keep going
        while (!stack.isEmpty()) {
            indexList.add(stack.pop());
        }
        //
        StringBuilder stringbuilder = new StringBuilder();
        for (int j = 0; j < str.length(); j++) {
            //check if the idx is in indexList or not
            if (!indexList.contains(j)) {
                stringbuilder.append(str.charAt(j)); // add the string
            }
        }
        return stringbuilder.toString();
    }
}

//Time Complexity:
//Space Complexity:
