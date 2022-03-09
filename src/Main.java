import java.io.FileWriter;
import java.io.IOException;

public class Main {

  public static void main(String[] args) {
    String fileName = "bohemian-rhapsody.txt";

    try (FileWriter writer = new FileWriter(fileName)) {
      writer.write("Is this the real life?\n");
      writer.write("Is this just fantasy?\n");
      writer.write("Caught in a landslide\n");
      writer.write("No escape from reality\n");
    } catch(IOException e){
      System.out.println("Could not write to file! :(");
    }
  }

}