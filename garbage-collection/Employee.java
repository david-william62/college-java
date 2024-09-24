public class Employee {
  private int id;
  private String name;
  private int age;
  private static int nextId = 1;

  public Employee(String name, int age) {
    this.name = name;
    this.age = age;
    this.id = nextId++;
  }
  public void display() {
    System.out.println("ID :" +this.id+ "\nName :"+this.name+"\nAGe :"+this.age);
  }
  public void nextId() {
    System.out.println("Id of next employee will be "+nextId);
  }
  protected void finalize() {
    --nextId;
  }
}
