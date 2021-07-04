import java.util.Scanner;

/*
Напишите программу конвертер физических величин:

1. Пользователю предлагается на выбор ввести массу или расстояние. Пример:
> Выберите что переводить: 1 - масса, 2 - расстояние
> 2

2. Пользователю предлагается выбрать единицу измерения. Пример:
> Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут
> 1

3. Пользователю предлагается ввести количество выбранных единиц:
> Введите число
> 10
> Результат:
> Метры: 10
> Мили: 0.006
> Ярды: 10.94
> Футы: 32.81
     */

public class TaskWork06 {
    public static void main(String[] args) throws java.io.IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int a = scanner.nextInt();
        if (a == 1) {
            System.out.println("Выберите единицу измерения: 1 - кг, 2 - фунт, 3 - центнер, 4 - тонна");
            int b1 = scanner.nextInt();
            if ((b1 == 1) | (b1 == 2) | (b1 == 3) | (b1 == 4)) {
                System.out.println("Введите число");
                double с1 = scanner.nextDouble();
                System.out.println("Результат:");
                switch (b1) {
                    case 1:
                        System.out.println("Килограммы: " + с1);
                        System.out.println("Фунты: " + с1 * 2.20462);
                        System.out.println("Центнеры: " + с1 * 0.01);
                        System.out.println("Тонны: " + с1 * 0.001);
                        break;
                    case 2:
                        System.out.println("Килограммы: " + с1 * 0.45359237);
                        System.out.println("Фунты: " + с1);
                        System.out.println("Центнеры: " + с1 * 0.0045359237);
                        System.out.println("Тонны: " + с1 * 0.00045359237);
                        break;
                    case 3:
                        System.out.println("Килограммы: " + с1 * 100);
                        System.out.println("Фунты: " + с1 * 220.462);
                        System.out.println("Центнеры: " + с1);
                        System.out.println("Тонны: " + с1 * 0.1);
                        break;
                    case 4:
                        System.out.println("Килограммы: " + с1 * 1000);
                        System.out.println("Фунты: " + с1 * 2204.62);
                        System.out.println("Центнеры: " + с1 * 10);
                        System.out.println("Тонны: " + с1);
                        break;
                    default:
                        System.out.println("Введено некорректное значение");
                        break;
                }
            }
            else {
                System.out.println("Введено некорректное значение");
            }
        }
        else if (a == 2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int b2 = scanner.nextInt();
            if ((b2 == 1) | (b2 == 2) | (b2 == 3) | (b2 == 4)) {
                System.out.println("Введите число");
                double c2 = scanner.nextDouble();
                System.out.println("Результат:");
                switch (b2) {
                    case 1:
                        System.out.println("Метры: " + c2);
                        System.out.println("Мили: " + c2 * 0.000621371);
                        System.out.println("Ярды: " + c2 * 1.09361);
                        System.out.println("Футы: " + c2 * 3.28084);
                        break;
                    case 2:
                        System.out.println("Метры: " + c2 * 1609.34);
                        System.out.println("Мили: " + c2);
                        System.out.println("Ярды: " + c2 * 1760);
                        System.out.println("Футы: " + c2 * 5280);
                        break;
                    case 3:
                        System.out.println("Метры: " + c2 * 0.9144);
                        System.out.println("Мили: " + c2 * 0.000568182);
                        System.out.println("Ярды: " + c2);
                        System.out.println("Футы: " + c2 * 3);
                        break;
                    case 4:
                        System.out.println("Метры: " + c2 * 0.3048);
                        System.out.println("Мили: " + c2 * 0.000189394);
                        System.out.println("Ярды: " + c2 * 0.333333);
                        System.out.println("Футы: " + c2);
                        break;
                    default:
                        System.out.println("Введено некорректное значение");
                        break;
                }
            }
            else {
                System.out.println("Введено некорректное значение");
            }
        }
        else {
            System.out.println("Введено некорректное значение");
        }
    }
}
