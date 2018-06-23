import java.util.LinkedHashSet;
import java.util.Random;

public class Generator {

	public Generator() {

	}

	public LinkedHashSet<Integer> genNum(int input) {
		LinkedHashSet<Integer> lista = new LinkedHashSet<>();
		Random r = new Random();
		for (int i = 0; i < input; i++) {

			int br = r.nextInt((100 - 1) + 1) + 1;

			lista.add(br);

		}
		return lista;

	}

}
