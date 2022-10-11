import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1,"Strahinja");
        map1.put(2,"Alen");
        map1.put(3,"Sonja");
        for (Map.Entry student : map1.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
        }
    }
}
