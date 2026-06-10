


    class Student{ //class
    String name;
    int age;
    //Function overloading means same name function is create in one class 

    //Functions return types should be different 
    //If same return types then parameters should be differnt 

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name , int age){
        System.out.println(name + " " + age);
    }
}

    public class PolyMorphism{ //File name
    public static void main(String[]args){
        //Object1 
        Student s1 = new Student();
        s1.name = "Yash";
        s1.age = 21;

        s1.printInfo(s1.name,s1.age);

    }
    
}