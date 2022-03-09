import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean continueLoop = true; // determines if more input is needed

    while (continueLoop) {
      try { // read two numbers and calculate quotient
        System.out.print("Please enter an integer numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Please enter an integer denominator: ");
        int denominator = scanner.nextInt();

        int quotient = quotient(numerator, denominator);
        System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, quotient);

        continueLoop = false;
      } catch (InputMismatchException e) {
        e.printStackTrace();
        scanner.nextLine(); // discard input so we can try again
        System.out.printf("You must enter integers. Please try again.%n");
      } catch (ArithmeticException e) {
        e.printStackTrace();
        System.out.printf("Cannot divide by 0. Please try again.%n");
      }
    }
  }

  public static int quotient(int numerator, int denominator) {
    return numerator / denominator;
  }
}