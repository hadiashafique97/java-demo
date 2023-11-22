import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        every java program ahs one main method and thats where the program starts
        System.out.println("Do you want to choose rock, paper, or scissors?");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        System.out.println(choice);


        // randomly generate the computer to choose between rock paper and scissors
        String [] computerChoice = {"rock", "paper", "scissors"};
        Random random = new Random();
        int randomIndex = random.nextInt(computerChoice.length);
        String randomString = computerChoice[randomIndex];
        System.out.println(randomString);

        if(randomString.equals("rock") && choice.equals( "paper")) {
            System.out.println("User wins");
        }
        else if(randomString.equals("paper") && choice.equals("scissors")) {
            System.out.println("User wins");
        }
        else if(randomString.equals("scissors") && choice.equals("rock")) {
            System.out.println("User wins");
        }
        else if(randomString.equals("scissors") && choice.equals("paper")){
            System.out.println("computer Wins");
        }
        else if(randomString.equals("paper") && choice.equals("rock")){
            System.out.println("computer Wins");
        }
        else if(randomString.equals("rock") && choice.equals("scissors")) {
            System.out.println("computer wins");
        }
        else {
            System.out.println("ITS A TIE, Try Again :/");
        }

    }
}
