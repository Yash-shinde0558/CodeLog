
public class maximum {
    public static void main(String[]args) {
        int maxcheck[] = {1 ,2 , -3 ,5 ,6, 8};
        

        int max = Integer.MIN_VALUE;   //Also we can written  int max = maxcheck[0]; 
       
        for(int i=0; i<maxcheck.length; i++) {
           
            if(maxcheck[i]>max)
                max=maxcheck[i];
        }
        System.out.println(max);
        //Max check
    }
    
}
