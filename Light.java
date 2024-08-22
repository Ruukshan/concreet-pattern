package design.pattern.command;

public interface Light {
    public void on();
    public void off();
    public void dim(int level);
    int getBrightness();
}
