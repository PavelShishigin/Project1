import java.util.Scanner;

/*
Напишите программу:
Пользователь вводит размер массива и данные с клавиатуры в массив
Сравнить элементы массива с заранее заданными константами x, y, z.
Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
     */

public class TaskWork07 {
    public static void main(String[] args) throws java.io.IOException {
        int x = 10;
        int y = 20;
        int z = 30;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int m = scanner.nextInt();
        int[] array = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.println("Введите " + (i+1) + " элемент массива");
            array[i] = scanner.nextInt();
            if ((array[i] == x) | (array[i] == y) |  (array[i] == z))
            {
                System.out.println("Данное значение имеется в константах");
                System.out.print("\n");
            }

        }
    }
}