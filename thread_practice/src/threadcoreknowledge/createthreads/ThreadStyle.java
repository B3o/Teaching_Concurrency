package threadcoreknowledge.createthreads;

/**
 * 用Thread方式实现线程
 * @author Bmo
 * @date 2020/2/20 15:22
 */
public class ThreadStyle extends Thread {
    @Override
    public void run() {
        System.out.println("用Thread类实现线程");
    }

    public static void main(String[] args) {
        new ThreadStyle().start();
    }
}
