import java.util.*;
class SecSmall {
 public static void main(String[]args) {
  Scanner obj = new Scanner(System.in);
  System.out.println("Enter length of array");
  int l=obj.nextInt();
  int[] a = new int[l];
  int i;
  for(i=0;i<l;i++) {
   a[i]=obj.nextInt();
  }
  int s1 = Integer.MAX_VALUE;
  int s2 = Integer.MAX_VALUE;
  for(i=0;i<l;i++) {
   int num = a[i];
   if(num<s1) {
    s2=s1;
    s1=num;
   }
   else if(num<s2 && num!=s1) {
    s2=num;
   }
  }
  System.out.println(s2);
 }
}
