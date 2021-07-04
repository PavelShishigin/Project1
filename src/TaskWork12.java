import java.util.Scanner;

/*
Напишите программу, принимающую на вход строку “I like Java!!!”, которая будет выполнять следующие действия:
Проверить, содержит ли строка подстроку “Java” (используйте contains()).
Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
Замените все символы ‘a’ на ‘о’ и выведите подстроку “Jovo” на экран  (используйте substring()).
*/

public class TaskWork12 {
    public static void main(String[] args) throws java.io.IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String l = scanner.nextLine();
        if ((l.contains("Java")) & (l.startsWith("I like")) & (l.endsWith("!!!"))) {
            System.out.println(l.toUpperCase());
            l = l.replace("a",  "o");
            System.out.println(l.substring(7, 11));
        }
    }
}