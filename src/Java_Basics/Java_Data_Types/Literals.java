package Java_Basics.Java_Data_Types;

public class Literals {

	public Literals(){
		getIntegerLiterals();
		getFloatingLiterals();
		getCharString();
		getNull();
		getClassLiteral();
		getUnderscores();
		getCasting();
	}
	
	public static void getUnderscores(){
		System.out.println("Any number of underscores can appear anywhere between digits in a numerical literal.");
		System.out.println("You can't place underscores:");
		System.out.println("1) At the beginning or end of a number.");
		System.out.println("2) Adjacent to a decimal point.");
		System.out.println("3) In positions where a strign of digits is expected?");
		System.out.println("4) Prior to an F or L suffix.");
		System.out.println("Cannot put underscores in (or adjacent to) a number's prefix.");
		System.out.println(" ");
	}
	
	public static void getClassLiteral(){
		System.out.println("There's a special kind of literal called a class literal, formed by taking a type name and appending .class");
		System.out.println("For example: String.class");
		System.out.println("This refers to the object (of type Class) that represents the type itself?");
		System.out.println("...");
		System.out.println(" ");
	}
	
	public static void getNull(){
		System.out.println("There's a special null literal that can be used as a value for any reference type.");
		System.out.println("null may be assigned to any variable, except variables of primitive types.");
		System.out.println(" ");
	}
	
	public static void getFloatingLiterals(){
		getFloat();
		getDouble();
		getScience();
	}
	
	public static void getCharString(){
		System.out.println("Literals of types char and String may contain any Unicode (UTF-16) characters.");
		System.out.println("Can use Unicode Escape...");
		System.out.println("Single quotes for char literals and double quotes for String literals.");
		System.out.println(" ");
	}
	
	public static void getFloat(){
		System.out.println("Float");
		System.out.println("Suffix: f or F.");
		System.out.println("The value 123.4 as a float literal: 123.4F = " + 123.4F);
		System.out.println("");
		
	}
	
	public static void getDouble(){
		System.out.println("Double");
		System.out.println("Suffix: d or D or No Suffix");
		System.out.println("The value 123.4 as a double literal: 123.4D = " + 123.4D);
		System.out.println("");
	}
	
	public static void getScience(){
		System.out.println("Scientific Notation (SN)");
		System.out.println("Floating-point types can be expressed with e or E.");
		System.out.println("The value 123.4 as a double literal with SN: 1.234E2D = " + 1.234E2D);
		System.out.println("The value 123.4 as a float literal with SN: 1.234E2F = " + 1.234E2F);
		System.out.println("");
	}
	
	public static void getIntegerLiterals(){
		System.out.println("An integer literal is of type long if suffixed by an l or L, the latter being preferable, otherwise it is of type int.");
		System.out.println("");
		System.out.println("Values of integral types byte, short, int and long can be created from int literals");
		System.out.println("Values of type long that exceed the range of int can be created from long literals.");
		System.out.println("int iTest = 100L; Will not compile");
		System.out.println("");
		System.out.println("Integer literals can be expressed in the following number systems: ");
		getDecimal();
		getHexadecimal();
		getBinary();
		getOctal();
	}
	
	public static void getDecimal(){
		System.out.println("1) Decimal: Base 10. Digits from 0 - 9. Prefix: None.");
		System.out.println("The value 26 in Decimal: 26 = " + 26);
		System.out.println(" ");
	}
	
	public static void getHexadecimal(){
		System.out.println("2) Hexadecimal: Base 16. Digits from 0 - 9 and Letters from A - F. Prefix: 0x.");
		System.out.println("The value 26 in Hexadecimal: 0x1a = " + 0x1a);
		System.out.println(" ");
	}
	
	public static void getBinary(){
		System.out.println("3) Binary: Base 2. Digits are 0 or 1. Prefix: 0b.");
		System.out.println("The value 26 in Binary: 0b11010 = " + 0b11010);
		System.out.println(" ");
	}
	
	public static void getOctal(){
		System.out.println("4) Octal: Base 8. Digits from 0 - 7. Prefix: 0.");
		System.out.println("The value 26 in Octal: 032 = " + 032);
		System.out.println(" ");
		
	}
	
	public static void getCasting(){
		long distance = 129L;       
		byte taken = (byte)distance;        
		System.out.println(taken);
		
		int depth = 33_000;
		short ascend = (short) depth;
		System.out.println(ascend);
		System.out.println("Bit representation is truncated, not the integer representation");
		System.out.println("http://stackoverflow.com/questions/5624101/casting-long-to-byte-in-java");
		System.out.println("");
	}
	
}




