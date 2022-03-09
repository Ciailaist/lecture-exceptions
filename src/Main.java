import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] ia = new int[15];
    try {
      for (int i = 0; i < 10; i++) {
        ia[i] = i;
        System.out.println(Arrays.toString(ia));
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
      return;
    }
  }

}