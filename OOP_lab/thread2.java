// Write a java program to implement Threads using Runnable interface.

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Current thread ID : "+Thread.currentThread().getId());
    }
}
class thread2 {
    public static void main(String[] args) {
        System.out.println("Using Runnable Interface");
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
        Thread t2 = new Thread(new MyRunnable());
        t2.start();
    }
}