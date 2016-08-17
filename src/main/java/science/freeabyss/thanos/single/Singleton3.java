package science.freeabyss.thanos.single;

/**
 * 饿汉模式 线程安全 但因为类加载时就实例化 资源占有较大
 * 且无法根据相关配置进行初始化
 * Created by abyss on 08/17/16.
 */
public class Singleton3 {
    private static final Singleton3 INSTANCE = new Singleton3();

    public static Singleton3 getInstance() {
        return INSTANCE;
    }

    /**
     * 防止反序列化时，多次实例化该变量
     */
    private Object readResolve() {
        return INSTANCE;
    }
}
