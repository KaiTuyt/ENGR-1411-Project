import java.util.HashMap;

public class Map {
	
	// This HashMap contains the location of each building on campus
	HashMap<double[], String> campusLocations = new HashMap<double[], String>();
	
	public Map() {
		campusLocations.put(new double[] {35.210985, -97.441888}, "Devon Energy Hall");
		campusLocations.put(new double[] {35.210454, -97.441687}, "EPF");
		campusLocations.put(new double[] {35.211080, -97.442668}, "Carson");
		campusLocations.put(new double[] {35.211046, -97.442727}, "Gallogly");
		campusLocations.put(new double[] {35.210530, -97.443038}, "Felgar");
		campusLocations.put(new double[] {35.210792, -97.440442}, "Sarkeys energy center");
		campusLocations.put(new double[] {35.210608, -97.448287}, "Catlett");
		campusLocations.put(new double[] {35.208180, -97.445840}, "Bizzell");
		campusLocations.put(new double[] {35.209961, -97.444204}, "Union");
		campusLocations.put(new double[] {35.209987, -97.444258}, "Quiznos");
		campusLocations.put(new double[] {35.207289, -97.446609}, "Nielsen");
		campusLocations.put(new double[] {35.204456, -97.446552}, "Dale");
		campusLocations.put(new double[] {35.209562, -97.447279}, "Physical Sciences Centers");
		campusLocations.put(new double[] {35.208036, -97.444448}, "Adams Hall");
		campusLocations.put(new double[] {35.209066, -97.445068}, "Carnegie Building");
		campusLocations.put(new double[] {35.210535, -97.444224}, "Carpenter Hall");
		campusLocations.put(new double[] {35.209648, -97.446660}, "Chemistry Buildings");
		campusLocations.put(new double[] {35.196086, -97.446704}, "Coats Hall");
		campusLocations.put(new double[] {35.205780, -97.446454}, "Collings Hall");
		campusLocations.put(new double[] {35.205110, -97.446593}, "Copeland Hall");
		campusLocations.put(new double[] {35.206793, -97.445242}, "Cross Hall");
		campusLocations.put(new double[] {35.207196, -97.447505}, "Farzeneh Hall");
		campusLocations.put(new double[] {35.210908, -97.447414}, "Fred Jones");
		campusLocations.put(new double[] {35.204656, -97.445099}, "Gaylord");
		campusLocations.put(new double[] {35.206865, -97.446484}, "Gittinger Hall");
		campusLocations.put(new double[] {35.205513, -97.444870}, "Gould Hall");
		campusLocations.put(new double[] {35.206162, -97.446659}, "Kaufman Hall");
		campusLocations.put(new double[] {35.202512, -97.443915}, "Observatory");
		campusLocations.put(new double[] {35.208931, -97.446225}, "Old Science Hall");
		campusLocations.put(new double[] {35.207911, -97.443662}, "Price Hall");
		campusLocations.put(new double[] {35.207184, -97.444566}, "Richards Hall");
		campusLocations.put(new double[] {35.207217, -97.448262}, "Zarrow Hall");
		campusLocations.put(new double[] {}, "Old Faculty Club");
		campusLocations.put(new double[] {}, "Boyd House");
		campusLocations.put(new double[] {}, "Whitehand Hall");
		campusLocations.put(new double[] {}, "Fred Jones Art Center");
		campusLocations.put(new double[] {}, "Carson Engineering Center");
		campusLocations.put(new double[] {}, "Devon Energy Hall");
		campusLocations.put(new double[] {}, "Fine Arts Center");
		campusLocations.put(new double[] {}, "Donald W. Reynolds Performing Arts Center");
		campusLocations.put(new double[] {}, "Jacobson Faculty Hall");
		campusLocations.put(new double[] {}, "Craddock Hall");
		campusLocations.put(new double[] {}, "Elm Avenue Parking Facility");
		campusLocations.put(new double[] {}, "Chemistry Building");
		campusLocations.put(new double[] {}, "Monnet Hall");
		campusLocations.put(new double[] {}, "Oklahoma Memorial Union");
		campusLocations.put(new double[] {}, "OMU Parking Center");
		campusLocations.put(new double[] {}, "Engineering Lab");
		campusLocations.put(new double[] {}, "Physical Plant Complex");
		campusLocations.put(new double[] {}, "Burton Hall");
		campusLocations.put(new double[] {}, "Sutton Hall");
		campusLocations.put(new double[] {}, "");
		campusLocations.put(new double[] {}, "");
		campusLocations.put(new double[] {}, "");
		campusLocations.put(new double[] {}, "");
		campusLocations.put(new double[] {}, "");
		campusLocations.put(new double[] {}, "");
		campusLocations.put(new double[] {}, "");
		campusLocations.put(new double[] {}, "");
		campusLocations.put(new double[] {}, "");
		campusLocations.put(new double[] {}, "");
		campusLocations.put(new double[] {}, "");
		campusLocations.put(new double[] {}, "");
		campusLocations.put(new double[] {}, "");
		campusLocations.put(new double[] {}, "");
		campusLocations.put(new double[] {}, "");
		campusLocations.put(new double[] {}, "");
		campusLocations.put(new double[] {}, "");
		campusLocations.put(new double[] {}, "");
		campusLocations.put(new double[] {}, "");
		campusLocations.put(new double[] {}, "");
		campusLocations.put(new double[] {}, "");
		campusLocations.put(new double[] {}, "");
		campusLocations.put(new double[] {}, "");
		campusLocations.put(new double[] {}, "");
		campusLocations.put(new double[] {}, "");
		campusLocations.put(new double[] {}, "");
		campusLocations.put(new double[] {}, "");
	}
	
	// This method returns the center location for a list of n locations.
	public double[] center(double[][] locations) {
		double xSum = 0;
		double ySum = 0;
		for(int i = 0; i < locations.length; i++) {
			xSum += locations[i][0];
			ySum += locations[i][1];
		}
		return new double[] {xSum/locations.length, ySum/locations.length};
	}
	
	public String closestBuilding(double[][] locations) {
		//Finds the center locations
		double[] center = center(locations);
		
		// Creates the first location as the closest and computes its distance from the center
		double[] closestBuildingLoc = (double[]) campusLocations.keySet().toArray()[0];
		double closestBuildingDist = distFrom(closestBuildingLoc, center);
		
		// This runs through each location in campusLocations
		for(double[] location: campusLocations.keySet()) {
			// This updates the clostestBuildingLoc and closestBuildingDist if the location is closer.
			if(closestBuildingDist > distFrom(location, center)) {
				closestBuildingLoc = location;
				closestBuildingDist = distFrom(location, center);
			}
		}
		
		return campusLocations.get(closestBuildingLoc);
	}
	
	public double distFrom(double[] locTo, double[] locFrom) {
		return Math.sqrt(Math.pow(locTo[0] - locFrom[0], 2) + Math.pow(locTo[1] - locFrom[1], 2));
	}
	
}

//// Java program to calculate Distance Between 
//// Two Points on Earth 
//import java.util.*; 
//import java.lang.*; 
//
//class GFG { 
//
//	public static double distance(double lat1, 
//					double lat2, double lon1, 
//								double lon2) 
//	{ 
//
//		// The math module contains a function 
//		// named toRadians which converts from 
//		// degrees to radians. 
//		lon1 = Math.toRadians(lon1); 
//		lon2 = Math.toRadians(lon2); 
//		lat1 = Math.toRadians(lat1); 
//		lat2 = Math.toRadians(lat2); 
//
//		// Haversine formula 
//		double dlon = lon2 - lon1; 
//		double dlat = lat2 - lat1; 
//		double a = Math.pow(Math.sin(dlat / 2), 2) 
//				+ Math.cos(lat1) * Math.cos(lat2) 
//				* Math.pow(Math.sin(dlon / 2),2); 
//			
//		double c = 2 * Math.asin(Math.sqrt(a)); 
//
//		// Radius of earth in kilometers. Use 3956 
//		// for miles 
//		double r = 6371; 
//
//		// calculate the result 
//		return(c * r); 
//	} 
//
//	// driver code 
//	public static void main(String[] args) 
//	{ 
//		double lat1 = 53.32055555555556; 
//		double lat2 = 53.31861111111111; 
//		double lon1 = -1.7297222222222221; 
//		double lon2 = -1.6997222222222223; 
//		System.out.println(distance(lat1, lat2, 
//						lon1, lon2) + " K.M"); 
//	} 
//} 
//
//// This code is contributed by Prasad Kshirsagar