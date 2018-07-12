
public class Dog {

	float year;
	String name;
	String breed;

	public Dog(String name, float year) {
		this.name = name;
		this.year = year;

	}

	public  void Bark() {

	}

	public void training(int num) {

		switch (num) {

		case 0:
			System.out.println("Stay on the spot.");
			break;

		case 1:
			System.out.println("Walk forward.");
			break;
		case 2:
			System.out.println("walk backward.");
			break;
		case 3:
			System.out.println("Run.");
			break;
		case 4:
			System.out.println("Jump");
			break;
		case 5:
			System.out.println("Sit");
			break;

		default:
			System.out.println("Unknown command...");
			break;
		}

	}

	public String getBreed() {

		return breed;

	}

}
