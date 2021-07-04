import java.util.Scanner;

/*
Напишите программу:
Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
Посчитайте среднее арифметическое элементов массива.
После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
*/

public class TaskWork09 {
    public static void main(String[] args) throws java.io.IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int m = scanner.nextInt();
        double[] array = new double[m];
        double s = 0;
        for (int i = 0; i < m; i++) {
            System.out.println("Введите " + (i + 1) + " элемент массива (нецелочисленное значение вводите через запятую)");
            array[i] = scanner.nextDouble();
            s = s + array[i];
        }
        s = s / m;
        System.out.println("Вывод массива, где каждый элемент массива умножен на среднее арифметическое:");
        for (int i = 0; i < m; i++) {
            array[i] = array[i] * s;
            System.out.print(array[i] + "  ");
        }
    }
}