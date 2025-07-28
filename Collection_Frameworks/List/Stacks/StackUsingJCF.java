package Stacks;

import java.util.Stack;

public class StackUsingJCF {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(40);
        s.push(20);
        s.push(0);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < s.size(); i++) {
            if (max < s.get(i)) {
                max = s.get(i);
            }
        }
        System.out.println("Max is : " + max);
    }
}
