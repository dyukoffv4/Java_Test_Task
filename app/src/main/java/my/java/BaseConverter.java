package my.java;

/**
 * Класс BaseConverter предоставляет функциональность для перевода температуры
 * из шкалы Цельсия в другие шкалы: Кельвина или Фаренгейта.
 */
public class BaseConverter {
    public enum TemperatureScale { KELVIN, FAHRENHEIT }

    private TemperatureScale targetScale;

    /**
     * Конструктор по умолчанию. Устанавливает целевую шкалу температуры в Кельвины.
     */
    public BaseConverter() {
        this.targetScale = TemperatureScale.KELVIN;
    }

    /**
     * Конструктор с параметром. Позволяет указать целевую шкалу температуры.
     * @param targetScale целевая шкала температуры (KELVIN или FAHRENHEIT)
     */
    public BaseConverter(TemperatureScale targetScale) {
        this.targetScale = targetScale;
    }

    /**
     * Устанавливает целевую шкалу температуры.
     * @param targetScale целевая шкала температуры (KELVIN или FAHRENHEIT)
     */
    public void setTargetScale(TemperatureScale targetScale) {
        this.targetScale = targetScale;
    }

    /**
     * Конвертирует заданное значение температуры в градусах Цельсия в целевую шкалу.
     * @param celsius температура в градусах Цельсия
     * @return температура в целевой шкале (Кельвинах или Фаренгейтах)
     * @throws IllegalStateException если указана неизвестная шкала температуры
     */
    public double convert(double celsius) {
        switch (targetScale) {
            case KELVIN:
                return celsius + 273.15;
            case FAHRENHEIT:
                return celsius * 9 / 5 + 32;
            default:
                throw new IllegalStateException("Неизвестная шкала температуры: " + targetScale);
        }
    }
}
