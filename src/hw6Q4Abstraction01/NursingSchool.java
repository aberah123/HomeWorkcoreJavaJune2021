package hw6Q4Abstraction01;

//This is an abstract class
//We must have to put abstract keyword in an abstract class
public abstract class NursingSchool {

	public NursingSchool() { // Default Constructor

	}

	// method can be implemented and declared in an abstract class
	// we must have to put abstract keyword inside abstract method
	public abstract void hygiene();// method declared and this is called abstract method.

	public void caring() { // method implemented and this is called non-abstract method.
		System.out.println("Caring of Nursing School");

	}

}

/*
 * One keywords(Extends)are used for the inheritance of Abstract class A
 * abstract class can inherit only one regular class or abstract class but can
 * not inherit an Interface only one inheritance is possible by a Abstract class
 */