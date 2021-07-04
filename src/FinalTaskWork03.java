import java.util.Scanner;

/*
Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки.
Среди данных строк найти строку с максимальным количеством различных символов.
Если таких строк будет много, то вывести первую.

Пример для теста работы программы:
Количество строк: 3
Строка 1: привет
Строка 2: анализ
Строка 3: 111111111111
Ответ: привет
*/

public class FinalTaskWork03 {
    public static void main(String[] args) throws java.io.IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк n ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите строку " + (i+1) + ": ");
            array[i] = scanner.nextLine();
        }
        int max = 0;
        int c = 0;
        for (int i = 0; i < n; i++) {
            int symbol = array[i].length();
            for (int j = 0; j < array[i].length(); j++) {
                for (int k = j + 1; k < array[i].length(); k++) {
                    if (array[i].charAt(j) == array[i].charAt(k)) {
                        symbol = symbol - 1;
                    }
                }
            }
            if (symbol > max) {
                max = symbol;
                c = i;
            }
        }
        System.out.print("Ответ: " + array[c]);
    }
}