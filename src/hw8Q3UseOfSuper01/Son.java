package hw8Q3UseOfSuper01;
/* Create a package name "hw8Q3UseOfSuper01" in the HW project. 
 * Inside the package, a) Create a class name Father. declare some variable like Name, age, sex, usCitizen, FamilyName. 
 * Declare default and parameterized constructor from the first 4 variables. 
 * Use FamilyName variable for use by super keyword. 
 * Create a regular void method father() which is implemented, declare a sysout. 
 * Create a parameterized method fatherInfo which also contain it's 4 variables, declare a sysout 
 * b) Create a class name Son, declare variable Id, grade. 
 * Declare default and parameterized constructor, and implement a regular method son and declare a sysout. 
 * Create a parameterized method sonInfo() which contains 2 of its variables. 
 * Son extends Father (super class). Use super method, super keyword and show all of their use in child class. and initialize in a TestFamily Class.
 */

// Here Son is a child class(or sub class ) and
// Father is a Parent class(or Super Class or Base class)

public class Son extends Father {
	// Variables declared
	public int sonId;
	public char grade;

	// Default Constructor
	public Son() {
		// we use super method to call the constructor of super class
		// Constructor call must be the first statement in a constructor, try putting
		// the super method (after sysout of default constructor)
		// Either default or parameterized constructor can be called, thats why below
		// line in comment out
		// super();
		super("Shafiqur Rahman", 65, 'M', false);
		// super keyword is used to call (initialize) the methods of Parent class
		// super keyword is used to call (initialize) the variables of Parent class
		super.fatherInfo();
		super.info("Shafiqur Rahman", 65, 'M', false);
		super.FamilyName = "Shafiq";
		System.out.println("Family Name:" + FamilyName);
		System.out.println("This is from default constructor of Son class");
	}

	// parameterized constructor of Son class
	public Son(int sonId, char grade) {
		// Either default or parameterized constructor can be called, thats why below
		// line in comment out
		super();
		// super("Shafiqur Rahman",65,'M',false);
		super.fatherInfo();
		super.info("Shafiqur Rahman", 65, 'M', false);
		super.FamilyName = "Shafiq";
		System.out.println("Family Name:" + FamilyName);
		this.sonId = sonId;
		this.grade = grade;
		System.out.println(" ID: " + sonId + ", Grade: " + grade);
	}

	// Regular void type method implemented
	public void son() {
		// We can not call constructor of super class inside a method of child class
		// super();
		// super("Shafiqur Rahman",65,'M',false);
		super.fatherInfo();
		super.info("Shafiqur rahman", 65, 'M', false);
		super.FamilyName = "Shafiq";
		System.out.println("Family Name:" + FamilyName);
		System.out.println("This void method is from Son class");
	}

	// parameterized method
	public void sonInfo(int sonId, char grade) {
		// we can't call constructor of super class inside a method of child class.
		// super();
		super.fatherInfo();
		super.info("Shafiqur Rahman", 65, 'M', false);
		super.FamilyName = "Shafiq";
		System.out.println("Family Name:" + FamilyName);
		this.sonId = sonId;
		this.grade = grade;
		System.out.println(" ID: " + sonId + ", Grade: " + grade);

	}

}
