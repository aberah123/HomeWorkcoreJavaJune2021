package hw5Q3variableAndMethod;

public class TestComputer {

	public static void main(String[] args) {
		Computer myComputer = new Computer();
		myComputer.Brand = "Apple";
		myComputer.Model = "MacBook Air";
		myComputer.OperatingSystem = "MacOS Mojave";
		myComputer.price = 800;
		myComputer.madeInUSA = false;
		myComputer.computer();
		System.out.println("****************");

		Computer shariarComputer = new Computer();
		shariarComputer.Brand = "Hp";
		shariarComputer.Model = "Core i3";
		shariarComputer.OperatingSystem = "Windows 10";
		shariarComputer.price = 600;
		shariarComputer.madeInUSA = true;
		shariarComputer.grade = 'A';
		shariarComputer.computer();

	}

}
