package classdesign.wdhKlassen;


class Planet {
	String name;
	int x,y;
	
	public Planet(String name) {
		this.name = name;
	}
	
	void bewegen(int newX, int newY) {
		this.x = newX;
		
		Planet p = this;
		p.y = newY;
	}
	
	public String toString() {
		return name + " [" + this.x + ", " + y + "]"; 
	}
}

class PlanetenUtils {
	static void bewegen(Planet p, int newX, int newY) {
		p.x = newX;
		p.y = newY;
	}
}


public class PlanetenErstellenUndBewegen {

	public static void main(String[] args) {
		Planet erde = new Planet("Erde");
		System.out.println(erde);
		
		PlanetenUtils.bewegen(erde, 20, 30);
		
		System.out.println(erde);
		
		erde.bewegen(40, 50);
		System.out.println(erde);
		
		System.out.println("------------------");
		
		Planet mars = new Planet("Mars");
		mars.bewegen(11, 13);
		PlanetenUtils.bewegen(mars, 14, 15);
		
		System.out.println(mars);
	}

}
