package design.pattern.command;

import java.sql.SQLOutput;

public class kitchenroomLight implements Light{
    private int brightness;
    @Override
    public void on() {
        brightness = 100;
        System.out.println("Kitchen light is ON");
    }

    @Override
    public void off() {
        brightness = 0;
        System.out.println("Kitchen light is OFF");
    }

    @Override
    public void dim(int level) {
        brightness = level;
        System.out.println("Kitchen light dimmed to" + level + "% brightness");
    }
    public int getBrightness() {
        return brightness;
    }
}
