import java.util.Scanner;


public class reverseString {

    public static void main(String[]args) {
        System.out.println();

        Scanner sc = new Scanner(System.in);

        //Define array Size
        int [] arr = new int[5];
        
        //Take input from user
        System.out.print("Enter a element : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println();

        System.out.print("Normal Array : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

        System.out.println();
        
        int left = 0;
        int right = arr.length-1;

        while(left<right){

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println();
        System.out.print("Reverse Array : ");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        System.out.println();
        
    }
}
