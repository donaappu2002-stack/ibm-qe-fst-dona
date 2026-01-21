import java.util.ArrayList;
import java.util.List;

public class Arraylistdemo {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("Dona");
        myList.add("Akshay");
        myList.add("Lathika");
        myList.add("Imran");
        myList.add("Sindhu");

        for(int i=0;i<myList.size();i++){
            System.out.println(myList.get(i));
        }

        System.out.println(myList.get(2));

        System.out.println(myList.contains("Hussain"));
        System.out.println(myList.contains("Imran"));

        System.out.println(myList.size());

        myList.remove(0);

        System.out.println(myList.size());

    }
    
}
