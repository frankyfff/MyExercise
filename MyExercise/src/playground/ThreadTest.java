package playground;

import java.util.Scanner;

public class ThreadTest {

			public static void main(String[] args) {
				
				
				Scanner tmp = new Scanner(System.in);
				
				Scanner tmp2 = new Scanner(System.in) {
					
					@Override
					public int hashCode() {
						// TODO Auto-generated method stub
						return super.hashCode();
					}
					
				};
				
				
			}

}
