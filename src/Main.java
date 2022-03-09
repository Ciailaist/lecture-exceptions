public class Main {

  public static void main(String[] args) {
    try {
      System.out.println("Throwing an exception...");
      int c = 5 / 0;
    } catch (Exception e) {
      System.out.println("Catching the first exception");
    } finally {
      System.out.println("First finally");
    }

    System.out.println("After first try-block-finally!");

    try {
      System.out.println("Not throwing an exception...");
    } catch (Exception e) {
      System.out.println("Catching the second exception");
    } finally {
      System.out.println("Second finally");
    }

    System.out.println("After first try-block-finally!");
  }

}