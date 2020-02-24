package threadcoreknowledge.createthreads.wrongways;

/**
 * Lambda创建线程
 * @author Bmo
 * @date 2020/2/21 14:49
 */
public class Lambda {
    public static void main(String[] args) {
        new Thread(()-> System.out.println(Thread.currentThread().getName())).start();
    }
}
