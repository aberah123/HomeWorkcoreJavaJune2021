package hw6Q4Abstraction01;

//This is an abstract class
//We must have to put abstract keyword in an abstract class
public abstract class EngineeringSchool {

	public EngineeringSchool() {// this is called default constructor

	}

	// method can be implemented and declared in an abstract class
	// we must have to put abstract keyword inside abstract method
	public abstract void mechanicalLab(); // method declared and this is a abstract method.

	public void computerLab() {// method implemented and this is called non-abstract method.

		System.out.println("Computer lab of engineering School");

	}

}

/*
 * One extends keywords are used for the inheritance for Interface. An Interface
 * cannot inherit a regular class or abstract class. only one inheritances is
 * possible by an interface.
 */