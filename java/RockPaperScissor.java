import java.util.Random;
import java.util.Scanner;
public class RockPaperScissor {
    public static void main(String[] args) {
        boolean again = true;
        while(again){
            Scanner myObj = new Scanner(System.in);
            String arr[]={"Rock", "Paper", "Scissor"};
            System.out.println("Select Your Choice: Rock,Paper,Scissor");
            String userinput = myObj.nextLine();
            String computerinput = arr[new Random().nextInt(arr.length)];
            if (computerinput.equalsIgnoreCase(userinput)){
                System.out.println("You choose "+ userinput + " & Computer choose"+ computerinput + " \n Its a Draw!");
            }
            if (computerinput.equals("Rock")) {
                if (userinput.equalsIgnoreCase("Paper")) {
                    System.out.println("You choose " + userinput + " & Computer choose " + computerinput + "\n You Win!");
                } else if (userinput.equalsIgnoreCase("Scissor")) {
                    System.out.println("You choose " + userinput + " & Computer choose " + computerinput + "\n Computer Wins!");
                }
            }
            if (computerinput.equals("Paper")) {
                if (userinput.equalsIgnoreCase("Scissor")) {
                    System.out.println("You choose " + userinput + " & Computer choose " + computerinput + "\n You Win!");
                } else if (userinput.equalsIgnoreCase("Rock")) {
                    System.out.println("You choose " + userinput + " & Computer choose " + computerinput + "\n Computer Wins!");
                }
            }
            if (computerinput.equals("Scissor")) {
                if (userinput.equalsIgnoreCase("Rock")) {
                    System.out.println("You choose " + userinput + " & Computer choose " + computerinput + "\n You Win!");
                } else if (userinput.equalsIgnoreCase("Paper")) {
                    System.out.println("You choose " + userinput + " & Computer choose " + computerinput + "\n Computer Wins!");
                }
            }
            System.out.println("Do you want to play again(y/n)");
            String ask = myObj.nextLine();
            if(ask.equalsIgnoreCase("y")){
                again = true;
            }
            else{
                again=false;
                myObj.close();
            }
        }
    }
}










