package science.freeabyss.thanos.proxy;

/**
 * Created by abyss on 09/05/16.
 */
public class Proxy implements Subject{
    private RealSubject realSubject;

    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
