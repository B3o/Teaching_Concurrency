package threadcoreknowledge.threadobjectclasscommonmethods;

/**
 * 先join再mainThread.getState()
 * 通过debugger看线程join前后状态的对比
 * @author Bmo
 * @date 2020/2/26 15:57
 */
public class JoinThreadState {
    public static void main(String[] args) throws InterruptedException {
        Thread mainThread = Thread.currentThread();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    System.out.println("主线程状态：" + mainThread.getState());
                    System.out.println("Thread-0运行结束");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        System.out.println("等待子线程运行完毕");
        thread.join();
        System.out.println("等子线程运行完毕");
    }
}
