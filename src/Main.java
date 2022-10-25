import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Введите два числа и оператор между ними.");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        if (check(string)) {
            System.out.println(calc(string));
        } else {
            System.out.println("Не верный ввод");
        }

        System.out.println("Завершение программы");
    }

    static String calc(String string) throws Exception {

        String array[] = string.split(" ");
        int a = 0, b = 0;
        Integer result = 0;

        //Если числа римские, то преобразуем в арабские, считаем, преобразуем в римские и выводим как римские
        if (array[0].matches("[MDCLXVI]+") & array[2].matches("[MDCLXVI]+")) {
            a = Convert.convertRomanianToArabian(array[0]);
            b = Convert.convertRomanianToArabian(array[2]);
            if (a > 10 | b > 10) {
                System.out.println("Ввод не корректный, какое то из чисел больше 10");
                throw new Exception();
            }

            switch (array[1]) {
                case ("+"):
                    result = a + b;
                    break;
                case ("-"):
                    result = a - b;
                    if (result < 0) {
                        throw new Exception("//т.к. в римской системе нет отрицательных чисел");
                    } break;
                case ("*"):
                    result = a * b;
                    break;
                case ("/"):
                    result = a / b;
                    break;
            }
            return Convert.convertArabianToRomanian(result.toString());

        }
        //Если арабские, выводим арабскими
        else if (array[0].matches("[0123456789]+") & array[2].matches("[0123456789]+")) {
            a = Integer.parseInt(array[0]);
            b = Integer.parseInt(array[2]);
            if( a > 10 | a < 0 | b < 0 | b > 10) {
                System.out.println("Не верный ввод, какое то из чисел меньше 0, или больше 10");
                throw new Exception();
            }

            else {
                switch (array[1]) {
                    case ("+"):
                        result = a + b;
                        break;
                    case ("-"):
                        result = a - b;
                        break;
                    case ("*"):
                        result = a * b;
                        break;
                    case ("/"):
                        result = a / b;
                        break;
                }
                return result.toString();
            }
        }
        return result.toString();
    }

    static boolean check (String checkString) throws Exception {
        String arrayLocal[] = checkString.split(" ");
        boolean sing = false;

        for(String o : arrayLocal) {
            if(o.matches("[\\+\\-\\*/]+")) {
                sing = true;
            }
        }
        //нет знака => исключение
        if(!sing) {
            throw new Exception("//Не содержит математических операций");
        }

        if (arrayLocal.length != 3) {
            //System.out.println("Не корректный ввод");
            throw new Exception("//т.к. формат математической операции не удовлетворяет заданию - " +
                    "два операнда и один оператор (+, -, /, *) ");
        }

        //Если ввод смешанных чисел, выбрасываем исключение.
        if ((arrayLocal[0].matches("[MDCLXVI]+") & arrayLocal[2].matches("[0123456789]+")) |
                (arrayLocal[2].matches("[MDCLXVI]+") & arrayLocal[0].matches("[0123456789]+"))) {
            throw new Exception("//т.к. используются одновременно разные системы счисления");
        }

        if (arrayLocal[1].matches("[\\+\\-\\*/]+") &
                !arrayLocal[0].matches("[\\+\\-\\*/]+") &
                !arrayLocal[2].matches("[\\+\\-\\*/]+")) {
            //System.out.println("Проверка завершена успешно"); // Отладка
            return true;

        } else
            //System.out.println("Проверка завершена с ошибкой"); // Отладка
            return false;
    }
}