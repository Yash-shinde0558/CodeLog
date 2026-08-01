// import java.util.*;
// public class practice {
//     public static void main(String[]args) {

//         Logic 
//         SUM_OF_DIGITS
//         int num = 123456;
//         int sum = 0;

//         while(num>0) {
            
//             sum = sum + num % 10; // here we get reminder of int 
//             num = num/10; // here we get quotient 
//         }
//         System.out.println("Sum of digits : " + sum);




//         CHECK_PRIME_NUMBER
//         int num = 3;
//         int count = 0;


//         if(num>1)
//         {
//             for(int i=1; i<=num; i++) 
//             {
//                 if(num % i == 0)
//                     count++;
//             }
//             if (count == 2) 
//             {
//                 System.out.println("prime number");
//             }
//             else
//             {
//                 System.out.println("Not prime number");
//             }
//         }
//         else
//         {
//             System.out.println("Not prime number");
//         }



//         REVERSE A NUMBER 

//         Scanner sc = new Scanner(System.in);

//         int num = sc.nextInt();
//         System.out.println("Enter a number : ");

//         int rev = 0;
        
//         while(num != 0) {

//             rev = rev*10 + num % 10;  //40  // 43+2 //432
//             num = num / 10; //123 //12
//         }
//         System.out.println(rev);
        


//         SUM_of_Digits 
//         int num = 12345;
//         int sum = 0;

//         while(num>0) {

//             sum = sum + num % 10;    //4 // 3 //2 //1 //4+3+2+1=10
//             num = num/10; // 1234 //123 //12 //1
//         }
//         System.out.println("Sum of digits : " + sum);

//         // SUM_of_Digits
//         // Sum of digits
//         int num = 123456;
//         int sum = 0;

//         while(num>0) {

//             sum = sum + num % 10;
//             num = num/10; 
//         }
//         System.out.println("Sum of digits : " + sum);
//     }
// }