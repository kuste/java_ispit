
public class RoboDog extends ToyDog  {

	public RoboDog(String name, float year) {
		super(name, year);
		// TODO Auto-generated constructor stub
	}

	
	public void charge() {
		System.out.println("Connect a charger...");

	}

	public void Bark() {
		System.out.println(name + " is barking loud...");
	}

	public void traning(int num) {

	}

	public void intDivision(int num1, int num2) {

		if (num2 != 0) {
			int div = num1 / num2;
			System.out.println("Rez: " + div);
		} else {
			System.out.println("Nemozete dijeliti s 0!");
		}

	}
}
