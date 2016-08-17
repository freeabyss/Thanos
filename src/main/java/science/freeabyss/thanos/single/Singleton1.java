package science.freeabyss.thanos.single;

/**
 * 懒汉模式,线程不安全
 * Created by abyss on 08/17/16.
 */
public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
