import java.util.*;

public class Employee {
 String name;
 int age;
 long phoneNum;
 String address;
 float salary;

 Employee() {
  Scanner in = new Scanner(System.in);
  System.out.println("Enter details of employee");
  System.out.println("Name:");
  name = in.nextLine();
  System.out.println("Age:");
  age = in.nextInt();
  System.out.println("Phone number:");
  phoneNum = in.nextLong();
  System.out.println("Address:");
  address = in.next();
  System.out.println("Salary:");
  salary = in.nextFloat();
 }

 void printSalary() {
  System.out.println(salary);
 }
}
