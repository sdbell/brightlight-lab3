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
		System.out.println("Method Signature comprises the method's name and its parameters.");
		System.out.println("Signature is important for distinguishing Overloaded methods.");
		getMethod1(1);
		byte bb = 2;
		getMethod1(bb);
		System.out.println("");
	}
	
	public void getMethod1(int i){
		System.out.println("Method: " + i + " has a different signature to... ");
	}
	
	public void getMethod1(byte b){
		System.out.println("... this Method " + b + " here.");
	}
}
