package my.java;

public class Task1 {
    public static double[] getArray(int size) {
        double[] array = new double[size];
        for (int i = 0; i < size; i++) array[i] = Math.random();
        return array;
    }

    public static void processArray(String[] args) {
        int size;
        if (args.length > 1) {
            size = Integer.parseInt(args[1]);
            if (size < 1) size = 10;
        }
        else size = 10;

        double[] array = getArray(size);

        double min = array[0];
        double max = array[0];
        double sum = 0;

        for (double number : array) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
            sum += number;
        }

        double average = sum / size;

        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
        System.out.println("Среднее значение: " + average);
    }
}
