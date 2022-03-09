public class WrongFileExtension extends Exception {
  private String fileExtension;

  public WrongFileExtension(String fileExtension) {
    super();
    this.fileExtension = fileExtension;
  }

  public WrongFileExtension(String fileExtension, String message) {
    super(message);
    this.fileExtension = fileExtension;
  }

  public WrongFileExtension(String fileExtension, String message, Throwable cause) {
    super(message, cause);
    this.fileExtension = fileExtension;
  }

  public WrongFileExtension(String fileExtension, Throwable cause) {
    super(cause);
    this.fileExtension = fileExtension;
  }

  @Override
  public String getMessage() {
    return String.format("The extension '%s' is forbidden!", fileExtension);
  }
}