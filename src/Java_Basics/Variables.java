package Java_Basics;

public class Variables {
	
	public int currentSpeed = 5;
	public static int maxSpeed = 10;
	
	public Variables(){
		
		introVariables();
		System.out.println("For Example: " + getCurrentSpeed() + " is an Instance Variable");
		System.out.println("");
		System.out.println("For Example: " + getMaxSpeed() + " is a Class Variable");
		System.out.println("");
		getTempSpeed();
		System.out.println("");
		setSpeed(6);
		System.out.println("");
		
	}
	
	public static void introVariables(){
	System.out.println("The Java programming language defines the following kinds of variables: ");
	}
	
	public int getCurrentSpeed(){
		System.out.println("Instance Variables (Non-Static Fields)");
		System.out.println("Their values are unique to each instance or object of a class.");
		System.out.println("For Example: The current speed of one car might be different from another of the same build.");
		return currentSpeed;
	}
	
	
	public int getMaxSpeed(){
		System.out.println("Class Variables (Static Fields)");
		System.out.println("There is exactly one copy of this variable in existence.");
		System.out.println("For Example: The maximum speed of a car ought be the same as another of the same build regardless of the number made.");
		return maxSpeed;
	}
	
	public void getTempSpeed(){
		int tempSpeed = 3;
		System.out.println("Local Variables");
		System.out.println("Are only visible to the method in which they are declared");
		System.out.println("For Example: Methods often store temporary state in them");		
		System.out.println("For Example: " + tempSpeed + " is one.");		
	}
	
	public void setSpeed(int paraSpeed){
		System.out.println("Parameters");
		System.out.println("Are always classed as variables not fields.");
		System.out.println("For Example: Args in the main method.");		
		System.out.println("For Example: " + paraSpeed + " is one.");			
	}
	
}
