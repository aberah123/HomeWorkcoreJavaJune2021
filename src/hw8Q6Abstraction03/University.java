package hw8Q6Abstraction03;
/* /*Create interface VocationalSchool and a method vocationalInfo inside it. 
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


//this is an interface
public interface University extends College,Hospital{

	// we can't instantiate Interface classes because there is body in methods
	public default void gymnasium() {// Default method
       System.out.println("This is default method in interface");
       
	}


	public static void library () { // we can write abstract keyword inside the method or not
	System.out.println("This is static method in interface");// Static method
	}
}
//
/*
 * One keywords(Extends)are used for the inheritance for interface Interface can
 * inherit other interface but cannot inherit a regular class or abstract class
 * only one inheritances is possible by an Abstract class
 */