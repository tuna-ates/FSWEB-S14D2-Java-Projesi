package lamp;

public class Bedroom extends Room {
    String name;
    Bed bed;
    Lamp lamp;
    Wardrobe wardrobe;
    Carpet carpet;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4,
                   Ceiling ceiling,
                   Bed bed,Lamp lamp,Wardrobe wardrobe,Carpet carpet) {
        super(ceiling, wall1, wall2, wall3, wall4);
        this.name = name;
        this.bed = bed;
        this.lamp = lamp;
        this.wardrobe = wardrobe;
        this.carpet = carpet;
    }


    public String getName() {
        return name;
    }



    public Bed getBed() {
        return bed;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Carpet getCarpet() {
        return carpet;
    }
}
