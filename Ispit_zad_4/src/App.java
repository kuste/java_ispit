import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<>();

		popList(lista);
	
		ProcessList proces = new ProcessList();
		proces.processingList(lista);
		proces.sortingListDesc(lista);
	}

	public static void popList(ArrayList<String> lista) {
		Scanner input = new Scanner(System.in);
		int i = 0;
		while(i<3) {
			System.out.println("Unesite grad");
			String s = input.nextLine();
			if (s.matches("^\\d+(\\.\\d+)?+") || s.matches("[^\\s\\w]*")) {
				System.out.println("Enter Propper name for the city...");
			} else {
				lista.add(s);
				i++;
			}

		}
	}

}
