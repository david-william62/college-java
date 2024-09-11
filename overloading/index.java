import java.util.*;
class shape {
 shape() {}
 void area(double r) {
  double res = 3.14 *r *r;
  System.out.println("Area of circle: "+res);
 }

 void area(int l, int b) {
  double res = l * b;
  System.out.println("Area of reactangle: "+res);
 }

 void area(int a) {
  double res = a * a;
  System.out.println("Area of circle: "+res);
 }

 void area(double b , double h) {
  double res = 0.5 * b * h;
  System.out.println("Area of triangle is: "+res);
 }
}

class index {
 public static void main(String[] args){
  shape s = new shape();
  s.area(2);
  s.area(4,5);
  s.area(1.5);
  s.area(8.2,9.0);
 }
}


