import java.util.*;

public class employee {
 protected long salary;
 employee() {
 this.salary = this.init();
 }
 public long init() {
  Scanner in = new Scanner(System.in);
  System.out.println("Enter salary of employee");
  long val = in.nextLong();
  return val;
 }

 public void display() {
  System.out.println("name of class is" + getClass().getSimpleName());
 }

 public void calcSalary() {
  System.out.println("Salary of employee is: " + this.salary);
 }
}
