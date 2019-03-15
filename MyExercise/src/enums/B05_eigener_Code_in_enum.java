package enums;

import java.io.IOException;

enum Size {
	SMALL(0.5), 
	MEDIUM, 
	LARGE(1.5);
	
	private double volume = 1;
	
	Size(){
		
	}
	
	Size(double volume){
		this.volume = volume;
	}
	
	public double getVolume() {
		return volume;
	}

	@Override
	public String toString() {
		return name().toLowerCase();
	}
	
}


public class B05_eigener_Code_in_enum {

	public static void main(String[] args) {
		for (Size s : Size.values()) {
			System.out.println("size = "+s);
			System.out.println("size.getVolume(): " + s.getVolume());
		}
		
//		Size[] d = Size.values();
//		for (int i = 0; i < 3; i++) {
//			System.out.println(d[i]);
		
		
//		}
	}

}
