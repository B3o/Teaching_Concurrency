/**
 * 可重入粒度测试2：调用类内另外的方法
 * @author Bmo
 * @date 2020/2/16 12:08
 */
public class SynchronizedOtherMehod11 {
    public synchronized void method1() {
        System.out.println("我是method1");
        method2();
    }

    private synchronized void method2() {
        System.out.println("我是method2");
    }

    public static void main(String[] args) {
        SynchronizedOtherMehod11 s = new SynchronizedOtherMehod11();
        s.method1();
    }
}
