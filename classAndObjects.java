
// public static class Student{
//        String name;
//        int rollNo;
//        double cgpa;    
//        //Method inside a class
//        void print() {
//         System.out.println(name+ " " + rollNo + " " + cgpa);    
//        }
//     }
       //We written outside public class when we want to pass class in another file 



public class classAndObjects {

    public static class Student{
       String name;
       int rollNo;
       double cgpa;    
       //Method inside a class
       void print() {
        System.out.println(name+ " " + rollNo + " " + cgpa);    
       }
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

        // System.out.println(s1.name + " " + s2.name + " " + s2.cgpa);

        s1.print();
        s2.print();

        
    }
}
