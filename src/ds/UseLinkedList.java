package ds;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseLinkedList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list.add("Mango");
        list.add("Watermelon");
        list.add("Papaya");

        Iterator it = list.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
