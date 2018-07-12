import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Generator gen = new Generator();
		Answer ans = new Answer();
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj elemenata liste izmedju 7 i 20: ");

		if (input.hasNextInt()) {

			int br = input.nextInt();
			if (br < 7 || br > 20) {
				System.out.println("bla");
			} else {
				LinkedHashSet<Integer> lista = gen.genNum(br);

				System.out.println("Originalna lista:\n" + lista);

				ans.sortAscList(lista);
				ans.sortDescList(lista);
				ans.calcAvgList(lista);
			}
		} else {
			System.out.println("aaaaaa");
		}

	}

}
