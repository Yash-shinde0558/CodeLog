import java.util.*;

public class arrays {

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int rohan[] = new int[7] ;
        
        //take inputt
        for(int i=0; i<7 ; i++){
            rohan[i] = sc.nextInt();
        }

        //Print Outputt
        for(int i=0; i<7; i++) {
            System.out.print(rohan[i]*2);
        }

    }

}