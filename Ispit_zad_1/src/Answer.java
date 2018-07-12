import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Answer {
	public Answer() {

	}

	public void sortAscList(LinkedHashSet<Integer> lista) {

		TreeSet<Integer> set = new TreeSet<>();
		for (int br : lista) {

			set.add(br);

		}
		System.out.println("Uzlazno sortirane:\n" + set);

	}

	public void sortDescList(LinkedHashSet<Integer> lista) {
		Set<Integer> sorted = new TreeSet<>(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});
		sorted.addAll(lista);
		
		System.out.println("Silazno sortirane:\n" + sorted);

	}

	public void calcAvgList(LinkedHashSet<Integer> lista) {

		float sum = 0;
		for (int i : lista) {
			sum = sum + i;
		}

		float AVG = sum / lista.size();

		System.out.println("AVG:\n" + AVG);

	}
}
