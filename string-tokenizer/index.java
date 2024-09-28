import java.util.*;

public class index {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string:");
    String s = sc.nextLine();
    StringTokenizer st = new StringTokenizer(s," ");
    int sum = 0;
    while(st.hasMoreTokens()) {
      String token = st.nextToken();
      // int n = Integer.parseInt(token);
      sum++;
    }
    System.out.println(sum);
  }
}
