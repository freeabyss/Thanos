package science.freeabyss.thanos.single;

/**
 * 双重检验锁 线程安全 获取时不会太耗费性能
 * Created by abyss on 08/17/16.
 */
public class Singleton4 {
    /**
     * volatile 防止因重排指令优化导致的bug
     */
    private volatile static Singleton4 instance;

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
