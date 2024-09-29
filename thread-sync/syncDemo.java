class syncDemo {

  syncDemo() {}

  public void count(int num) {
    int i = 0;

    System.out.println("Starting count in thread " + num);
    for(i=0;i<11;i++) {
      System.out.println("Count --- " + i + " from thread " + num);
    }
  }
}

class Sharder extends Thread {
  private int shardNo;
  private syncDemo obj;

  Sharder(int shardNo, syncDemo obj) {
    this.shardNo = shardNo;
    this.obj = obj;
  }

  public void run() {
    synchronized(this.obj) {
      obj.count(this.shardNo);
      System.out.println("Exiting thread "+ this.shardNo);
    }
  }
}
