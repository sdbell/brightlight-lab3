package ClassesAndObjects;

public class MountainBike extends Bicycle{

	public MountainBike() {
		//super(0, 0, 0);
		System.out.println("Child");
		System.out.println("MountainBike inherits all the fields and methods of Bicycle.");
		System.out.println("See inside code fro demo of some concepts.");
		System.out.println("http://docstore.mik.ua/orelly/java-ent/jnut/ch03_04.htm");
		System.out.println("");
		System.out.println("Parameters refers to list of variables in a method declaration.");
		System.out.println("Arguments are the actual values that are passed in when the method is invoked.");
		
		
	}
	
	public MountainBike(int speed, int gear) {
		//super(1, gear, speed);
		this();
	}

}
