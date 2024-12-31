package my.java;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Задание 1.");
        Task1.run(5);
        System.out.println();

        System.out.println("Задание 2.");
        Task2.run("Hello");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Задание 3. Введите градусы в цельсиях:");
        int gradus = scanner.nextInt();

        BaseConverter converter = new BaseConverter();
        System.out.println("Градусы в Келивинах:   " + converter.convert(gradus));
        converter.setTargetScale(BaseConverter.TemperatureScale.FAHRENHEIT);
        System.out.println("Градусы в Фаренгейтах: " + converter.convert(gradus) + "\n");

        System.out.println("Задание 4. Введите часы и минуты:");
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();

        System.out.println("Угол между часовой и минутной стрелками: " + Task4.calculateAngle(hours, minutes));

        scanner.close();
    }
}
