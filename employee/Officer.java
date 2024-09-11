import java.util.*;

public class Officer extends Employee {
 String specilization;
 Officer() {}
 void getData() {
  Scanner in = new Scanner(System.in);
  System.out.println("Enter the specilization of officer");
  this.specilization = in.nextLine();
 }
 
 void printData() {
  System.out.println("Name: " + name);
  System.out.println("Age" + age);
  System.out.println("Phone No:" + phoneNum);
  System.out.println("Address:" + address);
  System.out.println("Salary: " + salary);
  System.out.println("Specilization:" + specilization);
 }
}
