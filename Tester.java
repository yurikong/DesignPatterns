package ProjectDesignPatterns;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args)
	{
		RoachMotel rm = RoachMotel.getInstance();
        rm.createRooms();
        System.out.println(rm);
        RoachColony rc1 = new  RoachColony("first colony",100,200);
        ArrayList amenities = new ArrayList();
        amenities.add("foodbar");
        amenities.add("spa");
        amenities.add("refillbar");
        amenities.add("shower");
        MotelRoom r1 = rm.checkIn(rc1,"Suite",amenities);
        System.out.println(rc1);
        System.out.println(rm);
        RoachColony rc2 = new RoachColony("Second colony",1000,0.2);
        ArrayList amenities2 = new ArrayList();
        amenities2.add("foodbar");
        MotelRoom r2 = rm.checkIn(rc2,"Deluxe",amenities2);
        System.out.println(rc2);
        System.out.println(rm);
        rc2.party();
        System.out.println(rc2);
        Double cost = rm.checkOut(r2,3);
        System.out.println("cost:" + cost);
        System.out.println(rm);
        RoachColony rc3 = new RoachColony("third colony",300,0.3);
        MotelRoom r3 = rm.checkIn(rc3,"Regular",amenities2);
        RoachColony rc4 = new RoachColony("fourth colony",400,0.4);
        MotelRoom r4 = rm.checkIn(rc4,"Regular",amenities2);
        RoachColony rc5 = new RoachColony("fifth colony",500,0.5);
        MotelRoom r5 = rm.checkIn(rc5,"Deluxe",amenities2);
        RoachColony rc6 = new RoachColony("sixth colony",600,0.6);
        MotelRoom r6 = rm.checkIn(rc6,"Deluxe",amenities2);
        RoachColony rc7 = new RoachColony("Seventh colony",700,0.7);
        MotelRoom r7 = rm.checkIn(rc7,"Suite",amenities2);
        RoachColony rc8 = new RoachColony("eigth colony",800,0.8);
        MotelRoom r8 = rm.checkIn(rc8,"Suite",amenities2);
        RoachColony rc9 = new RoachColony("ninth colony",900,0.9);
        cost = rm.checkOut(r3,3);
        System.out.println("cost:" + cost);
        MotelRoom r9 = rm.checkIn(rc9,"Regular",amenities2);
	}
}
