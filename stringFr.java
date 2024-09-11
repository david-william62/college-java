import java.util.*;

class StringFr {
 public static void main(String[]args) {
  Scanner in = new Scanner(System.in);
  System.out.println("Enter a string");
  String s = in.nextLine();
  System.out.println("Enter a character to check the frequency of");
  char c = in.next().charAt(0);
  int l = s.length();
  int count = 0;
  char r;
  for(int i=0;i<l;i++) {
   r = s.charAt(i);
   if(r==c) count++;
  }
  System.out.println(count);
 }
}
