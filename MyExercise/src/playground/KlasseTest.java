package playground;

import java.util.Arrays;
import java.util.Comparator;

public class KlasseTest implements Comparable<KlasseTest> {
	int value;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "-"+value;
	}
	

	public KlasseTest(int value) {
		
		this.value = value;
	}


	public static void main(String[] args) {
		KlasseTest [] arr= {new KlasseTest(15), new KlasseTest(100),new KlasseTest(20)};
	//	Comparator<Integer> cmp = (int1,int2) -> {return int2-int1;};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}


	@Override
	public int compareTo(KlasseTest o) {
		
		return value - o.value;
	}

}
