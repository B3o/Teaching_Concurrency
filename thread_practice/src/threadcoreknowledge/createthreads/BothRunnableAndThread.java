package threadcoreknowledge.createthreads;

/**
 * 同时使用Runnable和Thread两种实现线程的方式
 * @author Bmo
 * @date 2020/2/20 15:30
 */
public class BothRunnableAndThread {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我来自Runnable");
            }
        }){
            @Override
            public void run() {
                System.out.println("我来自Thread");
            }
        }.start();
    }
}
