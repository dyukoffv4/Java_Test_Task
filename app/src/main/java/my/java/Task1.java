package my.java;

public class Task1 {
    public static double[] generateArray(int size) {
        double[] array = new double[size];
        for (int i = 0; i < size; i++) array[i] = Math.random();
        return array;
    }

    public static double arrayMinimal(double[] array) {
        if (array.length == 0) return 0;
        double min = array[0];
        for (double number : array) if (number < min) min = number;
        return min;
    }

    public static double arrayMaximal(double[] array) {
        if (array.length == 0) return 0;
        double max = array[0];
        for (double number : array) if (number > max) max = number;
        return max;
    }

    public static double arrayAverage(double[] array) {
        if (array.length == 0) return 0;
        double avg = 0;
        for (double number : array) avg += number;
        return avg / array.length;
    }

    public static void run(int size) {
        double[] array = generateArray(size);
        System.out.println("Массив чисел: " + array);
        System.out.println("Максимальное число: " + arrayMaximal(array));
        System.out.println("Минимальное число:  " + arrayMinimal(array));
        System.out.println("Среднее значение:   " + arrayAverage(array));
    }
}
