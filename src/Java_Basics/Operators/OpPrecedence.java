package Java_Basics.Operators;

public class OpPrecedence {

	public OpPrecedence(){
		System.out.println("All binarys op except for assignment are evaluated from left to right.");
		System.out.println("Assignment ops are evaulated from right to left.");
		System.out.println(" ");
		getPrecedence();
		getUnary();
		getTernary();
		getModulo();
		getInstanceOf();
		getBitwise();
	}
	
	public static void getPrecedence(){
		
		System.out.println("Postfix: expr++ expr--");
		System.out.println("Unary: ++expr --expr +expr -expr ~ !");
		System.out.println("Multiplicative: * / %");
		System.out.println("Additive: + -");
		System.out.println("Shift << >> >>>");
		System.out.println("Relational: < > <= >= instanceof");
		System.out.println("Equality: == !=");
		System.out.println("Bitwise AND: &");
		System.out.println("Bitwise exclusive OR: ^");
		System.out.println("Bitwise inclusive OR: |");
		System.out.println("Logical AND: &&");
		System.out.println("Logical OR: ||");
		System.out.println("Ternary: ? :");
		System.out.println("Assignment: = += -= *= /= %= &= ^= |= <<= >>= >>>=");
		System.out.println(" ");

	}
	
	public static void getUnary(){
		
		System.out.println("+ indicates positive value.");
		System.out.println("- negates an expression.");
		System.out.println("prefix evaluates to changed value.");
		System.out.println("postfix evaluates to origin value.");
		System.out.println(" ");
		
		int x = 2;            
		int y = ++x + x++ + + x; 
		System.out.println("Y = " + y);
		System.out.println("Demonstrates that going left to right the value of x is indeed updated postfix and doesn't wait till the next line.");
		System.out.println(" ");
		
		int r = 2;            
		r = r++;            
		System.out.println(r);
		
		System.out.println(" ");
		
	}
	
	public static void getTernary(){
		
		//(10 < 12)?System.out.println("Java and C are sisters") : System.out.println("Java and C are enemies"); 
		System.out.println((10 < 12)? "Java and C are sisters" : "Java and C are enemies");
		System.out.println("Ternary operator returns a value and thusly its operands must evaluate.");
		System.out.println(" ");
		
		System.out.println((10 < 12)? get1() : get2());
		System.out.println("Method calls can be used but must return something.");
		System.out.println(" ");
	}
	
	public static String get1(){
		return "Java and C are sisters";
	}
	
	public static String get2(){
		return "Java and C are enemies";
	}
	
	public static void getModulo(){
		
		System.out.println("Modulo can be used with floating points in Java.");
		System.out.println("Demonstrates that floating points are not precise!");
		System.out.println("http://stackoverflow.com/questions/27674611/why-operator-can-not-be-used-for-float-in-c-c-but-can-be-used-in-java-and-c");
		System.out.println(" ");
		
	}
	
	interface MyInterface {}
	static class Parent implements MyInterface {}
	static class Child extends Parent {}
	
    static Parent obj1 = new Parent();
    static Parent obj2 = new Child();	
	
	public static void getInstanceOf(){
		
		System.out.println("Seems common sense approach works here: child 'inherits' from parent but not vice versa.");
		System.out.println(obj2 instanceof MyInterface);
		System.out.println("Null is not an instanceof anything.");
		System.out.println(" ");
		
	}
	
	public static void getBitwise(){
		
		System.out.println("Bitwise '~' inverts a bit pattern.");
		int bitTest = - 0b10; // 110 (invisible sign bit included)
		System.out.println(bitTest);
		bitTest = ~bitTest; // 001 (invisible sign bit included)
		System.out.println(bitTest);
		System.out.println("Bitshifts to be included.");
		System.out.println(" ");
		
	}
}
