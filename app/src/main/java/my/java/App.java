package my.java;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Задание 1.");
        Task1.run(10);
        System.out.println();

        System.out.println("Задание 2.");
        Task2.run("Hello");
        System.out.println();

        System.out.println("Задание 3. Введите градусы в цельсиях:");
        int gradus = scanner.nextInt();
        BaseConverter converter = new BaseConverter();
        System.out.println("Градусы в Келивинах:   " + converter.convert(gradus));
        converter.setTargetScale(BaseConverter.TemperatureScale.FAHRENHEIT);
        System.out.println("Градусы в Фаренгейтах: " + converter.convert(gradus));

        scanner.close();
    }
}
