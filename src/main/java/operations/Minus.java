package operations;

/**
 * Created by mivanova on 17.12.2017.
 */
public class Minus implements OperationForTwoOperands {
    /**
     *
     * @param a - первое число
     * @param b - второе число
     * @return - возвращаемое значение
     */
    public Double solve(Double a, Double b) {
        return a-b;
    }

    public String getName() {
        return "-";
    }
}
