import java.util.*;
class matrix {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.println("Enter row and column size");
  int r = in.nextInt();
  int c = in.nextInt();
  int i,j,k;
  int a[][] = new int[r][c];
  int b[][] = new int[r][c];
  int m[][] = new int[r][c];
  System.out.println("Enter values of first matrix");
  for(i=0;i<r;i++) {
   for(j=0;j<c;j++) {
    a[i][j]=in.nextInt();
   }
  }
  System.out.println("Enter values of second matrix");
  for(i=0;i<r;i++) {
   for(j=0;j<c;j++) {
    b[i][j]=in.nextInt();
   }
  }
  for (i=0;i<r;i++) {
   for (j=0;j<c;j++) {
    m[i][j] = 0;
    for (k=0;k<c;k++) {
     m[i][j] += a[i][k] * b[k][j];
    }
   }
  }
  for(i=0;i<r;i++) {
   for(j=0;j<c;j++) {
    System.out.print(m[i][j] + " ");
   }
   System.out.println("");
  }
 }
}
