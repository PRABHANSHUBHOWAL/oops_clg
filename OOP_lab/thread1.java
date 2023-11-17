//  Write a java program to implement Threads using thread class.

class MyThread extends Thread {
    public void run() {
        System.out.println("Current thread ID : "+Thread.currentThread().getId());
    }
}
class thread1 {
    public static void main(String[] args) {
        System.out.println("Using Thread Class");
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        t1.start();
        t2.start();
    }
}
