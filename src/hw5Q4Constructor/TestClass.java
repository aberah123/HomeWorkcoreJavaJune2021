package hw5Q4Constructor;

public class TestClass {

	public static void main(String[] args) {

		Computer computer1 = new Computer();
		Computer computer2 = new Computer("Apple", "MacBook Air", "MacOS Mojave", 800, 'C', false);
		Computer computer3 = new Computer("dell", "Core i5", "Windows 10", 900, 'A', true);
		Computer computer4 = new Computer("HP");
		Computer computer5 = new Computer("Lenovo", 700, 'B');
		Computer computer6 = new Computer("Acer", "Core i3", "Windows 10 ", false, 600);
	}

}
