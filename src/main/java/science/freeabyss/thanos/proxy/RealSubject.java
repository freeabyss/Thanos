package science.freeabyss.thanos.proxy;

/**
 * Created by abyss on 09/05/16.
 */
public class RealSubject implements Subject {
    public void request() {
        System.out.println("Real Subject");
    }
}
