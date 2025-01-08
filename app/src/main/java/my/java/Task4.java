package my.java;

public class Task4 {
    /**
     * Метод для вычисления угла между часовой и минутной стрелками.
     * @param hours часы (от 0 до 23)
     * @param minutes минуты (от 0 до 59)
     * @return угол между стрелками в градусах
     */
    public static double calculateAngle(int hours, int minutes) {
        // Приводим часы к значениям от 0 до 11
        hours = hours % 12;

        // Вычисляем угол часовой стрелки относительно положения в 0 часов 0 минут.
        double hourAngle = (hours * 30) + (minutes / 2);

        // Вычисляем угол минутной стрелки относительно положения в 0 часов 0 минут.
        double minuteAngle = minutes * 6;

        // Выисляем угол между стрелками.
        double angle = Math.abs(hourAngle - minuteAngle);

        // Определяем минимальный угол между стрелками.
        return Math.min(angle, 360 - angle);
    }
}
