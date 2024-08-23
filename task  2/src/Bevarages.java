public abstract class Bevarages {
    private boolean wantsExtras = false;

    public Bevarages() {
    }

    public final void finalTemplateMethod() {
        this.boilWater();
        this.brew();
        this.pourInCup();
        this.addCondiments();
        if (this.wantsExtras) {
            this.addExtras();
        }

    }
    // Methods that can be common for all bevarages.
    public void boilWater() {
        System.out.println("Boiling Water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // Abstract methods to implement subclasses
    public abstract void brew();

    public abstract void addCondiments();

    public abstract void addExtras();

    public void setWantsExtras(boolean wantsExtras) {
        this.wantsExtras = wantsExtras;
    }
}