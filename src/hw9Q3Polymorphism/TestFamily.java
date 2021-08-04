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
public class TestFamily {

	public static void main(String[] args) {
		System.out.println("********Instantiating Sister Class********");
		Sister sister = new Sister();
		sister.ageOfSisters(25,28,30,32,35,40);// Return type parameterized method (1)initialized
        sister.ageOfSisters(35,38,40,45);// Final type parameterized method initialized
        sister.ageOfSisters(30,35,40,"56");// Return type parameterized method initialized but one of the signature is String type
        Sister.ageofSisters(26,30);// static type method initialized called by class
        sister.ageOfSisters();// void type method initialized
        
        System.out.println("**********Instantiating Niece Class********");
        Niece niece = new Niece();
        niece.ageOfSisters(25,28,30,32,35,40);
        niece.ageOfSisters(30,35,40,"56");
        Niece.ageofSisters(26,30);
        niece.ageOfSisters();
	}
	

}
