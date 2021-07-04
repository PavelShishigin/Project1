import java.util.Scanner;

/*
Напишите программу, где пользователь вводит любое целое положительное число n.
А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
     */

public class TaskWork08 {
    public static void main(String[] args) throws java.io.IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число n");
        int n = scanner.nextInt();
        int s = 0;
        for (int i = 1; i < n; i++) {
            if (i%2 != 0)
            {
               s = s + i;
            }
        }
        System.out.println("Сумма всех нечетных чисел до числа n равна " + s);
    }
}