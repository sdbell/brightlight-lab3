package ClassesAndObjects;

public class MountainBike extends Bicycle{

	public MountainBike() {
		//super(0, 0, 0);
		System.out.println("Child");
		System.out.println("MountainBike inherits all the fields and methods of Bicycle.");
		System.out.println("See inside code fro demo of some concepts.");
		System.out.println("http://docstore.mik.ua/orelly/java-ent/jnut/ch03_04.htm");
		System.out.println("");
		
	}
	
	public MountainBike(int speed, int gear) {
		//super(1, gear, speed);
		this();
	}

}
