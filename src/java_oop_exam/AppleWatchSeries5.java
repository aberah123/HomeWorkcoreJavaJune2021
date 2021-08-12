package java_oop_exam;
/*Assume AppleWatch is an abstract class which has 2 method: One is abstractClassInfo [which is a non-abstract method, print out all the features of an abstract class compared with Interface, regular class].
 * what type of method would be the other one - name appleWatchInfo?
 * Can you create a constructor inside Abstract Class? 
 * Create two interface names Watch, . And a regular class name AppleWatchSeries5. 
 * Can you make a relationship with AppleWatch, Watch, DigitalWatch, and AppleWatchSeries5?
 */

// A regular class inherits a abstract class by extends keyword
// Here AppleWatch is a parent class and AppleWatchSeries is a child class or sub class 
public class AppleWatchSeries5 extends AppleWatch {

	@Override
	public void appleWatchInfo() {
		System.out.println("This method appleWatchInfo is from abstract class");

	}

}
