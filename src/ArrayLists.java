import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(6);
        al.add(4);
        al.add(4);
        al.add(2);
        al.add(1);
        for (Integer a : al){
            System.out.println(a);
        }
        System.out.println("List size is : " + al.size());
        System.out.println("Third element of list is: " + al.get(3));
        al.remove(0);
        Collections.sort(al);
        System.out.println(al);
    }
}
