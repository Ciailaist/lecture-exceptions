public class Main {

  public static void main(String[] args) {
    try {
      throwMyException();
    } catch (MyException e) {
      e.printStackTrace();
    }
  }

  public static void throwMyException() throws MyException {
    throw new MyException();
  }

}