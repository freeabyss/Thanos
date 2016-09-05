package science.freeabyss.thanos.decorator;

/**
 * Created by abyss on 09/05/16.
 */
public class ConcreteDecorateA implements Component {
    private Component component;
    public ConcreteDecorateA(Component component) {
        this.component = component;
    }
    public void operation() {
        component.operation();
        System.out.println("ConcreteDecorateA");
    }
}
