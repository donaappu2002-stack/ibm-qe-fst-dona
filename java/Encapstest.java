public class Encapstest {
    public static void main(String args[]) {
        //Object creation
        Encapsdemo obj = new Encapsdemo();
        
        //Set values
        obj.setEmpName("Mario");
        obj.setEmpAge(32);
        obj.setEmpSSN(112233);

        //Get values
        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee SSN: " + obj.getEmpSSN());
        System.out.println("Employee Age: " + obj.getEmpAge());
    }
}
