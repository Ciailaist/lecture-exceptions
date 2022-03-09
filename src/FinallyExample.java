public class FinallyExample {
  public static void main(String[] args) {
    try {
      throwException();
      System.out.println("Line after throwException() call");
    } catch (Exception e) {
      System.out.println("Catch block in main()");
    }
    doesNotThrowException();
  }

  public static void throwException() throws Exception {
    try {
      System.out.println("Try block in throwException()");
      throw new Exception();
    } catch (Exception exception) {
      System.out.println("Catch block in throwException()");
      throw exception;
    } finally {
      System.out.println("Finally block in throwException()");
    }
  }

  public static void doesNotThrowException() {
    try {
      System.out.println("Try block in doesNotThrowException()");
    } catch (Exception exception) {
      System.out.println("Catch block in doesNotThrowException()");
    } finally {
      System.out.println("Finally block in doesNotThrowException()");
    }
    System.out.println("End of doesNotThrowException()");
  }
}
