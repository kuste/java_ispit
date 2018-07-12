public class Calculation {

	private String rjesenje;

	public Calculation() {

	}

	public void calculate(int a, int b, int c) {

		int D = (int) Math.pow(b, 2) - (4 * a * c);
		if (D > 0) {
			this.rjesenje = ("Dva realna rjesenja\n");
		} else if (D == 0) {
			this.rjesenje = ("Dvostruka nul tocka\n");
		} else {
			this.rjesenje = ("Rjesenje je konjugirano kompleksno\n");
		}
	}

	public String getRjesenje() {
		return rjesenje;
	}

}
