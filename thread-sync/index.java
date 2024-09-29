class index {
  public static void main(String args[]) {
    syncDemo obj = new syncDemo();
    Sharder t1 = new Sharder(1, obj);
    Sharder t2 = new Sharder(2, obj);

    t1.start();
    t2.start();
  }
}
