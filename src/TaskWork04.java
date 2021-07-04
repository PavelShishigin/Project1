import java.util.Scanner;

/*
Написать программу, которая будет выполнять следующие действия:
Ввести три числа с клавиатуры x, y, z
Найти и вывести в консоль среднее арифметическое этих чисел.
Разделить среднее арифметическое на 2 и округлить в меньшую сторону
Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
     */

public class TaskWork04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число x");
        double x = scanner.nextDouble();
        System.out.println("Введите число y");
        double y = scanner.nextDouble();
        System.out.println("Введите число z");
        double z = scanner.nextDouble();
        double s = (x+y+z)/3;
        System.out.println("Среднее арифметическое введенных чисел равно " + s);
        s = (s-s%2)/2;
        if (s > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}