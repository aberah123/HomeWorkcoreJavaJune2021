package hw8Q6Abstraction03;
/*You have 3 abstract class names --MedicalSchool, EngineeringSchool, and NursingSchool. 
 * how many keywords are used for the inheritance in Java for Abstract Class? 
 * Can an Abstract Class inherit other Abstract Class or a regular class or interface? 
 * How many inheritances is possible by an Abstract Class? 
 * Use the all of above Abstract Classes and use the keywords to answer my questions.*/

//This is an abstract class
//We must have to put abstract keyword in an abstract class
public abstract class MedicalSchool implements College {

	public MedicalSchool() {// This is called default constructor

	}

	// method can be implemented and declared in an abstract class
	// we must have to put abstract keyword inside abstract method
	public void anatomyLab() { // method implemented and this is called non-abstract method.
		System.out.println("Anatomy Lab of Medical School");

	}

	public abstract void biochemistryLab(); // method declared and this is called abstract method.

}
/*
 * Two keywords(extends and implements)are used for the inheritance in Java for
 * abstract class. yes,An abstract class can inherit only one abstract class or
 * only one regular class by extends keyword but can not inherit interface by
 * extends keywords. implements keyword can inherit more than one interface.
 */
