import java.util.Random;

/*
Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20. Далее:
Выведите максимальный и минимальный элемент массива.
Из максимального и минимального значения выведите наибольшее по модулю.
*/

public class TaskWork14 {
    public static void main(String[] args) throws java.io.IOException {
        Random random = new Random();
        int[] array = new int[15];
        int min = array [0];
        int max = array [0];
        for (int i = 0; i < array.length; i++) {
            array[i] = 20 - random.nextInt(41);
            if (array[i] > max) max = array[i];
            if (array[i] < min) min = array[i];
        }
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
        if (Math.abs(max) > Math.abs(min)) {
            System.out.println("Наибольшее значение по модулю: " + max);
        }
        else {
            System.out.println("Наибольшее значение по модулю: " + min);
        }
    }
}