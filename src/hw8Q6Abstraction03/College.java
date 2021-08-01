package hw8Q6Abstraction03;
/*Create one default and one static method gymnasium and library inside interface "University".
 * Create one default and one static method morgue and pharmacy inside interface "Hospital". 
 * Create also one default and one static method dorm and studyRoom inside interface "College". 
 * How many keywords are used for the inheritance in Java? 
 * how many keywords are used for the inheritance in Interface, answer by Java comments? 
 * if you can use the keyword 'implements' in Interface, please use it. 
 * Use all the interfaces -- University, Hospital, and College to answer my questions.*/

//Interface cannot be instantiated(cannot create object). 
//An interface is a collection of methods that are defined but not implemented.

public interface College extends University {

	// method declared in an interface but can not be implemented
	// From Java 1.8, Only default and static type method can implemented in
	// interface.
	// public void commonRoom();// method declared

	public default void dorm() { // Default method

	}

	public static void studyRoom() { // Static method

	}

	/*
	 * two keywords (extents and implements) are used inheritance in Java One
	 * extends keywords are used for the inheritance for Interface. An interface
	 * cannot inherit a regular class or abstract class. One extends keywords are
	 * used for the inheritance for Interface. An Interface cannot inherit a regular
	 * class or abstract class. only one inheritances is possible by an interface.
	 */
}
