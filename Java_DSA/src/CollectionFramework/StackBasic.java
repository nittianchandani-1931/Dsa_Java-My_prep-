package CollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackBasic {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(90);
        stack.push(34);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
    }
}
