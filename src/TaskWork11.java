import java.util.Scanner;

/*
Напишите программу:
Ввести первое  число с клавиатуры и записать его в строковую переменную.
Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
Сравнить 2 числа и вывести большее на экран .
Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
*/

public class TaskWork11 {
    public static void main(String[] args) throws java.io.IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        String a = Integer.toString(scanner.nextInt());
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        System.out.println("Наибольшее из двух чисел равно " + Math.max(Integer.parseInt(a), b));
        System.out.println("Наименьшее из двух чисел равно " + (double)Math.min(Integer.parseInt(a), b));
    }
}