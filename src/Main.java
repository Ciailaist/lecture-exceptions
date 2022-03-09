import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws WrongFileExtension {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please enter an file format: ");
    String extension = scanner.nextLine();


    if (extension.compareToIgnoreCase("xml") == 0 ||
            extension.compareToIgnoreCase("csv") == 0 ||
            extension.compareToIgnoreCase("json") == 0)
      System.out.printf("The extension '%d' is allowed.%n", extension);
    else
      throw new WrongFileExtension(extension);
  }

}