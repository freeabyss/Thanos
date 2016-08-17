package science.freeabyss.thanos.single;

/**
 * 懒汉模式, 线程安全 但性能损耗较大
 * Created by abyss on 08/17/16.
 */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
