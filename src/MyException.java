public class MyException extends Throwable {
  public MyException() {}

  public MyException(String message) {
    super(message);
  }

  public MyException(String message, Throwable cause) {
    super(message, cause);
  }

  public MyException(Throwable cause) {
    super(cause);
  }

  @Override
  public String getMessage() {
    return "This is my own exception";
  }
}
