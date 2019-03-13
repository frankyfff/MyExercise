package aufgaben;

import java.util.ArrayList;

public class Loesung_13_03 {

	public static void main(String[] args) {
	
		Test t = new Test();
		String[] arr = { "mo", "di", "mi" };
		t.transform("AAAA");
		t.transform("BBBB");
		t.transform("CCCC");
		t.ausgabe();
//		ArrayList<String> list = .transform(arr);
//		System.out.println(list);

	}
	
//	class InnerClass implements Transformation{
//
//		@Override
//		public ArrayList transform(String[] ar) {
//			ArrayList<String> tmp = new ArrayList<>();
//			
//			for (int i = 0; i < ar.length; i++) {
//				tmp.add(ar[i].toUpperCase());
//			}
//			return tmp;
//		}
//		
//	}
	
	

}

interface Transformation {
	public abstract ArrayList transform(String[] ar);

}


class Test implements Transformation {

	ArrayList<String> tmp;
	StringBuilder sb = new StringBuilder();
	
	@Override
	public ArrayList transform(String[] ar) {
		tmp = new ArrayList<>();
		
		for (int i = 0; i < ar.length; i++) {
			tmp.add(ar[i].toUpperCase());
		}
		return tmp;
	}
	
	//---------------------------------------------------------
	
	public ArrayList transform(String[] ar, String punkt) {
		tmp = new ArrayList<>();
		
		
		
		for (int i = 0; i < ar.length; i++) {
			
			if (punkt == ".") {
				tmp.add(ar[i].concat(punkt));
			} else {
				tmp.add(ar[i] + "("+ ar[i].length() + ")");
			}
			
		}
		return tmp;
	}
	//----------------------------------------------------------
	
	public StringBuilder transform(String tmp) {
		
		
		sb.append(tmp);
		return sb;
	}
	
	
	
	//---------------------------------------------------------
	
	public void ausgabe() {
//		for(String s : tmp) {
//		
//			System.out.println(s);
//		}
		System.out.println(sb.toString());
	}
	

	
	

	
	
}

//abstract class Transformation {
//	  public abstract static ArrayList transform(String[] ar);
//}
