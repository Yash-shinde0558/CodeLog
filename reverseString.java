import java.util.Scanner;


public class reverseString {

    public static void main(String[]args) {
 
        int []  nums = {1, 2, 3, 4 ,5 };

        System.out.print("Normal elements : ");
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }

        int left = 0;
        int right = nums.length-1;

        while (left <= right) {

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        System.out.println();
        System.out.print("Reverses elements : ");
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}