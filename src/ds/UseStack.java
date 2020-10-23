package ds;

import java.util.Iterator;
import java.util.Stack;

public class UseStack {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Plate-1");
        stack.push("Plate-2");
        stack.push("Plate-3");
        stack.push("Plate-4");
        stack.push("Plate-5");

        for(int i=stack.size(); i>0; i--){
            System.out.println("Peek Element: " + stack.peek());
            System.out.println(stack.pop());
        }
    }
}
