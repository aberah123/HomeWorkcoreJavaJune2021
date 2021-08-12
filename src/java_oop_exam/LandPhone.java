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

public class LandPhone implements Phone {
	
	public void interfaceInfo() {
	System.out.println("We cannot instantiate an interface.\n" + "An interface does not contain any constructors.\n"
			+ "All of the methods in an interface are abstract.\n" + "An interface, we can not write variables...\n"
			+ "An interface is not extended by a class; it is implemented by a class.");

	}
  
	public void call() {
	System.out.println("An interface only can extends interface and can inherit more than one interface.\n"
			+ "An interface can implements by abstract and regular class.\n"
			+ "And an abstract or a regular class can inherit more than one interface by implements keyword.");
			
  }

	public void message() {
		System.out.println("An interface have only two implement method , dafault and static type method from java 1.8");
	}

	public void camera() {
	System.out.println("This method is from Interface");	
	}

}
