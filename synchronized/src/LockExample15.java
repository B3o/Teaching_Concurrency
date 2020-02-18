import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 展示Lock的方法
 * @author Bmo
 * @date 2020/2/16 15:45
 */
public class LockExample15 {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        lock.lock();
        lock.unlock();
        lock.tryLock();
        lock.tryLock(1000, TimeUnit.SECONDS);
    }
}
