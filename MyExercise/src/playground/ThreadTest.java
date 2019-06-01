package playground;

import java.io.File;
import java.io.IOException;

public class ThreadTest {

	public static void main(String[] args) {

		
			public class country {
				public enum Continent {ASIA, EUROPE}
				String name;
				Continent region;

			public Country (String na, Continent reg) {
				name = na, region = reg;
			} public String getName () {
				return name;
			} public Continent getRegion () {
				return region;}
			}

		//	and the code fragment:
			
			List<Country> couList = Arrays.asList ( 
					new Country ("Japan", Country.Continent.ASIA), 
					new Country ("Italy", Country.Continent.EUROPE), 
					new Country ("Germany", Country.Continent.EUROPE));
			
			Map<Country.Continent, List<String>> regionNames = couList.stream ()
					
			.collect(Collectors.groupingBy (Country ::getRegion,
			
			Collectors.mapping(Country::getName, Collectors.toList()))));
			System.out.println(regionNames);
	}
}
