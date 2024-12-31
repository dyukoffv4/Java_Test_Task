package my.java;

public class BaseConverter {
    public enum TemperatureScale { KELVIN, FAHRENHEIT }

    private TemperatureScale targetScale;

    public BaseConverter() {
        this.targetScale = TemperatureScale.KELVIN;
    }

    public BaseConverter(TemperatureScale targetScale) {
        this.targetScale = targetScale;
    }

    public void setTargetScale(TemperatureScale targetScale) {
        this.targetScale = targetScale;
    }

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

