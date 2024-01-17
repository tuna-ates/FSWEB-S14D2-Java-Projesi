import lamp.*;

public class Main {

    public static void main(String[] args) {


        Bedroom bedroom=new Bedroom("Personal",new Wall("north"),
                new Wall("south"),new Wall("east"),
                new Wall("west"),new Ceiling(2,PaintColor.RED),
                new Bed("lateks",2,3,1,2),
                new Lamp(LampType.LED_BULB,true,1234),
                new Wardrobe(4,2,200.5),
                new Carpet(3,4,PaintColor.WHITE));
                 System.out.println(bedroom.getBed());
                  System.out.println(bedroom.getBed().getPillows());

                  Room room=new Room(new Ceiling(12,PaintColor.YELLOW),
                          new Wall("north"),
                          new Wall("south"),new Wall("east"),
                          new Wall("west"));

        System.out.println(room);
        System.out.println(bedroom.getWall1());
        System.out.println(bedroom.getCarpet().getColor());

    }





}