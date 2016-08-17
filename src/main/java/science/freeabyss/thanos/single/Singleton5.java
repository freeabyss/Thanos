package science.freeabyss.thanos.single;

/**
 * 静态内部类 最常用的一个做法
 * Created by abyss on 08/17/16.
 */
public class Singleton5 {
    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    private Singleton5() {
    }

    public static Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
