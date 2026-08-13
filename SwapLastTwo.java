import java.util.Arrays;

public class SwapLastTwo {

    public static int[] swapLast(int arr []){
        
        int left = 0;
        int right = arr.length-1;

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        return arr;
        

    }
    public static void main(String[]args) {

        int arr[] = {1,3,4,5,6,7};

        swapLast(arr);
        

        for(int i=0; i<arr.length; i++){
            System.out.print(Arrays.toString(arr));
        }
    }
}
