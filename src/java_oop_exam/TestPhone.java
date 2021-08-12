package java_oop_exam;

public class TestPhone {
	public static void main(String[] args) {
		System.out.println("********instantiating Iphone1 *********");
		Iphone1 iphone1 = new Iphone1();
		iphone1.regularClassInfo();
		iphone1.appleWatchInfo();
		iphone1.interfaceInfo();
		iphone1.call();
		iphone1.message();
		iphone1.camera();
		iphone1.battery();

		System.out.println("\n********** instantiating AppleWatch abstract class**********");
		AppleWatch appleWatch = new Iphone1();
		appleWatch.abstractClassInfo();
		appleWatch.appleWatchInfo();

		System.out.println("\n********instantiating Phone********");
		Phone phone = new Iphone1();
		phone.interfaceInfo();
		phone.call();
		phone.message();
		phone.camera();
		phone.battery();
		Phone.wireless();

		System.out.println("\n**********accesing private variables*********");
		iphone1.setInfo("I bought this phone in 2000");
		iphone1.setPrice(750);
		iphone1.setUser('F');
		iphone1.setMadeInUSA(false);
		System.out.println(iphone1.getInfo() + "\nThe price is: " + iphone1.getPrice() + "\nUser: " + iphone1.getUser()
				+ "\nMade in USA: " + iphone1.isMadeInUSA());

		System.out.println("\n***********instantiating Iphone6**********");
		Iphone6 iphone6 = new Iphone6();
		iphone6.email();
		iphone6.photos();
		iphone6.dropbox();
		iphone6.youtube();
		iphone6.compass();
		iphone6.appleWatchInfo();
		iphone6.interfaceInfo();
		iphone6.call();
		iphone6.message();
		iphone6.camera();
		iphone6.getPrice();
		iphone6.getInfo();
		iphone6.getUser();
		iphone6.isMadeInUSA();
		iphone6.setPrice(750);
		iphone6.setInfo("I bought this phone in 2000");
		iphone6.setUser('F');
		iphone6.setMadeInUSA(false);

		System.out.println("\n**********instantiating Iphone2 Class************");
		Iphone2 iphone2 = new Iphone2();
		System.out.println("\n******* Parameterized Constructor********* ");
		Iphone2 iphoneObj = new Iphone2('F');
		System.out.println("\n************** Void Type Method*********");
		iphoneObj.iphone2Info();
		System.out.println("\n**********Parameterized Method********");
		iphoneObj.iphone2Info('F');
		System.out.println("\n*********Youtube Method*********");
		iphoneObj.youtube();

		System.out.println("\n***********instantiating Iphone6 Class**********");
		Iphone6 iphone6Obj = new Iphone6();
		System.out.println("\n********Return Type Method*********");
		iphone6Obj.materials(400, 500);
		System.out.println("\n********Parameterized type Method********");
		iphone6Obj.materials(400, 500, 600);
		System.out.println("\n*********Final Type Method*********");
		iphone6Obj.materials(400, 500, 250);
		System.out.println("\n********Static Type Method********");
		Iphone6.materials(600);
		System.out.println("\n******Void Type Method****** ");

		System.out.println("\n*********calling Override method*********");
		ConfiguredIphone6 configuredIphone6 = new ConfiguredIphone6();
		configuredIphone6.materials(400, 500);
		configuredIphone6.materials(400, 500, 600);
		ConfiguredIphone6.materials(500);
		configuredIphone6.materials();

	}
	/* Hierarchical Inheritance- is a kind of inheritance where more than one class is inherited from a single parent or base class.
	    here, phone is a hierarchical inheritance.
	    
	    Multilevel Inheritance- when a class extends a class , which extends another class then this is called multilevel inheritance.
	    Here phone interface extends pager and wakitaki.
        This is multilevel inheritance.
        An interface extanding other interfaces,but in Java does not allow multiple inheritance when its class.
        
         Single Inheritance- When a derived class inherits properties and behavior from a single parent class/base class/superclass, it is
         called single inheritance. Here DigitalWatch is a parent/super/base class and Watch is a child/sub class.
         
      */
}
