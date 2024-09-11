import java.util.*;

public class Manager extends Employee {
 String depart;
 Manager() {
 }
 void getData() {
  Scanner in = new Scanner(System.in);
  System.out.println("Enter the department of officer");
  this.depart = in.nextLine();
 }

 void printData() {
  System.out.println("Name: " + name);
  System.out.println("Age" + age);
  System.out.println("Phone No:" + phoneNum);
  System.out.println("Address:" + address);
  System.out.println("Salary: " + salary);
  System.out.println("Department:" + depart);
 }

}
