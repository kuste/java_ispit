
public class Helicopter implements Fly {

	private static float distance;
	private String name;
	private int id;
	private float dist;

	public Helicopter(String name, int id) {
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
	public void fly(float speed, String south, float land) {

		distance = distance + land;
		System.out.println("Flying in: " + south);
		System.out.println("Flying in speed: " + speed);

	}

	public static float getDistance() {

		return distance;
	}

	public String toString() {
		return "Helicopter: " + name + ", id: " + id;

	}

}
