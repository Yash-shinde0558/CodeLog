

//Example of polymorphism 
public class PolyMorphism{

    public static class Calculator{

        int a;
        int b;
        int c;

        void add(int a,int b){
            System.out.println("Sum = "+(a+b) );
        }

        void add(int a, int b, int c , int d) { 
            System.out.println("Sum = "+(a+b+c+d));
        }
    }

    public static void main(String[]args) {
        Calculator c1 = new Calculator();

        // c1.add(10,20);
        // c1.add(10,20,30,10); 
    }
}