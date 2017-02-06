package ClassesAndObjects;

public class Bicycle {

	private int cadence;
	private int gear;
	private int speed;
	
	public Bicycle(int cadence, int gear, int speed){
		
		this.cadence = cadence;
		this.gear = gear;
		this.speed = speed;
		
	}
	
	public Bicycle(){
		System.out.println("Parent");
		System.out.println("A Class can only extend one Superclass but can implement multiple Interfaces.");
		System.out.println("");
	}
	
}
