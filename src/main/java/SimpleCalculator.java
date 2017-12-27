import operands.Data;
import operations.OperationForTwoOperands;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by mivanova on 17.12.2017.
 *
 * Update by mivanova on 27.12.2017:
 * 1) Scanner выведен в класс SimpleCalculator
 * 2) добавлен ArithmeticException в класс Division, который пробрасывает его в текущий catch
 * 3) добавлен InputMismatchException в класс Data, который пробрасывает его в текущий catch
 * 4) добавлен блок finally для многократного запуска калькулятора
 * 5) в блоке finally ловим Exception, на случай, если введено не число для int use = scanner2.nextInt();
 * 6) в интерфейс OperationForTwoOperands добавлен метод getName() для получения символа операции
 *
 * @see #main вызывает метод inputData класса Data для создания операндов
 * и вызывает chooseOperation для выбора типа операции
 */
public class SimpleCalculator {

    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            Scanner scanner1 = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);
            try {
                /**
                 * получаем данные c консоли
                 */
                Double firstOperand = Data.inputData("Вести первое дробное число А через запятую: ", scanner);
                Double secondOperand = Data.inputData("Вести второе дробное число Б через запятую: ", scanner1);
                OperationForTwoOperands operation =
                        new ChooseOperation().chooseOperation("Выбрать тип операции для (А ? Б) из следующих: +, -, *, /");

                /**
                 * Вывод результата в формате 4 знака после запятой
                 */
                Double result = operation.solve(firstOperand, secondOperand);
                System.out.printf(firstOperand + " " + operation.getName() + " " + secondOperand + " = ");
                System.out.printf("%.4f%n", result);
            } catch (InputMismatchException ex) {
                System.out.println("---ОШИБКА---Пожалуйста, введите числа------");
            } catch (ArithmeticException ex) {
                System.out.println("---ОШИБКА---Была попытка поделить на 0------");
            }
            finally {
                System.out.println("Введите 0, если хотите продолжить использовать калькулятор");
                try {
                    int use = scanner2.nextInt();
                    if (use != 0) {
                        scanner.close();
                        scanner1.close();
                        scanner2.close();
                        break;
                    }

                }catch (Exception ex) {
                    scanner.close();
                    scanner1.close();
                    scanner2.close();
                    break;
                }
            }
        }
    }
}
