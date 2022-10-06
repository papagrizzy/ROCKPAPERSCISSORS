import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Rockpaperscissors {
    public static int getRandomNumber(int min, int max){
        int var = ThreadLocalRandom.current().nextInt(min, max+1);
        return var;
    }
    public static void main(String[] args){
        String[] items = {"R", "P", "S"};
        Scanner inou = new Scanner(System.in);
        while(true){
            System.out.print("Do you want to play?(Y/N): ");
            String choice = inou.next().toUpperCase();
            if (choice.equals("Y")){
                byte chances=0, machineScore=0, userScore=0;
                while (chances<5 && machineScore!=3 && userScore!=3){
                    System.out.print("Enter(R/P/S): ");
                    String userRoll = inou.next().toUpperCase();
                    int pos = getRandomNumber(0,2);
                    String machineRoll = items[pos];
                    if (userRoll.equals("R") && machineRoll.equals("S")){
                        userScore++;
                        System.out.println("You: "+"Rock");
                        System.out.println("Machine: "+"Scissor");
                        System.out.println("Score [User: "+userScore+" ,Machine: "+machineScore+"]");
                    }
                    else if (userRoll.equals("S") && machineRoll.equals("P")){
                        userScore++;
                        System.out.println("You: "+"Scissor");
                        System.out.println("Machine: "+"Paper");
                        System.out.println("Score [User: "+userScore+" ,Machine: "+machineScore+"]");
                    }
                    else if (userRoll.equals("P") && machineRoll.equals("R")){
                        userScore++;
                        System.out.println("You: "+"Paper");
                        System.out.println("Machine: "+"Rock");
                        System.out.println("Score [User: "+userScore+" ,Machine: "+machineScore+"]");
                    }
                    else if (machineRoll.equals("R") && userRoll.equals("S")){
                        machineScore++;
                        System.out.println("You: "+"Scissor");
                        System.out.println("Machine: "+"Rock");
                        System.out.println("Score [User: "+userScore+" ,Machine: "+machineScore+"]");
                    }
                    else if (machineRoll.equals("S") && userRoll.equals("P")){
                        machineScore++;
                        System.out.println("You: "+"Paper");
                        System.out.println("Machine: "+"Scissor");
                        System.out.println("Score [User: "+userScore+" ,Machine: "+machineScore+"]");
                    }
                    else if (machineRoll.equals("P") && userRoll.equals("R")){
                        machineScore++;
                        System.out.println("You: "+"Rock");
                        System.out.println("Machine: "+"Paper");
                        System.out.println("Score [User: "+userScore+" ,Machine: "+machineScore+"]");
                    }
                    else{
                        System.out.println("Draw");
                        System.out.println("Score [User: "+userScore+" ,Machine: "+machineScore+"]");
                    }

                    chances++;
                }
                if (machineScore>userScore){
                    System.out.println("Machine wins!!");
                }
                else if (userScore>machineScore){
                    System.out.println("You win!!");
                }
                else{
                    System.out.println("It's a Draw!!");
                }
            }
            else if (choice.equals("N")){
                System.out.println("Quitting...");
                break;
            }
            else{
                System.out.println("Invalid input!!");
            }
        }
        inou.close();
    }
}
