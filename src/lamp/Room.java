package lamp;

public class Room {

    Ceiling ceiling;

    Wall wall1;
    Wall wall2;
    Wall wall3;
    Wall wall4;

    public Room(Ceiling ceiling, Wall wall1, Wall wall2, Wall wall3, Wall wall4) {
        this.ceiling = ceiling;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    @Override
    public String toString() {
        return "Room{" +
                "ceiling=" + ceiling +
                ", wall1=" + wall1 +
                ", wall2=" + wall2 +
                ", wall3=" + wall3 +
                ", wall4=" + wall4 +
                '}';
    }
}
