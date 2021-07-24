package hw7Q4abstraction02;
/* Create one default and one static method gymnasium and library inside interface "University". 
 * Create one default and one static method morgue and pharmacy inside interface "Hospital". 
 * Create also one default and one static method dorm and studyRoom inside interface "College". 
 * How many keywords are used for the inheritance in Java? 
 * how many keywords are used for the inheritance in Interface, answer by Java comments?
 * if you can use the keyword 'implements' in Interface, please use it. 
 * Use all the interfaces -- University, Hospital, and College to answer my questions.*/



//this is an interface
public interface University {

	// method declared in an interface but can not be implemented
	//public void classSize();// method declared
    // From Java 1.8, Only default and static type method can implemented in
	// interface.

	public default void gymnasium() {// Default method

	}


	public static void library () { // we can write abstract keyword inside the method or not
									// Static method
	}
}

/*
 * One keywords(Extends)are used for the inheritance for interface Interface can
 * inherit other interface but cannot inherit a regular class or abstract class
 * only one inheritances is possible by an Abstract class
 */