package classes;
import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args){
    System.out.println("Code is running...");
    //INSTANCE OF SCANNER CLASS
    Scanner scanner = new Scanner(System.in);

    //CALL THE MAIN METHOD TO MAKE THE SUM
    int result = numberSum(scanner);

    //SHOW MESSAGE WITH THE RESULT
    System.out.println("The total sum is: " + result);
  }

  public static int numberSum(Scanner scanner){
    int result = 0;

    while (true){
      System.out.print("Type a number if you want to stop, type '-1': ");
      int inputNumber = scanner.nextInt();
      if (inputNumber == -1){
        break;
      } else {
        result += inputNumber;
      }
    }
    return result;
  }
}
