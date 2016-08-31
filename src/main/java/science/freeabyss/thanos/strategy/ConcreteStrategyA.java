package science.freeabyss.thanos.strategy;

/**
 * 具体算法A
 * Created by abyss on 08/31/16.
 */
public class ConcreteStrategyA implements Strategy {
    public void algorithm() {
        System.out.println("具体算法A:" + this.getClass().getName());
    }
}
