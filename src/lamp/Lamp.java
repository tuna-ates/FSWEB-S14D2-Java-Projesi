package lamp;

public class Lamp {
    private LampType style;
    private boolean isBattery;
    private int globRating;

    public Lamp(LampType style, boolean isBattery, int globRating) {
        this.style = style;
        this.isBattery = isBattery;
        this.globRating = globRating;
    }

    public void turnOn(){
        System.out.println("'Lamp is being turned on");
    }

    public LampType getStyle(){
        return this.style;
    }

    public boolean isBattery() {
        return isBattery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
