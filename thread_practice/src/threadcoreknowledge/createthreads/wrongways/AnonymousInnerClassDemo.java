package threadcoreknowledge.createthreads.wrongways;

/**
 * @author Bmo
 * @date 2020/2/21 11:34
 */
public class AnonymousInnerClassDemo {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() );
            }
        }.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() );
            }
        }).start();
    }
}
