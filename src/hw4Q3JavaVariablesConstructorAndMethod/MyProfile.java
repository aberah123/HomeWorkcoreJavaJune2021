package hw4Q3JavaVariablesConstructorAndMethod;

public class MyProfile {//opening of the class body 
	
	public String MyName="Aberah Swailem";
	public int myAge=30;
	public char mySex='f';
	public boolean usaCitizen= false;
	public byte myWorkingYear= 5;
	public short myHouseRent= 3500;
	public long myYearlySalary= 20000;
	public float myGrade=3.46f;
	public double myHeight= 5.345;
	
	public MyProfile() {// constructor declared
	
	}
       
	public void myProfile() {// method implemented
		System.out.println("My name is:"+ MyName+", \nAge:"+ myAge+",\nsex:"+ mySex
				+". \nCitizenship Status"+ usaCitizen+". \nYear of work experience"+ myWorkingYear
				+". \nMy yearly house rent is:"+ myHouseRent+". \nMy yearly salary:"+ myYearlySalary
				+". \nMy grade:"+ myGrade+"and \nmy height:"+ myHeight);
		
		
	}

}
