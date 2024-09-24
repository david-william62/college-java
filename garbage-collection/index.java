public class index {
  public static void main(String[] args) {
    Employee e1 = new Employee("John",23);
    Employee e2 = new Employee("Doye", 45);
    e1.display();
    e2.display();
    e1.nextId();
    e2.nextId();
    {
      Employee i1 = new Employee("Intern-1",19);
      Employee i2 = new Employee("Intern-2",18);
      i1.nextId();
      i2.nextId(); 
      // say interns i1 and i2 were fired
      i1 = i2 = null;
      // request java to do garbage collection
      System.gc();
      System.runFinalization(); // because i overloaded the finalize() method
    }
    e1.nextId();
  }
}
