abstract class Shape {
 abstract void noOfSides();
}

class Rectangle extends Shape {
 void noOfSides() {
  System.out.println("No of sides: 4");
 }
}

class Triangle extends Shape {
 void noOfSides() {
  System.out.println("No of sides: 3");
 }
}

class Hexagon extends Shape {
 void noOfSides() {
  System.out.println("No of sides: 6");
 }
}

class main {
 public static void main(String[] args) {
  Shape r = new Rectangle();
  Shape t = new Triangle();
  Shape h = new Hexagon();
  r.noOfSides();
  t.noOfSides();
  h.noOfSides();
 }
}
