package ds;

import java.util.ArrayList;
import java.util.List;

public class UseForEachLoop {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("NY");
        list.add("PA");
        list.add("AZ");
        list.add("CA");

        for(String st:list){
            System.out.println(st);
        }

    }
}
