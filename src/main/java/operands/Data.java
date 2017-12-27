package operands;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by mivanova on 17.12.2017.
 * Update by mivanova on 27.12.2017.
 */
public class Data {

    /**
     *
     * @param m - для передачи текста перед получением значения из консоли
     * @return - метод возвращает вещественное число из консоли
     */
    public static double inputData(String m, Scanner scanner){
        System.out.println(m);
        //return scanner.nextDouble();
        double d;
        try{
            d = scanner.nextDouble();
        }
        catch (InputMismatchException ex) {
            System.out.println("---ОШИБКА---Допустимы для ввода только числа------");
            throw new InputMismatchException("Ввели не число");

        }
        return d;
    }

}
