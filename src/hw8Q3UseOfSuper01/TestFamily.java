package hw8Q3UseOfSuper01;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("---------- Default Constructor initialized-----------\n");
		Father father = new Father();
		Father father2 = new Father("Shafiqur Rahman", 65, 'M', false);

		father2.fatherInfo();
		father2.info("Shafiqur Rahman", 65, 'M', false);// Parameterized method initialized

		System.out.println("\n------------Default Constructor initialized------------\n");
		Son son = new Son();

		System.out.println("\n------------parameterized constructor initialized------------\n");
		Son son2 = new Son(23478, 'C');

		System.out.println("\n----------void type method initialized------------\n");
		son2.son();

		System.out.println("\n------------void type parameterized method initialized-----------\n");
		son2.sonInfo(23478, 'C');

		System.out.println("\n-------------void type method inherited from Father Class");
		son2.fatherInfo();

		System.out.println("\n----------parameterized method inherited from Father Class------------\n");
		son2.info("Shafiqur Rahman", 65, 'M', false);

	}

}
