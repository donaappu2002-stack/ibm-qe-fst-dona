public class Activity2 {
    public static void main(String[] args) {
        
        Activity2 obj=new Activity2();
        System.out.println(obj.check());

        
    }
    public boolean check(){
        int[] arr={10, 77, 10, 54, -11, 10};

        int x=10;
       
         int sum=0;
        for(int i:arr){
            if(i==x){
                sum+=i;

            }

        }
        return sum==30;
    }
    
}
