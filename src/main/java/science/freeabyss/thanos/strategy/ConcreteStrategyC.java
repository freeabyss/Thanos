package science.freeabyss.thanos.strategy;

/**
 * Created by abyss on 08/31/16.
 */
public class ConcreteStrategyC implements Strategy {
    public void algorithm() {
        System.out.println("具体算法C:" + this.getClass().getName());
    }
}
