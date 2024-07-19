package classes;

import java.util.Scanner;

public class Ejercicio7 {
  public static void main(String[] args){
    System.out.println("Code is running...");
    //INSTANCE OF SCANNER CLASS
    Scanner scanner = new Scanner(System.in);

    //CALL THE MAIN METHOD TO MAKE THE SUM
    int[] result = numberSum(scanner);

    //SHOW MESSAGE WITH THE RESULT
    System.out.println("The min number is: " + result[0]);
    System.out.println("The max number is: " + result[1]);
  }

  public static int[] numberSum(Scanner scanner){
    //SET LOCAL VARIABLES
    int minNumber = 0;
    int maxNumber = 0;

    //ITERATE OVER 10 TIMES
    for (int i = 0; i < 10; i++){
      System.out.print("Type a number and know what is a min number and what is a max number (stop with '-1'): ");
      int numberInputted = scanner.nextInt();
      //VALIDATE MIN NUMBER
      if (i == 0) {
        minNumber = numberInputted;
      } else if (numberInputted < minNumber) {
        minNumber = numberInputted;
      }
      //VALIDATE MAX NUMBER
      if (i == 0){
        maxNumber = numberInputted;
      } else if (numberInputted > maxNumber ) {
        maxNumber = numberInputted;
      }
    }
    //RETURN RESULT
    return new int[]{minNumber, maxNumber};
  }
}
