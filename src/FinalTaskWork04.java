import java.util.Scanner;

/*
Напишите программу-загадку: “Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”. Ответ: “Заархивированный вирус”.
У пользователя есть 3 попытки, чтобы отгадать загадку.
Если пользователь ввел верный ответ, вывести: “Правильно!” и завершить работу.
Если пользователь ввел неверный ответ на 1 или 2 попытке, вывести “Подумай еще!” и еще раз запросить ответ у пользователя.
Если пользователь сделал 3 неправильных попытки, вывести “Обидно, приходи в другой раз” и завершить работу.
Также пользователь имеет право на подсказку при первой попытке, при этом 2 и 3 попытки уже недоступны.
Если на первой попытке он введет строку “Подсказка”, вывести любую подсказку. Если на 2 и 3, вывести “Подсказка уже недоступна”.
Если пользователь, использовавший подсказку, ошибется,
вывести “Обидно, приходи в другой раз” и завершить работу.
*/

public class FinalTaskWork04 {
    public static void main(String[] args) throws java.io.IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Отгадайте загадку:");
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        System.out.println("Введите свой ответ (чтобы получить подсказку на первой попытке, введите Подсказка):");
        String s = scanner.nextLine();
        if (s.equals("Заархивированный вирус")) {
            System.out.println("Правильно!");
        } else if (s.equals("Подсказка")) {
            outer1: for (int i = 1; i > 0; i++)
            {
                System.out.println("Для борьбы с ним используются специализированные программы");
                System.out.println("Введите свой ответ:");
                s = scanner.nextLine();
                if (s.equals("Заархивированный вирус")) {
                    System.out.println("Правильно!");
                    break;
                } else if (s.equals("Подсказка")) {
                    continue outer1;
                } else {
                    System.out.println("Обидно, приходи в другой раз");
                    break;
                }
            }
        } else {
            System.out.println("Подумай еще!");
            outer2: for (int i = 1; i > 0; i++)
            {
                System.out.println("Введи свой ответ (вторая попытка):");
                s = scanner.nextLine();
                if (s.equals("Заархивированный вирус")) {
                    System.out.println("Правильно!");
                    break;
                } else if (s.equals("Подсказка")) {
                    System.out.println("Подсказка уже недоступна");
                    continue outer2;
                } else {
                    System.out.println("Подумай еще!");
                    outer3: for (int j = 1; j > 0; j++)
                    {
                        System.out.println("Введи свой ответ (третья попытка):");
                        s = scanner.nextLine();
                        if (s.equals("Заархивированный вирус")) {
                            System.out.println("Правильно!");
                            break outer2;
                        } else if (s.equals("Подсказка")) {
                            System.out.println("Подсказка уже недоступна");
                            continue outer3;
                        } else {
                            System.out.println("Обидно, приходи в другой раз");
                             break outer2;
                        }
                    }
                }
            }
        }
    }
}