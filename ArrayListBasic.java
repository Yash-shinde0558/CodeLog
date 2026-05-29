
import java.util.ArrayList;
public class ArrayListBasic {
    public static void main(String[] args) {

        //In this ArrayList size of array is unlimited 
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(18);
        arr.add(5);
        arr.add(10);

        System.out.println(arr.get(2));  //To print array position
        arr.set(3, 50);   //To change arrlist value of 3 rd position 

        int n = arr.size(); //arr.length
        for(int i= 0; i<n; i++){
            System.out.print(arr.get(i)+" ");
        }

        
    }
}
