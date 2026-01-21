package Act7;

import java.util.Scanner;

public class Activity7 {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no of gear used ");
        int gear = in.nextInt();
        System.out.println("Enter the current Speed going on ");
        int currentSpeed =in.nextInt();
        MountainBike bike = new MountainBike(gear,currentSpeed);
        System.out.println(bike);
    }
        
    
}
