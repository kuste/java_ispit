

public class App {

	public static void main(String[] args) {

		GoldRetriver gold = new GoldRetriver("goldy", 4);
		
		gold.Bark();
		gold.eat();
		gold.training(4);
		System.out.println("//////////////////////////////////");
		LabradorDog lab = new LabradorDog("Dogo", 12);

		lab.Bark();
		lab.eat();
		lab.training(2);
		System.out.println("//////////////////////////////////");
		PlushElectricDog plush = new PlushElectricDog("Electro", 2000);

		plush.Bark();
		plush.charge();
		plush.training(6);
		System.out.println("//////////////////////////////////");
		RoboDog rob = new RoboDog("Roboto", 1255);

		rob.Bark();
		rob.charge();
		rob.training(1);
		rob.intDivision(12, 4);

	}

}
