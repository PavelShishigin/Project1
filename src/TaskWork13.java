import java.util.Scanner;

/*
Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами.
Например: “I love java 8 Я люблю java 14 core1”.
Выполните следующие действия:
Выведите слова, состоящие только из латиницы.
Выведите количество этих слов.
*/

public class TaskWork13 {
    public static void main(String[] args) throws java.io.IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String l = scanner.nextLine();
        String[] array = l.split(" ");
        int s = 0;
        System.out.println("Слова, состоящие только из латиницы:");
        for (int i = 0; i < array.length; i++) {
            if (array[i].matches("[a-zA-Z]+")) {
                System.out.print(array[i] + " ");
                s = s + 1;
            }
        }
        System.out.println("\n\nКоличество слов из латиницы равно " + s);
    }
}