import java.util.ArrayList;

public class Solution {
	private int redbr;
	private String rjesenje;
	private static int calc = 1;

	public Solution(String rj) {
		this.rjesenje = rj;
		this.redbr = calc++;

	}

	public String toString() {
		return "Rjesenje br: " + redbr + " je " + rjesenje;
	}
}
