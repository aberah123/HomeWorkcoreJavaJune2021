package hw8Q6Abstraction03;
/*NursingSchool extends RockefellerUniversity. 
 * RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool.
 * EngineeringSchool extends NYUniversity. 
 * Follow all the above hierarchy to inherit the methods. 
 * Now create a class TestInstitute. 
 * Then Instantiate ColumbiaUniversity , RockefellerUniversity, University, Hospital, MedicalSchool and NursingSchool one by one. 
 Call all the possible methods from ColumbiaUniversity , RockefellerUniversity, University, Hospital, MedicalSchool and NursingSchool.
*/
public abstract class NursingSchool extends RockefellerUniversity {

	public NursingSchool() { // Default Constructor is declared here

	}

	// method can be implemented and declared in an abstract class
	// we must have to put abstract keyword inside abstract method
	public abstract void hygiene();// method declared and this is called abstract method.

	public void caring() { // method implemented and this is called non-abstract method.
		System.out.println("Caring of Nursing School");

	}

}

/*
 * Two keywords(extends and implements)are used for the inheritance in Java for
 * abstract class. yes,An abstract class can inherit only one abstract class or
 * only one regular class by extends keyword but can not inherit interface by
 * extends keywords. implements keyword can inherit more than one interface.
 */