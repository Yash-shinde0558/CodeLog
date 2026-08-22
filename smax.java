import java.nio.channels.Pipe.SourceChannel;

public class smax {

    public static void Check(int[] maxcheck){
 
        int max = Integer.MAX_VALUE;
        int smax = Integer.MAX_VALUE;

        for(int i=0; i<maxcheck.length; i++){
            if(maxcheck[i]<max){
                max = maxcheck[i];
            }
        }

        for(int i=0; i<maxcheck.length; i++){
            if(maxcheck[i] < smax && maxcheck[i] != max ){
                smax = maxcheck[i];
            }
        }
        System.out.println(max);
        System.out.println(smax);

    }
   
    public static void main(String[]args) {
        
        int[] maxcheck = {4, 10, 10, 8, 3, 8};
        Check(maxcheck);
    }
}



//   public static void check(int[]  maxcheck) {

//          int max = Integer.MIN_VALUE;  
//          int smax = Integer.MIN_VALUE;

//         for(int i=0; i<maxcheck.length; i++) {
//             if(maxcheck[i]>max)
//                 max=maxcheck[i];
//         }
        
//          for(int i=0; i<maxcheck.length; i++) {
//             if(maxcheck[i]>smax && maxcheck[i]!=max)
//                 smax=maxcheck[i];
           
//         }
//         System.out.println(max);
       
//         // return max;
    
//     }
