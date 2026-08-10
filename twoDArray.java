import java.util.Scanner;

public class twoDArray {

   
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [][] numbers = new int[rows][cols];

        //Rows
        for(int i=0; i<rows ; i++) {
            //Cols
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

          //Rows
        for(int i=0; i<rows ; i++) {
            //Cols
            for(int j=0; j<cols; j++){
                System.out.println(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
