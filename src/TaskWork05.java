import java.util.Scanner;

/*
Напишите простой калькулятор:
Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’.
В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
     */

public class TaskWork05 {
    public static void main(String[] args) throws java.io.IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a");
        double a = scanner.nextInt();
        System.out.println("Введите число b");
        double b = scanner.nextInt();
        System.out.println("Введите оператор");
        char c = (char) System.in.read();
        switch (c) {
            case '+':
                System.out.println("Ответ: " + (a + b));
                break;
            case '-':
                System.out.println("Ответ: " + (a - b));
                break;
            case '*':
                System.out.println("Ответ: " + (a * b));
                break;
            case '/':
                System.out.println("Ответ: " + (a / b));
                break;
        }
    }
}