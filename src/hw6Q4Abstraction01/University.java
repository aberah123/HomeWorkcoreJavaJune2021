package hw6Q4Abstraction01;

//this is an interface
public interface University {

	// method declared in an interface but can not be implemented
	public void classSize();// method declared

	public default void field() {// Default method

	}

	public static void teacher() { // we can write abstract keyword inside the method or not
									// Static method
	}
}

/*
 * One keywords(Extends)are used for the inheritance for interface Interface can
 * inherit other interface but cannot inherit a regular class or abstract class
 * only one inheritances is possible by an Abstract class
 */