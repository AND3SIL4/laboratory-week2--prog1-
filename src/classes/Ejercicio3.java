package classes;

import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    System.out.println("Code is running...");
    //INSTANCE OF SCANNER TO GET THE USER INPUT
    Scanner scanner = new Scanner(System.in);

    //USER INPUT
    System.out.print("Type a number: ");
    int inputNumber = scanner.nextInt();
    //CREATE LOCAL VARIBALES
    int counter = 0;
    int tempNumber = inputNumber;

    //VALIDATE IF THE NUMBER INPUTTED IS EQUALS TO 0
    if (inputNumber == 0){
      System.out.println("The number is not valid, please try again");
    }

    //LOOP TO ITERATE AND KNOW THE TOTAL DIGITS OF THE NUMBER INPUTTED
    while (tempNumber != 0){
      tempNumber = tempNumber / 10;
      counter++;
    }
    scanner.close();

    //SHOW THE RESULT
    System.out.println("Total digits: " + counter);
  }
}
