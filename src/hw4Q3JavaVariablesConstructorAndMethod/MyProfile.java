package hw4Q3JavaVariablesConstructorAndMethod;

public class MyProfile {//opening of the class body 
	
	public static String MyName="Aberah Swailem";
	public static int myAge=30;
	public static char mySex='f';
	public static boolean usaCitizen= false;
	public static byte myWorkingYear= 5;
	public static short myHouseRent= 3500;
	public static long myYearlySalary= 20000;
	public static float myGrade=3.46f;
	public static double myHeight= 5.345;
	
	public MyProfile() {// constructor declared
	
	}
       
	public static void myProfile() {// method implemented
		System.out.println("My name is:"+ MyName+", \nAge:"+ myAge+",\nsex:"+ mySex
				+". \nCitizenship Status"+ usaCitizen+". \nYear of work experience"+ myWorkingYear
				+". \nMy yearly house rent is:"+ myHouseRent+". \nMy yearly salary:"+ myYearlySalary
				+". \nMy grade:"+ myGrade+"and \nmy height:"+ myHeight);
		
		System.out.println("My name is:"+ MyName+", \nAge:"+ myAge+",\nsex:"+ mySex
				+". \nCitizenship Status"+ usaCitizen+". \nYear of work experience"+ myWorkingYear
				+". \nMy yearly house rent is:"+ myHouseRent+". \nMy yearly salary:"+ myYearlySalary
				+". \nMy grade:"+ myGrade+"and \nmy height:"+ myHeight);

	}

}
