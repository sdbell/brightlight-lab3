package Java_Basics.Java_Data_Types;

public class Primitives {
	
	public static String stringType;
	public static byte byteType;
	public static short shortType;
	public static int intType;
	public static long longType;
	public static float floatType;
	public static double doubleType;
	public static boolean booleanType;
	public static char charType;

	public Primitives(){
		System.out.println("The eight primitive data types supported by the Java programming language are:");
		getLongType();
		System.out.println("");
		getFloatType();
		System.out.println("");
		getDoubleType();
		System.out.println("");
		getCharType();
		System.out.println("");
		getBooleanType();
		System.out.println("");
	}
	
	public static String getStringType(){
		System.out.println("Special support via the java.lang.String");
		System.out.println("String Objects are immutable and is technically not a primitive.");
		System.out.println("Accessing an uninitialized local variable will result in a compile-time error.");
		return stringType;
	}
	
	public static byte getByteType(){
		System.out.println("8-bit signed two's complement integer.");
		System.out.println("Min value: -128");
		System.out.println("Max value: 127");
		System.out.println("Default Value for fields: 0");
		return byteType;
	}

	public static short getShortType(){
		System.out.println("16-bit signed two's complement integer.");
		System.out.println("Min value: -32,768");
		System.out.println("Max value: 32,767");
		System.out.println("Default Value for fields: 0");
		return shortType;
	}
	
	public static int getIntType(){
		System.out.println("32-bit signed two's complement integer.");
		System.out.println("Min value: -2^(31)");
		System.out.println("Max value: 2^(31)-1");
		System.out.println("Default Value for fields: 0");
		return intType;
	}
	
	public static long lTest; 	
	public static long getLongType(){
		System.out.println("64-bit signed two's complement integer.");
		System.out.println("Min value: -2^(63)");
		System.out.println("Max value: 2^(63)-1");
		System.out.println("Default Value for fields: 0L ");
		System.out.println("Default Value for fields displays as: " + lTest);
		return longType;
	}
	
	public static float fTest;
	public static float getFloatType(){
		System.out.println("single-precision 32-bit floating point.");
		System.out.println("Min value: ?");
		System.out.println("Max value: ?");
		System.out.println("Default Value for fields: 0.0f ");
		System.out.println("Default Value for fields displays as: " + fTest);		
		return floatType;
	}
	
	public static double dTest;
	public static double getDoubleType(){
		System.out.println("double-precision 64-bit floating point.");
		System.out.println("Min value: ?");
		System.out.println("Max value: ?");
		System.out.println("Default Value for fields: 0.0d ");
		System.out.println("Default Value for fields displays as: " + dTest);	
		return doubleType;
	}
	
	public static boolean bTest;
	public static boolean getBooleanType(){
		System.out.println("Represents 1-bit of information but its size isn't precisely defined.");
		System.out.println("Min value: false");
		System.out.println("Max value: true");
		System.out.println("Default Value for fields: false ");
		System.out.println("Default Value for fields displays as: " + bTest);
		return booleanType;
	}
	
	public static char cTest;
	public static char getCharType(){
		System.out.println("A single 16-bit Unicode character.");
		System.out.println("");
		System.out.println("Demo of Char int arithmatic?");
		
		byte kite = 10;
		char alpha = 50;
		char beta = 51;
		short height = 110;
		int p = 5;
		
		System.out.println(alpha + 1);
		alpha = (char) (alpha + 1);
		System.out.println(alpha);
		System.out.println("");
		System.out.println("Assigning a int literal to a char reference is makinf the reference point to the ASCII char of the int value?");
		System.out.println("Min value: '\u0000' or 0");
		System.out.println("Max value: '\uffff' or 65,535");
		System.out.println("Default Value for fields: \u0000 or u0000 with a preceeding \\");
		System.out.println("Default Value for fields displays as: " + cTest);
		return charType;
	}
}