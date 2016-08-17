package science.freeabyss.thanos.factory.simple;

/**
 * 简单工厂模式
 * Created by abyss on 08/15/16.
 */
public class OperationFactory {

    public static Operation createOperation(String operate) {
        switch (operate.charAt(0)) {
            case '+':
                return new OperationAdd();
            case '-':
                return new OperationSub();
            case '*':
                return new OperationMul();
            case '/':
                return new OperationDiv();
            default:
                return null;
        }
    }
}
