
public class PlushElectricDog extends ToyDog {

	public PlushElectricDog(String name, float year) {
		super(name, year);
		// TODO Auto-generated constructor stub
	}

	public void Bark() {
		System.out.println(name + " is barking loud...");
	}

	public void training(int num) {
		System.out.println("You can't train a toy!");
	}

	public void charge() {
		
		System.out.println("Put my batteries into a special charger.");

	}

}
