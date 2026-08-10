import java.util.Scanner;

public class basicArray {
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = sc.nextInt();
        int numbers[] = new int [size];

        //input
        for(int i = 0; i < size; i++ ){
            numbers[i] = sc.nextInt();
        } 

        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
