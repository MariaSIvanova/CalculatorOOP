import operations.*;

import java.util.Scanner;

/**
 * Created by mivanova on 17.12.2017.
 *
 */
public class ChooseOperation {
    //поле класса для получения разных реализаций интерфейса OperationForTwoOperands
    public OperationForTwoOperands someOper;
    private static Scanner scanner = new Scanner(System.in);

    /**
     * @see #chooseOperation(String) - Метод по char значению из консоли, возвращает класс операции
     * @param msg - для вывода текста перед выбором операции
     * @return - возврат класса операции
     */
    protected OperationForTwoOperands chooseOperation(String msg) {
        System.out.println(msg);
        char oper = scanner.next().charAt(0);

        switch (oper) {
            case '+':
                someOper = new Sum();
                break;
            case '-':
                someOper = new Minus();
                break;
            case '*':
                someOper = new Multiplication();
                break;
            case '/':
                someOper = new Division();
                break;
            default:
                System.out.println("Выбрали операцию не из списка");
        }
        return someOper;
    }
}
