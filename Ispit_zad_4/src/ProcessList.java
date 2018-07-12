import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ProcessList {

	public void processingList(ArrayList<String> lista) {

		int i = 0;

		for (String s : lista) {
			int num = 0;
			num = num + s.length();
			System.out.println(s + "\n" + num);

		}

	}

	public void sortingListDesc(ArrayList<String> lista) {
		String[] array = new String[lista.size()];
		int br = 0;
		for(String s:lista) {
			array[br]=s;
			br++;
		}
		Arrays.sort(array, new Comparator<String>() {
	        @Override
	        public int compare(String a, String b) {
	            return Integer.compare(b.length(),a.length());
	        }
	    });
	     System.out.println(Arrays.toString(array));
	
	}

}
