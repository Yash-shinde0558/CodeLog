class Students{

    String name = "yash";   //null
    private int rno = 87;   //0
    double cgpa;   //0.0

     void print(){
        System.out.println(name+" "+cgpa+" "+rno);
    }

    // public void p(){
    //     print();
    // }


}

public class PrivateKeyword {
    public static void main(String[]args) {
        Students s1 = new Students();
        s1.print();  //itsw print direct from class data
        s1.cgpa = 8.9;
        s1.name = "Hemant";
        //s1.rno = 10;    //its giving error because it is private data member 
        s1.print();  //its printing after change 
        

        Students s2 = new Students();
        s2.print();

    }
}
