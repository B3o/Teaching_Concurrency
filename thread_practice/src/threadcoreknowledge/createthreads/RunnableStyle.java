package threadcoreknowledge.createthreads;

/**
 * 用Runnable方式创建线程
 * @author Bmo
 * @date 2020/2/20 15:21
 */
public class RunnableStyle implements Runnable{
    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableStyle());
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("用Runnable方法实现线程");
    }
}
