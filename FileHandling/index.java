import java.io.*;

class Index {
  public static void main(String[] args) {
    String input = "input.txt";
    String output = "output.txt";

    try(BufferedReader reader = new BufferedReader(new FileReader(input));
    BufferedWriter writer = new BufferedWriter(new FileWriter(output))) {
      String line = reader.readLine();
      while(line != null) {
        writer.write(line);
        writer.newLine();
        line = reader.readLine();
      }
    }
    
    catch(IOException e) {
      System.out.println("An error occured: "+e.getMessage());
    }
    System.out.println("Hello\\sWorld");
  }
}
