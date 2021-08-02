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

public interface College {

	// method declared in an interface but can not be implemented
	// From Java 1.8, Only default and static type method can implemented in
	// interface.
	// public void commonRoom();// method declared

	public default void dorm() { // Default method
      System.out.println("this is called default method of interface");
      
      
	}

	public static void studyRoom() { // Static method
     System.out.println("This is called static method of interface");
     
     
	}

	/* one keywords (extends)are used for the inheritance for interface
	 * Interface can inherit other interface but can not inherit a regular class or abstract class
	 * More than one interfaces are inherited by an interface by extends keywords.
	 */
}
