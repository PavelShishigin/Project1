import java.util.Scanner;

/*
Напишите программу, где пользователь вводит данные с клавиатуры в матрицу,
а после этого произведите вывод первой строки матрицы на экран, где каждый элемент умножается на 3.
Размерность матрицы задается пользователем.
*/

public class TaskWork10 {
    public static void main(String[] args) throws java.io.IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте количество строк в матрице");
        int m = scanner.nextInt();
        System.out.println("Задайте количество столбцов в матрице");
        int n = scanner.nextInt();
        double[][] array = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Введите элемент, расположенный на пересечении " + (i+1) + " строки и " + (j+1) + " столбца матрицы (нецелочисленное значение вводите через запятую)");
                array[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Вывод первой строки матрицы, где каждый элемент умножен на 3:");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((array[i][j] * 3) + "  ");
            }
        }
    }
}