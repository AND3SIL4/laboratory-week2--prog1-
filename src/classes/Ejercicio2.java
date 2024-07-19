package classes;
import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    System.out.println("Code is running...");
    //INSTANCE OF SCANNER TO GET THE USER INPUT
    Scanner scanner = new Scanner(System.in);

    //USER INPUT
    System.out.print("Type an 'ODD' or 'EVEN' word: ");
    String word = scanner.nextLine();

    //VALIDATE USER INPUT
    while (!word.equals("ODD") && !word.equals("EVEN")) {
      System.out.print("Invalid input. Type 'ODD' or 'EVEN': ");
      word = scanner.nextLine().toUpperCase();
    }

    System.out.println("Type two numbers");
    int number1 =  scanner.nextInt();
    int number2 = scanner.nextInt();

    //CALL THE METHOD TO KNOW THE NUMBERS
    iterateUsingLoop(number1, number2, word);
  }

  public static void iterateUsingLoop(int number1, int number2, String type){
    for (int i = number1; i <= number2; i++) {
      if (type.equals("ODD")) {
        if (i % 2 == 0) {
          System.out.print(i + " ");
        }
      } else if (type.equals("EVEN")) {
        if (i % 2 != 0) {
          System.out.print(i + " ");
        }
      }
    }
  }
}
