public class oop {


    //Class
    public static class Student{
    String name;
    int rollNo;
    double cgpa;    
    }

    public static void main(String[] args) {
        //Objects
        Student s1 = new Student(); //declaration
        s1.name = "yash";
        s1.rollNo = 13;
        s1.cgpa = 9.5;

        Student s2 = new Student(); //declaration
        s2.name = "Akash";
        s2.rollNo = 34;
        s2.cgpa = 8.0;

        System.out.println(s1.name + " " + s2.name + " " + s2.cgpa);


        // Objects are real life entities.....and class is blueprint
    }
}
