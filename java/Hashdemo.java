import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Hashdemo {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("Dona");
        hs.add("Akhil");
        hs.add("Surya");
        hs.add("Sindhu");
        hs.add("Lax");
        hs.add("Chandra");

        System.out.println(hs.size());
        hs.remove("Lax");
        hs.remove("Aksh");

        System.out.println(hs.contains("Dona"));

        Iterator<String> iterator = hs.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);


        
    }
    
}}
