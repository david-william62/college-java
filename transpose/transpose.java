import java.util.*;
class transpose {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.println("Enter the row and column size");
  int r,c,i,j;
  r = in.nextInt();
  c = in.nextInt();
  int a[][] = new int[r][c];
  int t[][] = new int[c][r];
  System.out.println("Enter elements of matrix ");
  for(i=0;i<r;i++) {
   for(j=0;j<c;j++) {
    a[i][j]=in.nextInt();
   }
  }
  for(i=0;i<r;i++) {
   for(j=0;j<c;j++) {
    System.out.print(a[i][j] + " ");
   }
   System.out.println("");
  }
  for(i=0;i<r;i++) {
   for(j=0;j<c;j++) {
    t[i][j]=a[j][i];
   }
  }
  for(i=0;i<r;i++) {
   for(j=0;j<c;j++) {
    System.out.print(t[i][j] + " ");
   }
   System.out.println("");
  }
 }
}
