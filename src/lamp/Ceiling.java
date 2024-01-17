package lamp;

public class Ceiling {
    private int height;

    private PaintColor pantedColor;

    public Ceiling(int height, PaintColor pantedColor) {
        this.height = height;
        this.pantedColor = pantedColor;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getPantedColor() {
        return pantedColor;
    }

    public void create(){
        /*System.out.println("floor height:"+String.valueOf(this.height),
                "floor color:"+String.valueOf(this.height));*/
    }


}
