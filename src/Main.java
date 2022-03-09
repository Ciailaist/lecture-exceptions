import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please enter an integer numerator: ");
    int numerator = scanner.nextInt();

    System.out.print("Please enter an integer denominator: ");
    int denominator = scanner.nextInt();

    int quotient = quotient(numerator, denominator);
    System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, quotient);
  }

  public static int quotient(int numerator, int denominator) {
    return numerator / denominator;
  }
}