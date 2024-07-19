package classes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args){
    System.out.println("Code is running...");
    //Instance of the Scanner class to allow inputs from user
    Scanner scanner = new Scanner(System.in);
    float companyIncomes = 0.0f;
    String companyName = "";
    boolean isValidInput = false;

    while (!isValidInput) {
      try {
        System.out.print("Type the company incomes: ");
        companyIncomes = scanner.nextFloat();
        isValidInput = true;
      } catch (InputMismatchException e) {
        System.out.println("Invalid input for incomes. Please enter a valid number.");
        scanner.next();
      }
    }

    isValidInput = false;
    while (!isValidInput) {
      System.out.print("Type the company name: ");
      companyName = scanner.next();
      if (!companyName.trim().isEmpty()) {
        isValidInput = true;
      } else {
        System.out.println("Invalid input for company name. Please enter a valid string.");
      }
    }

    int taxesPerCountry = taxesPerCountry(companyName);
    float totalPayment = calculateTotalWithTaxes(companyIncomes, taxesPerCountry);

    if (taxesPerCountry == 0){
      System.out.println("Country not found");
    }else {
      System.out.println("The total payment per country is: " + totalPayment);
    }
    scanner.close();
  }

  //Method to validate the taxes pre country
  public static int taxesPerCountry(String userInput){
    return switch (userInput.toLowerCase()) {
      case "brasil" -> 16;
      case "usa" -> 12;
      case "india" -> 10;
      case "mexico" -> 14;
      default -> 0;
    };
  }

  //Method to calculate the total including taxes
  public static float calculateTotalWithTaxes(float companyIncomes, int percentage){
    float floatPercentage = (float) percentage / 100;
    return companyIncomes + (companyIncomes * floatPercentage);
  }
}
