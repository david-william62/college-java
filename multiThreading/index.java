import java.lang.reflect.Method;

class Multi extends Thread {
  private int thread_count;
  Multi(int thread_count) {
    this.thread_count = thread_count;
  }

  private void count() {
    System.out.println("Starting count on thread "+ this.thread_count);
    for(int i=0;i<=10;i++) {
      System.out.println(i +" from thread "+ this.thread_count);
    }
  }

  public void run() {
    this.count();
  }
}

public class index {
  public static void main(String[] args) {
    Multi a = new Multi(1);
    Multi b = new Multi(2);

    a.start();
    b.start();
  }
}
