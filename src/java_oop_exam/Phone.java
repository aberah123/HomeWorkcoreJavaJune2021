
package java_oop_exam;
/* Phone is an interface that has four abstract method interfaceInfo, call, message, camera and 2 non-abstract method - battery and wireless which are implemented. 
 * from this 2 method -- print out what type of method they are. [for example -- "battery is a ...... method from Java ....."].
 * When you get a chance to implement interfaceInfo, print out answers for the following questions:
 * [What are the features of Interface you know?
 * Can we create a constructor inside an interface? 
 * Can we write variables inside Interface? 
 * Don't copy-paste, write how much you can remember, use newline (\n), tab(\t)], for other abstract methods which will be implemented, also print whatever you like. 
 * Do you think we can extends or implements Interface? Single or multiple? 
 * Create two interface Pager and Wakitaki (Phone interface inherit them) and One regular class name LandPhone and one abstract class SatelitePhone. 
 * make a relation of this 4, with Phone if possible*/

// Here phone interface extends pager and wakitaki
// This is multiple inheritance
// An interface extanding other interfaces,but in Java does not allow multiple inheritance when its class.
public interface Phone extends Pager, Wakitaki {
	// method can be implemented and declared in an abstract class
	// we must have to put abstract keyword inside abstract method
	// All of the methods are declared in an interface and this is a abstract method
	public void interfaceInfo();

	public void call();

	public void message();

	public void camera();

	// method implemented here and this is a non-abstract method.
	public default void battery() {
		System.out.println("Battery is a default type method from java 1.8");
	}

	public static void wireless() {
		System.out.println("Wireless is a static type method from java 1.8");
	}

}
// Interface can not be instantiated(cannot create object)
// An Interface does not contain any constructor
// All of the methods in an interface are abstract
// An interface is not extended by a class,it is implemented by a class.
