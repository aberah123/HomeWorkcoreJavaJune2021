package hw6Q4Abstraction01;

public interface College {

	// method declared in an interface but can not be implemented
	public void commonRoom();// method declared

	public default void laboratory() { // Default method

	}

	public static void languageClub() { // Static method

	}

	/* Interface cannot be instantiated(cannot create object). 
	 * An interface is a collection of methods that are defined but not implemented. 
	 * An interface cannot inherit a regular class or abstract class.
	 *  One extends keywords are used for the inheritance for Interface. 
	 *  An Interface cannot inherit a regular class or abstract class. only one inheritances is possible by an interface.
	 */
}
