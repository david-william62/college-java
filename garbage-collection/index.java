public class index {
  public static void main(String[] args) {
    String num1 = "100";
    String num2 = "200";
    System.out.println(num1 + num2);
    // say num2 isnt required
    num2 = null;
    System.gc();
  }
}
