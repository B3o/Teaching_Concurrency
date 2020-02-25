package threadcoreknowledge.threadobjectclasscommonmethods;

/**
 * 两个线程交替打印0-100奇偶数，用wait和notify
 * @author Bmo
 * @date 2020/2/25 16:12
 */
public class WaitNotifyPrintOddEveWait {
    private static final Object lock = new Object();
    private static int count = 0;

    public static void main(String[] args) {
        new Thread(new TurningRunner(), "偶数").start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(new TurningRunner(), "奇数").start();
    }
    //1.拿到锁 就打印
    //2.打印完，唤醒其他线程 自己就休眠
    static class TurningRunner implements Runnable {

        @Override
        public void run() {
            while(count <= 100) {
                synchronized (lock) {
                    //拿到锁就打印
                    System.out.println(Thread.currentThread().getName() + ":" + count++);
                    lock.notify();
                    if (count <= 100) {
                        try {
                            //如果任务还没结束，就让出当前锁，并休眠
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
