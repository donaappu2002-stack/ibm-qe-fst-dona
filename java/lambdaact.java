public class lambdaact {
    public static void main(String[] args) {
        
        lambdainterface ad1= (int a,int b)->{ return a+b;
    };
     lambdainterface ad2= (int a,int b)-> a+b;

    System.out.println(ad1.add(3,5));
    System.out.println(ad2.add(48,57));
}}
