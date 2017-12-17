package operands;

import java.util.Scanner;

/**
 * Created by mivanova on 17.12.2017.
 * класс расширяет Operand ----- для принципа наследования
 */
public class Data extends Operand {
    /**
     * модификатор private для приниципа инкапсуляции
     */
    private static Scanner scanner = new Scanner(System.in);

    /**
     *
     * @param operand вещественное число
     */
    public Data(Double operand) {
        super(operand);
    }

    /**
     *
     * @param m - для передачи текста перед получением значения из консоли
     * @return - метод возвращает вещественное число из консоли
     */
    public static double inputData(String m){
        System.out.println(m);
        return scanner.nextDouble();
    }

}
