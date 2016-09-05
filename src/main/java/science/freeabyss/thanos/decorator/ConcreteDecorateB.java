package science.freeabyss.thanos.decorator;

/**
 * Created by abyss on 09/05/16.
 */
public class ConcreteDecorateB implements Component {
    private Component component;

    public ConcreteDecorateB(Component component) {
        this.component = component;
    }

    public void operation() {
        component.operation();
        System.out.println("ConcreteDecorateB");
    }
}
