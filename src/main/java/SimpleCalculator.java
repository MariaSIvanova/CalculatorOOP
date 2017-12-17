import operands.Data;
import operations.OperationForTwoOperands;

/**
 * Created by mivanova on 17.12.2017.
 * @see #main вызывает метод inputData класса Data для создания операндов
 * и вызывает chooseOperation для выбора типа операции
 */
public class SimpleCalculator {
    public static void main(String[] args) {
        /**
         * получаем данные из консоли
         */
        Double firstOperand = Data.inputData("Вести первое дробное число А через запятую: ");
        Double secondOperand = Data.inputData("Вести второе дробное число Б через запятую: ");
        OperationForTwoOperands operation = new ChooseOperation().chooseOperation("Выбрать тип операции для (А ? Б) из следующих: +, -, *, /");

        /**
         * Вывод результата в формате 4 знака после запятой
         */
        System.out.printf("%.4f%n", operation.solve(firstOperand, secondOperand));
    }
}
