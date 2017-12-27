package operations;

/**
 * @author mivanova
 * интерфейс для для принципа наследования и полиморфизма. Этот интерфейс реализуют разные операции
 */
public interface OperationForTwoOperands {
    String getName();
    Double solve(Double a, Double b);

}
