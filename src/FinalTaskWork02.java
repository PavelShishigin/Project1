import java.util.Scanner;

/*
Напишите программу, которая позволит решить простое уравнение относительно x.
Программа принимает на вход строку длиной 5 символов.
Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке.
Нужно найти неизвестное.

Пример для теста работы программы:
Ввод: x+5=7
Вывод: 2
Ввод: 3-x=9
Вывод: -6
Ввод: 3-3=x
Вывод: 0
*/

public class FinalTaskWork02 {
    public static void main(String[] args) throws java.io.IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите уравнение: ");
        String l = scanner.nextLine();
        if (l.charAt(1) == '+') {
            if (l.charAt(0) == 'x') {
                System.out.println("x = " + (Character.getNumericValue(l.charAt(4))-Character.getNumericValue(l.charAt(2))));
            }
            else if (l.charAt(2) == 'x') {
                System.out.println("x = " + (Character.getNumericValue(l.charAt(4))-Character.getNumericValue(l.charAt(0))));
            }
            else if (l.charAt(4) == 'x') {
                System.out.println("x = " + (Character.getNumericValue(l.charAt(0))+Character.getNumericValue(l.charAt(2))));
            }
            else System.out.println("Уравнение введено неверно");
        }
        else if (l.charAt(1) == '-') {
            if (l.charAt(0) == 'x') {
                System.out.println("x = " + (Character.getNumericValue(l.charAt(2))+Character.getNumericValue(l.charAt(4))));
            }
            else if (l.charAt(2) == 'x') {
                System.out.println("x = " + (Character.getNumericValue(l.charAt(0))-Character.getNumericValue(l.charAt(4))));
            }
            else if (l.charAt(4) == 'x') {
                System.out.println("x = " + (Character.getNumericValue(l.charAt(0))-Character.getNumericValue(l.charAt(2))));
            }
            else System.out.println("Уравнение введено неверно");
        }
        else System.out.println("Уравнение введено неверно");
    }
}