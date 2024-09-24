import java.io.*;

class index {
  public static void main(String[]args) {
    String inp = "sample.txt";
    String out = "count.txt";
    int count = 0;

    try(BufferedReader reader = new BufferedReader(new FileReader(inp));
    BufferedWriter writer = new BufferedWriter(new FileWriter(out))) {
      String line = reader.readLine();
      while(line != null) {
        String words[] = line.split("\\s+");
        count += words.length;
        line = reader.readLine();
      }
      writer.write(Integer.toString(count));
    }

    catch(IOException e) {
      System.out.println("An error occured during reading file" + e.getMessage());
    }

    System.out.println("No of words written to count.txt");
  }
}
