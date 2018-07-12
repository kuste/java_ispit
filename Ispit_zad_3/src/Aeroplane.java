
public class Aeroplane implements Fly {
	private static float distance;
	private String name;
	private int id;
	private float dist;

	public Aeroplane(String name, int id) {
		this.name = name;
		this.id = id;

	}

	@Override
	public void takeOff() {

	}

	@Override
	public void land() {

	}

	@Override
	public void fly(float takeoff, String north, float land) {
		
		distance = distance + land;
		System.out.println("Flying in: " + north);
		System.out.println("Flying in speed: " + takeoff);

	}

	public static float getDistance() {
		return distance;
	}

	public String toString() {
		return "Aeroplane: " + name + ", id: " + id;

	}
}
