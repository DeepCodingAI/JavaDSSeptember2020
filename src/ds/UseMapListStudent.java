package ds;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UseMapListStudent {
    public static void main(String[] args) {
        List<Student> mathCourseStudentsList = new ArrayList<Student>();
        mathCourseStudentsList.add(new Student(101,"Jon Doe", "10-22-1990"));
        mathCourseStudentsList.add(new Student(102,"Mike Blah", "11-02-1998"));
        mathCourseStudentsList.add(new Student(103,"Marc Jonathan", "01-20-1980"));

        List<Student> computerProgCourseStudentsList = new ArrayList<Student>();
        computerProgCourseStudentsList.add(new Student(109,"Anthony Lao", "12-13-1999"));
        computerProgCourseStudentsList.add(new Student(102,"Mike Blah", "11-02-1998"));
        computerProgCourseStudentsList.add(new Student(103,"Marc Jonathan", "01-20-1980"));

        Map<Integer, List<Student>> map = new LinkedHashMap<Integer,List<Student>>();
        map.put(1, mathCourseStudentsList);
        map.put(2,computerProgCourseStudentsList);

        for(Map.Entry<Integer, List<Student>> iterate:map.entrySet()){
            for(int i=0; i<iterate.getValue().size(); i++) {
                System.out.println("Course Number: " + iterate.getKey() + " --> "
                                                     + iterate.getValue().get(i).getStId()+ " "
                                                     + iterate.getValue().get(i).getStName()+ " "
                                                     + iterate.getValue().get(i).getStDOB()+ " ");
            }
        }
    }
}
