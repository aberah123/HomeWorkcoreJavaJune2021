package hw5Q5Constructor;

public class Student {
	public String StName;
	public int stID;
	public char sex;
	public boolean programmer;
	public float grade;

	public Student() {
		System.out.println("This is from default constructor of student class");
	}

	public Student(String StName, int stID, char sex, float grade, boolean programmer) {
		this.StName = StName;
		this.stID = stID;
		this.sex = sex;
		this.programmer = programmer;
		this.grade = grade;
		System.out.println("Student name: " + StName + ", ID: " + stID + ", Sex: " + sex + ", Grade: " + grade
				+ ", Programmer: " + programmer);
	}

	public void info(String StName, int stID, char sex, boolean programmer, float grade) {
		System.out.println("Student name: " + StName + ", ID: " + stID + ", Sex: " + sex + ", Programmer: " + programmer
				+ ", Grade: " + grade);

	}
}
