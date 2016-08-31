package science.freeabyss.thanos.strategy;

/**
 * Created by abyss on 08/31/16.
 */
public class Context {
    private Strategy strategy;

    // 策略模式与简单工厂结合
    public static Context getInstance(char type) {
        switch (type) {
            case 'A':
                return new Context(new ConcreteStrategyA());
            case 'B':
                return new Context(new ConcreteStrategyB());
            case 'C':
                return new Context(new ConcreteStrategyC());
            default:
                return null;
        }
    }

    private Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface() {
        strategy.algorithm();
    }


}
