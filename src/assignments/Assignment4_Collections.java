package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment4_Collections {

	public static void main(String[] args) {
		
		//Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined.
		List<String> largestCityNames = new ArrayList<String>();
		largestCityNames.add("India");
		largestCityNames.add("USA");
		largestCityNames.add("UK");
		largestCityNames.add("Australia");
		largestCityNames.add("Canada");
		System.out.println("3rd Largest City Name : " + largestCityNames.get(2));
		System.out.println("4th Largest City Name : " + largestCityNames.get(3));
		
		Set <String> mostVisitedPlaces = new HashSet<String>();
		mostVisitedPlaces.add("India");
		largestCityNames.add("USA");
		largestCityNames.add("UK");
		largestCityNames.add("Australia");
		largestCityNames.add("Canada");
		
	}

}
