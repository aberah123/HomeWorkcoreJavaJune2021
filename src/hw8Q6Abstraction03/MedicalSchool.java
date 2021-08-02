package hw8Q6Abstraction03;
/*/*Create interface VocationalSchool and a method vocationalInfo inside it. 
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

//This is an abstract class
//We must have to put abstract keyword in an abstract class
public abstract class MedicalSchool extends NursingSchool {

	public MedicalSchool() {// This is called default constructor

	}

	// method can be implemented and declared in an abstract class
	// we must have to put abstract keyword inside abstract method
	public abstract void anatomyLab(); // method declared must have to put abstract keyword
	

	

	public void biochemistryLab() { // method declared and this is called abstract method.
      System.out.println("This biochemistryLab is from MedicalSchool");
      
}

}

/*
 * Two keywords(extends and implements)are used for the inheritance in Java for
 * abstract class. yes,An abstract class can inherit only one abstract class or
 * only one regular class by extends keyword but can not inherit interface by
 * extends keywords. implements keyword can inherit more than one interface.
 */
