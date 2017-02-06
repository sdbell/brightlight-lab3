package ClassesAndObjects;

public class Methods {
	
	public static int ifield = 1;

	public Methods(int ifield){
		
		System.out.println("Method Signature comprises the method's name and its parameters.");
		System.out.println("Signature is important for distinguishing Overloaded methods.");
		getMethod1(1);
		byte bb = 2;
		getMethod1(bb);
		System.out.println("");
		System.out.println("Parameters refers to list of variables in a method declaration.");
		System.out.println("Arguments are the actual values that are passed in when the method is invoked.");
		System.out.println("");
		getVarArgs(1, 2, 3, 5);
		System.out.println("");
		System.out.println("The name of a parameter must be unique in its scope.");
		System.out.println("It cannot be the same same as the name  of another parameter and it cannot be the name of a local variable.");
		System.out.println("");
		System.out.println("A parameter CAN have the same name as as one of the class' fields.");
		System.out.println("If this is the case, the parameter is said to 'Shadow' the field.");
		System.out.println("The parameter to this method has value: " + ifield);
		System.out.println("The field shadowed by the paramter to this method has value: " + this.ifield);
		System.out.println("To access the field one must use 'this'.");
		System.out.println("");
		int x = 1;
		System.out.println("Value of x prior to being passed into method: " + x);
		getPassValue();
		
	}
	
	public static void getMethod1(int i){
		System.out.println("Method: " + i + " has a different signature to... ");
	}
	
	public static void getMethod1(byte b){
		System.out.println("... this Method " + b + " here.");
	}
	
	public static void getVarArgs(int... args){
		
		System.out.println("One can use a construct called a varargs to pass an aribtrary number of values to a method.");
		System.out.println("To use varargs one MUST follow the type of the LAST parameter by an ellipsis, then a space, and the parameter name.");
		System.out.println("Will not work if ellipsis is after parameter name.");
		System.out.println("Number of arguements passed to this method: " + args.length);
		System.out.println("");
		
	}
	
	public static void getPassValue(){
		
	}
		
}
