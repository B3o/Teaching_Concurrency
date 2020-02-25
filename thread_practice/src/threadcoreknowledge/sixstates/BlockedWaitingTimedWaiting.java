package threadcoreknowledge.sixstates;

/**
 * 展示Blocked，Waiting，Timed_Waiting三种状态
 * @author Bmo
 * @date 2020/2/25 9:22
 */
public class BlockedWaitingTimedWaiting implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new BlockedWaitingTimedWaiting();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        Thread.currentThread().join(12);
        //打印出TIMED_WAITING状态，因为正在执行Thread.sleep(1000)
        System.out.println(thread1.getState());
        //打印出BLOCKED状态，因为Thread想拿到synchronized的锁 却拿不到
        System.out.println(thread2.getState());
        Thread.sleep(1300);
        //打印WAITING状态，因为执行了wait()
        System.out.println(thread1.getState());
    }
    @Override
    public void run() {
        syn();
    }
    private synchronized void syn() {
        try {
            Thread.sleep(1000);
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
