package hw8Q6Abstraction03;

public class TestInstitute {

	public static void main(String[] args) {
		System.out.println("Instantiating ColumbiaUniversity Class below:");
		System.out.println("*********Default Constructor Initialized*********");
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		System.out.println("*********Void typed biology method*********");
		columbiaUniversity.biology();
		System.out.println("******Calling all the possible methods from ColumbiaUniversity******");
		columbiaUniversity.vocationalInfo(); 
		columbiaUniversity.anatomyLab();
		columbiaUniversity.hygiene();
		columbiaUniversity.biochemistryLab();
		columbiaUniversity.biology();
		columbiaUniversity.caring();
		columbiaUniversity.dorm();
		columbiaUniversity.gymnasium();
		columbiaUniversity.morgue();
		columbiaUniversity.statistics();

		System.out.println("\nInstantiating RockefellerUniversity Class below:");
		System.out.println("*********Default Constructor of RockefellerUniversity Class**********");
		RockefellerUniversity rockefellerUniversity = new RockefellerUniversity();
		System.out.println("*********Void typed statistics method*********");
		rockefellerUniversity.statistics();
		System.out.println("******Calling all the possible methods from RockefellerUniversity******");
		rockefellerUniversity.statistics();

		System.out.println("\nInstantiating University class:------");
		University university = new ColumbiaUniversity();
		System.out.println("*********Default method in Interface**********");
		university.gymnasium();
		System.out.println("*********Static method in Interface**********");
		University.library();
		System.out.println("******Calling all the possible methods from University******");
		university.dorm();
		university.gymnasium();
		university.morgue();

		System.out.println("\nInstantiating Hospital class:--------");
		Hospital hospital = new ColumbiaUniversity();
		System.out.println("*********Default method in Interface**********");
		hospital.morgue();
		System.out.println("*********Static method in Interface**********");
		Hospital.pharmacy();
		System.out.println("******Calling all the possible methods from Hospital******");

		System.out.println("\nInstantiating MedicalSchool class:--------");
		System.out.println("*********Default Constructor of abstract Class**********");
		MedicalSchool medicalSchool = new ColumbiaUniversity();
		System.out.println("*********Declared method in abstract class**********");
		medicalSchool.anatomyLab();
		System.out.println("*********Void typed method in abstract class**********");
		medicalSchool.biochemistryLab();
		System.out.println("******Calling all the possible methods from MedicalSchool******");
		medicalSchool.caring();
		medicalSchool.hygiene();
		medicalSchool.statistics();

		System.out.println("\nInstantiating NursingSchool class:--------");
		System.out.println("*********Default Constructor of abstract Class**********");
		NursingSchool nursingSchool = new ColumbiaUniversity();
		System.out.println("*********Declared method in abstract class**********");
		nursingSchool.hygiene();
		System.out.println("*********Void typed method in abstract class**********");
		nursingSchool.caring();
		System.out.println("******Calling all the possible methods from NursingSchool******");
		nursingSchool.statistics();

	}



	}


