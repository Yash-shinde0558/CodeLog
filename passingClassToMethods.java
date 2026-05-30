
// Problem
// A car showroom wants to store:
// Car brand
// Car model
// Car price
// The car should be able to:
// Start
// Stop
// Display details    
public class passingClassToMethods {

        public static class car{
        
            //Data Members 
            String carBrand;
            String model;
            double price;

            void start(){
                System.out.println(model + " is started... ");
            }

            void stop(){
                System.out.println(model + " is stop... ");
            }

            void carDetails(){
                System.out.println("Car Brand" + carBrand);
                System.out.println(model);
                System.out.println(price);
            }
        }

    public static void main(String[] args){

        //Object-1
        car c1 = new car();

        c1.carBrand = "BMW";
        c1.model = "BMW M5";
        c1.price = 20000000;

        //Object-2
        car c2 = new car();
        
        c2.carBrand = "Hyundai";
        c2.model = " i20 Active";
        c2.price = 100000;

        // Using Methods 

        //For object-1
        c1.start();
        c1.stop();
        c1.carDetails();

        //For object-2
        c2.start();
        c2.stop();
        c2.carDetails();



    }
}