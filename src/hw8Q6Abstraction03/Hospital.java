package hw8Q6Abstraction03;
/*Create interface VocationalSchool and a method vocationalInfo inside it. 
* Create another interface AeronauticalSchool and a method aeronauticalInfo inside it. 
* See the below inheritance. 
* University extends College, Hospital.
* ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool. 
* MedicalSchool extends NursingSchool. 
* NursingSchool extends RockefellerUniversity. 
* RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool.
* EngineeringSchool extends NYUniversity. 
* Follow all the above hierarchy to inherit the methods. 
* Now create a class TestInstitute. 
* Then Instantiate ColumbiaUniversity , RockefellerUniversity, University, Hospital, MedicalSchool and NursingSchool one by one. 
 Call all the possible methods from ColumbiaUniversity , RockefellerUniversity, University, Hospital, MedicalSchool and NursingSchool.*/

//Interface cannot be instantiated(cannot create object). 
//An interface is a collection of methods that are defined but not implemented.

public interface Hospital  {

	// method declared in an interface but can not be implemented
	// ();//method declared
	// From Java 1.8, Only default and static type method can implemented in
	// interface.

	public default void morgue() {
       System.out.println("This is default method of interface");
       
	}

	public static void pharmacy() {// Static method
         System.out.println("This is static method of interface");
         
         
	}

}
/*
 *  One extends keywords are used for the inheritance for Interface. 
 *  An Interface cannot inherit a regular class or abstract class. 
 *  More than  one interfaces are inherited by an interface by extends keywords
 */