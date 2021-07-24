package hw6Q3Inheritance;

public class TestAnimal {

	public static void main(String[] args) {
		// Java does not support multiple inheritance because of two reasons:In Java,
		// every class is a child of Object class
		// Another reason, In Java every class has a constructor,if we write it clearly
		// or not.

		Animal animal = new Animal();
		animal.animalInfo();

		Birds birds = new Birds();
		birds.birdsInfo();
		birds.mammalInfo(); // Yes, an object can call other methods if the class is extended and this is
							// called 'mammalInfo' method.

		BullDog bullDog = new BullDog();
		bullDog.bulldogInfo();
		bullDog.dogInfo(); // Yes, an object can call other methods if the class is extended and this is
							// called 'dogInfo' method.

		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo(); // Yes, an object can call other methods if the class is extended and this is
							// called 'snakeInfo' method.

		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo(); // Yes, an object can call other methods if the class is extended and this is
							// called 'mammalInfo' method.

		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo(); // Yes, an object can call other methods if the class is extended and this is
								// called 'animalInfo' method.

		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo(); // Yes, an object can call other methods if the class is extended and this is
								// called 'animalInfo' method.

		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo(); // Yes, an object can call other methods if the class is extended and this is
							// called 'birdsInfo' method.

		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo(); // Yes, an object can call other methods if the class is extended and this is
								// called 'reptileInfo' method.

	}

}
