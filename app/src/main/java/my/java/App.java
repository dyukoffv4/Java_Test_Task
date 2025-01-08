package my.java;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        doTask1(null);
        doTask2(null);
        doTask3(scanner);
        doTask4(scanner);

        scanner.close();
    }

    public static void doTask1(Scanner scanner) {
        System.out.println("Задание 1.");
        int size = 5;
        if (scanner != null) {
            System.out.print("Введите размер массива: ");
            size = scanner.nextInt();
            scanner.nextLine();
        }

        Task1.run(size);
        System.out.println();
    }

    public static void doTask2(Scanner scanner) {
        System.out.println("Задание 2.");
        String line = "Hello";
        if (scanner != null) {
            System.out.println("Введите строку:");
            line = scanner.nextLine();
        }
        else System.out.println("Строка: " + line);

        Task2.run(line);
        System.out.println();
    }

    public static void doTask3(Scanner scanner) {
        System.out.println("Задание 3.");
        int gradus = 100;
        if (scanner != null) {
            System.out.print("Введите градусы в цельсиях: ");
            gradus = scanner.nextInt();
            scanner.nextLine();
        }
        else System.out.println("Градусы в Цельсиях:    " + gradus);

        BaseConverter converter = new BaseConverter();
        System.out.println("Градусы в Келивинах:   " + converter.convert(gradus));
        converter.setTargetScale(BaseConverter.TemperatureScale.FAHRENHEIT);
        System.out.println("Градусы в Фаренгейтах: " + converter.convert(gradus) + "\n");
    }

    public static void doTask4(Scanner scanner) {
        System.out.println("Задание 4.");
        int hours = 12, minutes = 15;
        if (scanner != null) {
            System.out.println("Введите часы и минуты через пробел:");
            hours = scanner.nextInt();
            minutes = scanner.nextInt();
            scanner.nextLine();
        }
        else System.out.println("Время: " + hours + ":" + minutes);

        System.out.println("Угол между часовой и минутной стрелками: " + Task4.calculateAngle(hours, minutes) + "\n");
    }
}
