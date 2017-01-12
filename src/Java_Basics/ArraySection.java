package Java_Basics;
import java.util.Arrays;


public class ArraySection {

	public ArraySection(){
		getArraySection();
		getCreation();
		getMultidim();
		getCopying();
		getManips();
		getOtherManips();
	}
	
	public static void getArraySection(){
		System.out.println("After creation, length is fixed.");
		System.out.println("Type written as: arrayType[]");
		System.out.println("Brackets can come after name: arrayType arrayName[]");
		System.out.println("Space between is ignored.");
		System.out.println(" ");		
	}
	
	public static void getCreation(){		
		System.out.println("Use the 'new' operator.");
		System.out.println("If missing, compiler error.");
		System.out.println("Shortcut syntax: ");
		System.out.println("int[] anArray = {100, 200, 250, 500}; ");
		System.out.println("Array length can be accessed by anArray.length");
		System.out.println(" ");	
	}
	
	public static void getMultidim(){
		System.out.println("An array whose elements are themselves arrays.");
		System.out.println("Rows are able to vary in length.");
		System.out.println("One can infact put the square brackets in any combination of after the type and name. The total number is the dimension.");
		System.out.println("Invisible Example: ");
		int[] twoDarray[] = { 
	            { 32, 87, 3, 589 },
	            { 12, 1076, 2000, 8 },
	            { 622, 127, 77, 955 }
	        }; 
		System.out.println(" ");
	}
	
	public static void getCopying(){
		System.out.println("There is an System.arraycopy method.");
		System.out.println("public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)");
        char[] copyFrom = { 'o', 'n', 'e' };
        char[] copyTo = { 't', 'w', 'o', 's' };
        System.arraycopy(copyFrom, 0, copyTo, 0, 3);
        System.out.println(new String(copyFrom));
        System.out.println(new String(copyTo));
		System.out.println(" ");
	}
	
	public static void getManips(){
		System.out.println("Several methods are provided to perform common manipulations of arrays.");
		System.out.println("E.g. copying, sorting and searching in the java.util.Arrays class.");
        char[] copyFrom = { 'o', 'n', 'e' };
        //char[] copyTo = { 't', 'w', 'o', 's' };
        System.out.println("Second parameter is the inclusive initial index whereas the third is the exclusive final index. NB!!! test that this is different from just the number of elements along");
        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 0, 2);
        System.out.println(new String(copyFrom));
        System.out.println(new String(copyTo));
        System.out.println(" ");
	}
	
	public static void getOtherManips(){
        System.out.println("Several other useful operations provided by java.util.Arrays class.");
        int[] arrayAlpha = {1, 2, 3};
        int[] arrayBravo = new int[3];
        System.arraycopy(arrayAlpha, 0, arrayBravo, 0, 3);
        System.out.println("For Arrays.equals() to return true: lengths and element contents must be the same");
        System.out.println(Arrays.equals(arrayAlpha, arrayBravo));
        System.out.println("fill method?");
        System.out.println(" ");
	}
}
