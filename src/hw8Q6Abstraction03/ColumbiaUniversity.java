package hw8Q6Abstraction03;

/* Create interface VocationalSchool and a method vocationalInfo inside it. 
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
 * Call all the possible methods from ColumbiaUniversity , RockefellerUniversity, University, Hospital, MedicalSchool and NursingSchool.*/

public class ColumbiaUniversity extends MedicalSchool implements University,VocationalSchool {

	/*
	 * Abstract method declared Here abstract void chemistry(); is not possible to
	 * create Regular Class contains only non abstract methods, doesn't contain
	 * abstract methods
	 */

	public ColumbiaUniversity () { //This is called Default Constructor
		System.out.println("This is a default constructor of ColumbiaUniversity class");

	}

	public void biology() { // Non-abstract method implemented
		System.out.println("we are learning biology");

	}


/*
 * Here is Two Keywords(implemented and extends) are used for the inheritance for a regular class 
 * A regular class can inherit only one regular class or only one abstract class but can not inherit an Interface  by extends keyword 
 * Only one Inheritance is possible by a regular class Implements keyword can inherit more than one
 * interface
 */

             @Override
           public void vocationalInfo() {
        	   System.out.println("This method is from VocationalSchool which is abstract class");
        	   
        	    }
             @Override
           public void anatomyLab() {
        	   System.out.println("This method is from MedicalSchool which is abstract class");
        	   
        	   }
             @Override
           public void hygiene() {
        	   System.out.println("This method is from NursingSchool which is abstract class");
        	   
        	   
           }
}