import java.util.Scanner;

public class Palindrome {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        if( num % 2 == 0 ){

            System.out.println(num + " Number is even...");

        }else{

            System.out.println(num + " Number is odd....");

        }





    }
}
