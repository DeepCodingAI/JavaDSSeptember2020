package ds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseIterator {
    public static void main(String[] args) {
        //Store Integer Value
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(15);
        list.add(8);

        Iterator it = list.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //Store String Value
        List<String> listOfString = new ArrayList<String>();
        listOfString.add("Mango");
        listOfString.add("Watermelon");
        listOfString.add("Papaya");

        Iterator iterator = listOfString.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Store Student data type
        List<Student> listOfStudent = new ArrayList<Student>();
        listOfStudent.add(new Student(101,"Jon Doe", "10-22-1990"));
        listOfStudent.add(new Student(102, "Dave Rose", "09-12-1970"));
        listOfStudent.add(new Student(103, "Kate Jonson", "08-20-1985"));

        Iterator itr = listOfStudent.listIterator();
        while(itr.hasNext()){
            Student student = (Student)itr.next();
            System.out.println(student.getStId()+ " "+ student.getStName()+ " "+ student.getStDOB());
        }


    }
}
