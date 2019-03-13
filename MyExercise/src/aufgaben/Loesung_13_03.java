package aufgaben;

import java.awt.List;
import java.util.ArrayList;

import javax.swing.plaf.ToolBarUI;

public class Loesung_13_03 {

	public static void main(String[] args) {

		String[] arr = { "mo", "di", "mi" };

		ArrayList<String> list = transform(arr, new ToUpperCase());

		System.out.println(list); // [MO, DI, MI]
		
		Transformation ttt = new ABC();
		
		list = transform(arr, ttt);
		System.out.println(list);
	}

	
	
	private static ArrayList<String> transform(String[] arr, Transformation t) {

		ArrayList<String> tmp = new ArrayList<>();
		for (String string : arr) {
			String str = t.execute(string);
			tmp.add(str);
		}
		return tmp;
	}
	
	

}

interface Transformation {
	
	public abstract String execute(String s);
}

class ToUpperCase implements Transformation {
	public String execute (String s) {
		return "(" + s + ")";
	}
}

class WithPunkt implements Transformation {
	public String execute (String s) {
		return s + ".";
	}
}

class ABC extends WithPunkt {
//	public String execute (String s) {
//		return s + "abcccc";
//	}
}