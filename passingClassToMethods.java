

public class passingClassToMethods {

    public static class Car{
        int seats;
        String name;
        double length;
        String type;
        int torque;

    }
    public static void main(String[] args){

        // Student s1 = new Student(); 
        
        Car c = new Car();
        c.length = 3.99;
        c.name = "Kia Seltos";
        c.seats = 5 ;
        c.type = "SUV";
        c.torque = 178;

        change(c);
        System.out.println(c.seats);

    }

        public static void change(Car c) {
            c.seats = 4;
        }
}
