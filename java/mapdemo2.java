import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class mapdemo2 {
    public static void main(String[] args) {
         Map<Integer, String> colours = new HashMap<>();
         colours.put(1, "Black");
         colours.put(2, "Blue");
         colours.put(3, "Red");
         colours.put(4, "Green");
         colours.put(5, "Yellow");

        System.out.println(colours);
        colours.remove(3);
        System.out.println(colours.containsValue("Green"));

        System.out.println(colours.size());


    }
    
}
