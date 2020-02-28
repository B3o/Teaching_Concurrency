package threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Bmo
 * @date 2020/2/28 15:17
 */
public class ShutDown {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 100; i++) {
            executorService.execute(new ShutDownTask());
        }
        System.out.println(executorService.isShutdown());
        Thread.sleep(1500);
        executorService.shutdown();
        System.out.println(executorService.isShutdown());
//        executorService.execute(new Task());
        Thread.sleep(10000);
        System.out.println(executorService.isTerminated());
    }
}
class ShutDownTask implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
