package classes;
import java.util.Random;

public class Ejercico6 {
  public static void main(String[] args) {
    System.out.println("Code is running...");
    //INSTANCE THE RANDOM CLASS
    Random random = new Random();
    //LOCAL VARIABLES
    int average = 0;
    int numberQuantity = 0;
    int suma = 0;

    while (average <= 50 || numberQuantity < 5){
      int randomNumber = random.nextInt(0,101);
      numberQuantity++;
      suma += randomNumber;
      average = suma / numberQuantity;
      System.out.println("Generated number: " + randomNumber);
      System.out.println("Current average: " + average);
    }

    System.out.println("Final average: " + average);
    System.out.println("Total numbers: " + numberQuantity);
  }
}

