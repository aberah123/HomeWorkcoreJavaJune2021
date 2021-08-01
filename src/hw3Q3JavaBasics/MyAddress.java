package hw3Q3JavaBasics;

public class MyAddress {
	static String MyNameString = "Aberah Swailem";
	static int houseNumber = 4045;
	static String StreetName = "West Chester Pike";
	static String CityNameString = "WestChester";
	static String State = "PA";
	static int zipCode = 19382;
	static String Apartment = "A40";

	public static void main(String[] args) {
		System.out.println("MyName");
		System.out.println("houseNumber" + " StreetName");
		System.out.println("CityName" + "State" + "zipcode");
		System.out.println(Apartment + "\n\t" + "**********");
		System.out.println("MyName" + "\n" + houseNumber + "" + StreetName + "\n" + CityNameString + "," + State + "\n"
				+ zipCode + "\n" + Apartment);

	}

}



