import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args )
    {
        List<Student> list=new ArrayList<>();
        list.add(new Student("Anubhav",23));
        list.add(new Student("Abhinav",34));
        list.add(new Student("Sakshi",56));
        list.add(new Student("Manu",67));
        list.add(new Student("Yash",23));
        Collections.sort(list);

//        Lambda function printing method...
        
        list.forEach(System.out::println);
    }
}
