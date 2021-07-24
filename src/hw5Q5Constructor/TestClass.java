package hw5Q5Constructor;

public class TestClass {

	public static void main(String[] args) {
		Student student = new Student();
		Student student1 = new Student("Aberah", 2021008, 'f', 3.976f, true);
		student1.info("Aberah", 2021008, 'F', false, 3.976f);

	}

}
