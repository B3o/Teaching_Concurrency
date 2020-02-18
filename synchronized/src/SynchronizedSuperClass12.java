/**
 * 可重入粒度测试，调用父类的方法
 * @author Bmo
 * @date 2020/2/16 12:11
 */
public class SynchronizedSuperClass12 {
    public synchronized void doSomething() {
        System.out.println("我是父类方法");
    }
}

class TestClass extends SynchronizedSuperClass12 {
    @Override
    public synchronized void doSomething() {
        System.out.println("我是子类方法");
        super.doSomething();
    }

    public static void main(String[] args) {
        TestClass t = new TestClass();
        t.doSomething();
    }
}
