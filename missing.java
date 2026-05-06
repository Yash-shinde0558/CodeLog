public class missing {
    public static int missing(int arr[]) {               
        long n = arr.length + 1;
        long sum = n*(n+1)/2;
        long arraySum = 0;
        for(int ele: arr) {
            arraySum += ele;
        }
        return (int) (sum - arraySum);
    } 

    public static void main(String []args) {
        int arr[] = {1, 2, 3, 5};

        int result =  missing(arr);
        System.out.println(result);
    }
}
