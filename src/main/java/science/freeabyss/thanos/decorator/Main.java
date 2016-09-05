package science.freeabyss.thanos.decorator;

/**
 * Created by abyss on 09/05/16.
 */
public class Main {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.operation();

        Component componentA = new ConcreteDecorateA(component);
        componentA.operation();

        Component componentB = new ConcreteDecorateB(componentA);
        componentB.operation();

    }
}
