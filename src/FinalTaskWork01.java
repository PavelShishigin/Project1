import java.util.Scanner;

/*
Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
Пользователь вводит текущий курс и количество рублей.
Итоговое значение должно быть округлено до двух знаков после запятой. Пример для теста работы программы:

Курс доллара: 67,55
Количество рублей: 1000
Итого: 14,80 долларов
*/

public class FinalTaskWork01 {
    public static void main(String[] args) throws java.io.IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текущий курс доллара: ");
        double a = scanner.nextDouble();
        System.out.println("Введите количество рублей: ");
        double b = scanner.nextDouble();
        System.out.printf("Итого:\n%.2f долларов", b/a);
    }
}