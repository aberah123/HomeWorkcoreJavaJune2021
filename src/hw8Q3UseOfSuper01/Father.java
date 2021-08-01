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
public class Father {
	// Global variables are declared
	public String FatherName;
	public double age;
	public char sex;
	public boolean usCitizen;
	public String FamilyName;

	// This is called Default Constructor
	public Father() {
		System.out.println("This is a default constructor from Father class");
	}

	// parameterized constructor is declared
	public Father(String FatherName, double age, char sex, boolean usCitizen) {// local variable also called parameter
		this.FatherName = FatherName;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;

		System.out.println("Name: " + FatherName + ", Age: " + age + ", Sex: " + sex + " and US Citizen: " + usCitizen);
	}

	// Void or no return method or non parameterized method
	public void fatherInfo() {
		System.out.println("This void method is from Father class");
	}

	// parameterized method is implemented
	public void info(String fatherName, int age, char sex, boolean usCitizen) {
		this.FatherName = fatherName;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Name: " + fatherName + ", Age: " + age + ", Sex: " + sex + " and US Citizen: " + usCitizen);
	}

}
