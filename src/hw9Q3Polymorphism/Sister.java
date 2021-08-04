package hw9Q3Polymorphism;

/*Create a package "hw9Q3Polymorphism" inside your HW project and execute the remaining. 
 * Read the question very carefully.
 * Create a class Sister. 
 * Can you create several methods with the same name inside it? 
 * Give the method name ageOfSisters. 
 * As a variable, use int age1, int age2, int age3, String age4, int age5, int age6 etc in different combination.
 * Use void type, parameterized type, return type, static type, final type method by different combinations of the above variable. 
 * Tell me what is the Method overloading. 
 * initialize all the methods in TestFamily class. 
 * Create another class Niece and inherit Sister. 
 * Override all the possible methods by changing logic. 
 * If some methods are not possible to override, please explain why by comments. 
 * Initialize all the methods in TestFamily class.*/
public class Sister {
	// Return type parameterized method (1)implemented
	public int ageOfSisters(int age1, int age2, int age3, int age4, int age5, int age6) {
		int totalageOfSisters = age1 + age2 + age3 + age4 + age5 + age6;
		System.out.println("totalageOfSisters:" + totalageOfSisters);
		return totalageOfSisters;

	}

	// This is called method overloading(same method name but different type of
	// parameter/signature or different combination of parameter
	// Final type parameterized method (2)implemented
	public final int ageOfSisters(int age1, int age2, int age3, int age4) {
		int olderageOfSisters = age1 + age2 + age3 + age4;
		System.out.println("Older sisters age:" + olderageOfSisters);
		return olderageOfSisters;

	}

	// Return type parameterized method (3)implemented but one of the signature is
	// String type
	public int ageOfSisters(int age1, int age2, int age3, String sistersage) {
		int youngerageOfSisters = age1 + age2 + age3 + Integer.parseInt(sistersage);
		System.out.println("Younger Sisters age:" + youngerageOfSisters);
		return youngerageOfSisters;

	}

	// This is a static type method
	public static int ageofSisters(int age1, int age2) {
		int youngestageOfSisters = age1 + age2;
		System.out.println("youngest sisters age:" + youngestageOfSisters);
		return youngestageOfSisters;

	}

	public void ageOfSisters() {
		System.out.println("This is a void type method");
	}
}
// Method overloading-multiple methods with same name but different numbers of parameter,types of parameter.
