package hw7Q4abstraction02;
/*You have 3 regular class names -- ColumbiaUniversity, NYUniversity, RockefellerUniversity.
 * how many keywords are used for the inheritance in Java for a regular Class?
 * Can an regular Class inherit other Abstract Class or a regular class or interface? 
 * How many inheritances is possible by a regular Class?
 * Use the all of above regular Classes and use the keywords to answer my questions.*/

public class RockefellerUniversity implements College{

	/*
	 * Abstract method declared Here abstract void math(); is not possible to create
	 * Regular Class contains only non abstract methods, doesn't contain abstract
	 * methods
	 */

	public void statistics() {// Non-abstract method implemented
		System.out.println("Statistics of RockefellerUniversity");

	}

	public RockefellerUniversity() {// This is called Default Constructor

	}
}
/*
 * Here is Two Keywords(implemented and extends) are used for the inheritance
 * for a regular class A regular class can inherit only one regular class or
 * only one abstract class but can not inherit an Interface Only one Inheritance is possible by a regular class
 * Implements keyword can inherit more than one interface
 */
