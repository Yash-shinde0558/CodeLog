import java.util.Collections;
import java.util.ArrayList;
public class ArrayLists {
    public static void main(String[]args) {

        ArrayList<Integer> list = new ArrayList<>();

        //Add Elements
        list.add(0);
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println(list);

        // Get Elements
        int element = list.get(3);
        System.out.println(element);

        //Add element between
        list.add(1,1);
        System.out.println(list);

        int size = list.size();
        System.out.println(size);

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        Collections.sort(list);
        System.out.println(list);

    }
}
