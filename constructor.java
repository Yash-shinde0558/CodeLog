import javax.xml.stream.events.StartDocument;

public class constructor{

    public static class Student{
        String name;
        int age;

        void printInfo() {
            System.out.println(this.name);
            System.out.println(this.age);
        }


        //Non Parametarised constructor
        // Student() {
        //     System.out.println("Constructor call");
        // }

        //parameterised constructor 
        // Student(String name, int age ){
        //     this.name = name;
        //     this.age = age; 
        // }

        //Copy constructor
        //Copy from one object and paste it tpo another object
        Student(Student s2){
            this.name = s2.name;
            this.age = s2.age;
        }

        Student(){
            
        }


    }
    public static void main(String[]args) {
        
        Student s1 = new Student();
        s1.name = "yash";
        s1.age = 21;

        Student s2 = new Student(s1);
        s2.printInfo();
        
        

    }
}