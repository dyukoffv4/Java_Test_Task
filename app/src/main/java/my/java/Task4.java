package my.java;

public class Task4 {
    /**
     * Метод для вычисления угла между часовой и минутной стрелками.
     * @param hours часы (от 0 до 23)
     * @param minutes минуты (от 0 до 59)
     * @return угол между стрелками в градусах
     */
    public static double calculateAngle(int hours, int minutes) {
        hours = hours % 12;
        double hourAngle = (hours * 30) + (minutes / 2);
        double minuteAngle = minutes * 6;
        double angle = Math.abs(hourAngle - minuteAngle);
        return Math.min(angle, 360 - angle);
    }
}
