public class funcintdemo {

    public static void main(String[] args) {

        // Lambda expression to implement the interface method
        functioninterface obj = (String str) -> {
            return "Hi"+str;
        };
        
        // Print statement calling the display method
        System.out.println(obj.display("Hello"));
    }
    
}
