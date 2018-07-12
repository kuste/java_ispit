import java.util.ArrayList;
import java.util.Random;

public class App {

	public static void main(String[] args) {

		ArrayList<Helicopter> hellist = new ArrayList<>();
		ArrayList<Aeroplane> aerolist = new ArrayList<>();

		for (int i = 1; i < 6; i++) {

			if ((i % 2) == 0) {
				aerolist.add(new Aeroplane("Falcon_" + i, i));
			} else {
				hellist.add(new Helicopter("Bravo_" + i, i));
			}

		}

		try {
			int loop = 1;
			int b = 1;
			for (int j = 0; j != hellist.size(); j++) {
				System.out.println("Loop: " + loop++ + "\nHeli: " +b);
				System.out.println("------------------------------");
				
				System.out.println(hellist.get(j));	
				hellist.get(j).fly(250, "South", genRndFloat(100, 200));
				System.out.println("------------------------------");
				
				System.out.println("Loop: " + loop++ + "\nAero: " + b++);
				System.out.println("------------------------------");
				
				System.out.println(aerolist.get(j));
				aerolist.get(j).fly(1000, "North", genRndFloat(1000, 2000));
				System.out.println("------------------------------");

			}
		} catch (Exception e) {

		}

		System.out.println("Helicopter distance:\n" + Helicopter.getDistance());
		System.out.println("*******************************");
		System.out.println("Aeroplane distance:\n" + Aeroplane.getDistance());

	}

	public static float genRndFloat(int max, int min) {
		Random rnd = new Random();
		float res = rnd.nextFloat() * (max - min) + min;

		return res;
	}

}
