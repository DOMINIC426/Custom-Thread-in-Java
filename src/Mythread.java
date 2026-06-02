public class Mythread extends Thread {
    @Override
    public void run() {
        System.out.println("Mythread.run() \n");
    }
    @Override
    public void start() {
        System.out.println("Mythread.start() \n");
    }
    @Override
    public void interrupt() {
        System.out.println("Mythread.interrupt() \n");
    }

}
