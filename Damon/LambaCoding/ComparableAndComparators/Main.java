import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

//     static class sort implements Comparator<Student>
//    {
//
//
//        @Override
//        public int compare(Student o1, Student o2) {
//            if(o1.marks==o2.marks)
//            {
//                return o1.name.compareTo(o2.name);
//            }
//            else
//            {
//                return o1.marks-o2.marks;
//            }
//        }
//    }
    public static void main(String[] args )
    {
        List<Student> list=new ArrayList<>();
        list.add(new Student("Anubhav",23));
        list.add(new Student("Abhinav",34));
        list.add(new Student("Sakshi",56));
        list.add(new Student("Manu",67));
        list.add(new Student("Yash",23));
        Collections.sort(list, (a,b)-> a.marks==b.marks ? a.name.compareTo(b.name) : b.marks-a.marks);

//        Lambda function printing method...
        
        list.forEach(System.out::println);
    }
}
