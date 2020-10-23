package ds;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.add("Jon");
        queue.add("Papia");
        queue.add("Saleh");
        queue.add("David");
        queue.add("Mike");

        Iterator it = queue.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
