package operations;

/**
 * Created by mivanova on 17.12.2017.
 */
public class Division implements OperationForTwoOperands {
    /**
     *
     * @param a - первое число
     * @param b - второе число
     * @return - возвращаемое значение
     */
    public Double solve(Double a, Double b) {
        if(b==0) throw new ArithmeticException("поделили на ноль");
        return a/b;
    }

    public String getName() {
        return "/";
    }
}
