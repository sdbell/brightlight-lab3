package Java_Basics.E_S_B;

public class CF_Statements {

	public CF_Statements(){
		
		System.out.println("Control Flow Statements");
		System.out.println("If-Then");
		System.out.println("If-Then-Else");
		System.out.println("If-Then-Else-If");
		System.out.println("");
		getSwitch();
		getWhile();
		getFor();
		getBranching();
		getContinue();
		getReturn();
		
	}
	
	public static void getSwitch(){
	
		System.out.println("Switch statements can have a number of possible execution paths.");
		System.out.println("They work with the types byte, short, char, int, Enum, String and Wrappers.");
		System.out.println("Memory Technique: Nye short characters in enumarable sweetie wrappers.");
		int example = 0;
		switch(example){
		case 1:
			System.out.println("The example number is 1.");
			break;
		case 5:
			System.out.println("The example number is 5.");
			break;
		default:
			System.out.println("This is the default message.");
			break;
		}
		System.out.println("Watch out for 'Fall Through'.");
		System.out.println("");
		
	}
	
	public static void getWhile(){

		System.out.println("The While statements continually executes a block of staements while a particular condition is true.");
        int count = 1;
        while (count < 6) {
            System.out.println("Count is: " + count);
            count++;
        }
		System.out.println("");
		System.out.println("There is also the Do-While statement which is always executed atleast once.");
		
	}
	
	public static void getFor(){
		
		System.out.println("The For statement provides a compact way to iterate over over a range of values.");
		System.out.println("It comprises of 4 parts: ");
		System.out.println("1) Initialisation.");
		System.out.println("2) Termination.");
		System.out.println("3) Increment.");
		System.out.println("4) Statement(s).");
		System.out.println("Infinite Loop: for(;;){}");
		System.out.println("");
		System.out.println("There is also the Enhanced For Loop.");
		int[] anArray = {1,1,2,3,5};
		for(int j: anArray){
			System.out.println("j = " + j);
		}
		System.out.println("Remember that the variable in an enhanced for loop references the contents NOT the index.");
		System.out.println("");
		
	}
	
	public static void getBranching(){
		
		System.out.println("The Break statement has two forms: labeled and unlabeled. The latter appearing in switch statements.");
		getUnlabeledBreak();
		getLabeledBreak();
		System.out.println("");
		
	}
	
	public static void getUnlabeledBreak(){
		
		System.out.println("Unlabeled Breaks can be used to terminate for, while or do-while loops aswell.");
		int[] array = {2,4,6,8};
		int count = 0;
		for(int k: array){
			count++;
			System.out.println("Element: " + count);
			System.out.println("Contents: " + k);
			
			if(k == 4){
				System.out.println("Number 4 found at element: " + k + ".");
				break;
			}
		}
		System.out.println("");
		
	}
	
	public static void getLabeledBreak(){
		
		int[][] twoDarray = { 
	            { 32, 87, 3, 589 },
	            { 12, 1076, 2000, 8 },
	            { 622, 127, 77, 955 }
	        }; 
		
		search:
		for(int x = 0; x < twoDarray.length; x++){
			for(int y = 0; y < twoDarray[x].length; y++){
				if(twoDarray[x][y]==127){
					System.out.println("Found.");
					break search;
				}
			}
		}
		
		search2:
		for(int x[]: twoDarray){
			for(int y: x){
				if(y==127){
					System.out.println("Found.");
					break search2;
				}
			}
		}		
		System.out.println("");
		
	}
	
	public static void getContinue(){
		
		System.out.println("The Continue statement skips the current iteration of a for, while or do-while loop.");
		getUnlabeledContinue();
		getLabeledContinue();
		
	}
	
	public static void getUnlabeledContinue(){
		
		System.out.println("The unlabled version skips innermost body.");
		for(int r=1; r <=3; r++){
			System.out.println("R: " + r);
			for(int s=1; s<=3; s++){
				if(r == 2 || s == 2) continue;
				System.out.println("S: " + s);
			}
		}
		System.out.println("");
		
	}
	
	public static void getLabeledContinue(){
		
		System.out.println("The Labled version skips specified (usually outer-) body.");
		loop:
		for(int r=1; r <=3; r++){
			System.out.println("R: " + r);
			for(int s=1; s<=3; s++){
				if(r == 2 || s == 2) continue loop;
				System.out.println("S: " + s);
			}
			System.out.println("R2: " + r);
		}
		System.out.println("Need better example here.");	
		System.out.println("");	
		
	}
	
	public static void getReturn(){
		
		System.out.println("Return exits from the current method.");
		System.out.println("It has two forms: one that returns value, and one that doesn't.");
		System.out.println("When a method is declared void simply use return without a type.");	
		
	}
	
	
	
}
