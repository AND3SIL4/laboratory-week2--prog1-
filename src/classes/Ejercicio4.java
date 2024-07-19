package classes;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio4 {
  public static void main(String[] args) {
    System.out.println("Code is running...");
    //INSTANCE OF SCANNER TO GET THE USER INPUT
    Scanner scanner = new Scanner(System.in);
    //INSTANCE THE RANDOM CLASS
    Random random = new Random();

    //USER INPUT
    System.out.print("Type a number take in count (1(heads), 0(tails)): ");
    int inputNumber = scanner.nextInt();
    //CLOSE SCANNER
    scanner.close();
    //SET LOCAL VARIABLES
    int counterHeads = 0;
    int counterTails = 0;

    //VALIDATE IF THE NUMBER INPUTTED IS CORRECT OR NOT
    if (!(inputNumber == 0 || inputNumber == 1)){
      System.out.println("The number inputted is incorrect, please try again");
    }
    if (inputNumber == 1){
      System.out.println("You chose heads");
    } else{
      System.out.println("You chose tails");
    }

    do {
      int randomIntNumber = random.nextInt(2);
      if (randomIntNumber == 1){
        System.out.println("Random chose is heads");
        counterHeads++;
      } else {
        System.out.println("Random chose is tails");
        counterTails++;
      }
    } while (counterHeads < 5 && counterTails < 5);
    System.out.println("The total heads options are: " + counterHeads);
    System.out.println("The total tails options are: " + counterTails);

    if (counterHeads == 5 && inputNumber == 1){
      System.out.println("You win!!");
    } else if (counterTails == 5 && inputNumber == 0) {
      System.out.println("You win!!");
    } else {
      System.out.println("You lose");
    }
  }
}
