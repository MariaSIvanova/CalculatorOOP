package operands;

/**
 * Created by mivanova on 17.12.2017.
 */
public abstract class Operand {
    /**
     * это поле абстарктного класса
     */
    private Double operand;

    /**
     *
     * @param operand - параметр для конструктора класса
     */
    Operand(Double operand){
        this.operand = operand;
    }
}
