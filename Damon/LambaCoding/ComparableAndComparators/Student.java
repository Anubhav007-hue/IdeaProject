
//Implementing a Comparable class of type student ...

public class Student  implements Comparable<Student>{
    int marks;
    String name;
    

    public Student(String name, int marks) {
        this.name=name;
        this.marks=marks;
    }

    public void setMarks(int marks)
    {
        this.marks=marks;
    }

    public int getMarks()
    {
        return marks;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }

    @Override
    public String toString() {
        return
                "marks=" + marks +
                ", name='" + name + '\''
                ;
    }
//This method compares two objects which include three cases ..
//    1.If we are returning a positive then the current object 'o' we have passed is smaller .
//    2.If we are returning a negative then the current object 'o' we have passed is bigger .
//    3.If we are returning '0' then the both objects are equal.

//    THIS IS THE SORTING BASED ON THE DECREASING ORDER ........
//    TO DO THE SORTING BASED ON THE INCREASING ORDER JUST FLIP THE POSITION OF THE -1 AND 1...


    @Override
    public int compareTo(Student obj) {
        if(this.marks > obj.marks)
        {
            return -1;
        }
        else if(this.marks<obj.marks)
        return 1;

        return this.name.compareTo(obj.name);
    }

//    Getters and Setters are used to encapsulate the data
//    .i.e it can only be accessed by the public class.............................

}
