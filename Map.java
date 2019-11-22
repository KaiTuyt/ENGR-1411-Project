import java.util.Collections;
import java.util.HashMap;

public class Map {

	// This HashMap contains the location of each building on campus
	HashMap<double[], String> campusLocations = new HashMap<double[], String>();
	HashMap<double[], String> meetingLocations = new HashMap<double[], String>();

	public HashMap<double[], String> getCampusLocations() {
		return campusLocations;
	}

	public Map() {
<<<<<<< HEAD
		campusLocations.put(new double[] { 35.210985, -97.441888 }, "Devon Energy Hall");
		campusLocations.put(new double[] { 35.210454, -97.441687 }, "EPF");
		campusLocations.put(new double[] { 35.211080, -97.442668 }, "Carson");
		campusLocations.put(new double[] { 35.211046, -97.442727 }, "Gallogly");
		campusLocations.put(new double[] { 35.210530, -97.443038 }, "Felgar");
		campusLocations.put(new double[] { 35.210792, -97.440442 }, "Sarkeys Energy Center");
		campusLocations.put(new double[] { 35.210608, -97.448287 }, "Catlett");
		campusLocations.put(new double[] { 35.208180, -97.445840 }, "Bizzell");
		campusLocations.put(new double[] { 35.209961, -97.444204 }, "Union");
		campusLocations.put(new double[] { 35.209987, -97.444258 }, "Quiznos");
		campusLocations.put(new double[] { 35.207289, -97.446609 }, "Nielsen");
		campusLocations.put(new double[] { 35.204456, -97.446552 }, "Dale");
		campusLocations.put(new double[] { 35.209562, -97.447279 }, "Physical Sciences Centers");
		campusLocations.put(new double[] { 35.208036, -97.444448 }, "Adams Hall");
		campusLocations.put(new double[] { 35.209066, -97.445068 }, "Carnegie Building");
		campusLocations.put(new double[] { 35.210535, -97.444224 }, "Carpenter Hall");
		campusLocations.put(new double[] { 35.209648, -97.446660 }, "Chemistry Buildings");
		campusLocations.put(new double[] { 35.196086, -97.446704 }, "Coats Hall");
		campusLocations.put(new double[] { 35.205780, -97.446454 }, "Collings Hall");
		campusLocations.put(new double[] { 35.205110, -97.446593 }, "Copeland Hall");
		campusLocations.put(new double[] { 35.206793, -97.445242 }, "Cross Hall");
		campusLocations.put(new double[] { 35.207196, -97.447505 }, "Farzeneh Hall");
		campusLocations.put(new double[] { 35.210908, -97.447414 }, "Fred Jones");
		campusLocations.put(new double[] { 35.204656, -97.445099 }, "Gaylord");
		campusLocations.put(new double[] { 35.206865, -97.446484 }, "Gittinger Hall");
		campusLocations.put(new double[] { 35.205513, -97.444870 }, "Gould Hall");
		campusLocations.put(new double[] { 35.206162, -97.446659 }, "Kaufman Hall");
		campusLocations.put(new double[] { 35.202512, -97.443915 }, "Observatory");
		campusLocations.put(new double[] { 35.208931, -97.446225 }, "Old Science Hall");
		campusLocations.put(new double[] { 35.207911, -97.443662 }, "Price Hall");
		campusLocations.put(new double[] { 35.207184, -97.444566 }, "Richards Hall");
		campusLocations.put(new double[] { 35.207217, -97.448262 }, "Zarrow Hall");
		campusLocations.put(new double[] { 35.211834, -97.446430 }, "Old Faculty Club");
		campusLocations.put(new double[] { 35.211661, -97.446135 }, "Boyd House");
		campusLocations.put(new double[] { 35.211735, -97.444785 }, "Whitehand Hall");
		campusLocations.put(new double[] { 35.210794, -97.447463 }, "Fred Jones Art Center");
		campusLocations.put(new double[] { 35.210200, -97.447363 }, "Fine Arts Center");
		campusLocations.put(new double[] { 35.210259, -97.446587 }, "Donald W. Reynolds Performing Arts Center");
		campusLocations.put(new double[] { 35.210428, -97.444940 }, "Jacobson Faculty Hall");
		campusLocations.put(new double[] { 35.209558, -97.448431 }, "Elm Avenue Parking Facility");
		campusLocations.put(new double[] { 35.209438, -97.446719 }, "Chemistry Building");
		campusLocations.put(new double[] { 35.209562, -97.445042 }, "Monnet Hall");
		campusLocations.put(new double[] { 35.209733, -97.444226 }, "OMU Parking Center");
		campusLocations.put(new double[] { 35.209442, -97.443166 }, "Engineering Lab");
		campusLocations.put(new double[] { 35.209233, -97.441985 }, "Physical Plant Complex");
		campusLocations.put(new double[] { 35.209047, -97.448705 }, "Burton Hall");
		campusLocations.put(new double[] { 35.208911, -97.447195 }, "Sutton Hall");
		campusLocations.put(new double[] { 35.209270, -97.446229 }, "Wallace Science Hall");
		campusLocations.put(new double[] { 35.209254, -97.445384 }, "Carnegie Building");
		campusLocations.put(new double[] { 35.209009, -97.443296 }, "Nuclear Engineering Laboratory");
		campusLocations.put(new double[] { 35.208485, -97.448568 }, "Goddard Health Center");
		campusLocations.put(new double[] { 35.198638, -97.445768 }, "Jim Thorpe Multicultural Center");
		campusLocations.put(new double[] { 35.208580, -97.445698 }, "Evans Hall");
		campusLocations.put(new double[] { 35.208561, -97.444479 }, "Buchanan Hall");
		campusLocations.put(new double[] { 35.207992, -97.447330 }, "Ellison Hall");
		campusLocations.put(new double[] { 35.207819, -97.444318 }, "Adams Hall");
		campusLocations.put(new double[] { 35.207885, -97.443662 }, "Michael F. Price Hall");
		campusLocations.put(new double[] { 35.208433, -97.443108 }, "Lissa and Cy Wagner Hall");
		campusLocations.put(new double[] { 35.208268, -97.442324 }, "McCasland Field House");
		campusLocations.put(new double[] { 35.207099, -97.447505 }, "Hester Hall");
		campusLocations.put(new double[] { 35.206345, -97.447529 }, "Robertson Hall");
		campusLocations.put(new double[] { 35.207201, -97.444566 }, "Richards Hall");
		campusLocations.put(new double[] { 35.206976, -97.443820 }, "Armory");
		campusLocations.put(new double[] { 35.206742, -97.446538 }, "Gittinger Hall");
		campusLocations.put(new double[] { 35.206616, -97.445243 }, "George Lynn Cross Hall");
		campusLocations.put(new double[] { 35.206924, -97.444917 }, "Noble Microscopy Laboratory");
		campusLocations.put(new double[] { 35.205950, -97.442325 }, "Gaylord Family Oklahoma Memorial Stadium");
		campusLocations.put(new double[] { 35.206109, -97.446649 }, "Kaufman Hall");
		campusLocations.put(new double[] { 35.205701, -97.446486 }, "Ellsworth Collings Hall");
		campusLocations.put(new double[] { 35.205513, -97.444870 }, "Gould Hall");
		campusLocations.put(new double[] { 35.204961, -97.446571 }, "Copeland Hall");
		campusLocations.put(new double[] { 35.204436, -97.447204 }, "Dale Hall Tower");
		campusLocations.put(new double[] { 35.204369, -97.446616 }, "Dale Hall Classroom Bldg");
		campusLocations.put(new double[] { 35.205786, -97.443769 }, "Asp Avenue Parking Facility");
		campusLocations.put(new double[] { 35.204621, -97.445099 }, "Gaylord Hall");
		campusLocations.put(new double[] { 35.204193, -97.440333 }, "Jefferson House Dormitory");
		campusLocations.put(new double[] { 35.204548, -97.439688 }, "Collums Bldg");
		campusLocations.put(new double[] { 35.204490, -97.440797 }, "Bud Wilkinson Dormitory");
		campusLocations.put(new double[] { 35.204586, -97.438280 }, "Mosier Indoor Athletic Facility");
		campusLocations.put(new double[] { 35.204928, -97.438898 }, "Everest Training Center");
		campusLocations.put(new double[] { 35.203622, -97.446313 }, "Cate Center");
		campusLocations.put(new double[] { 35.203312, -97.444969 }, "David L. Boren Hall");
		campusLocations.put(new double[] { 35.202863, -97.443872 }, "Henderson-Tolson Cultural Center");
		campusLocations.put(new double[] { 35.201710, -97.446514 }, "Adams Tower");
		campusLocations.put(new double[] { 35.201670, -97.444954 }, "Walker Tower");
		campusLocations.put(new double[] { 35.210985, -97.441888 }, "Devon Energy Hall");
		campusLocations.put(new double[] { 35.210454, -97.441687 }, "EPF");
		campusLocations.put(new double[] { 35.211080, -97.442668 }, "Carson");
		campusLocations.put(new double[] { 35.211046, -97.442727 }, "Gallogly");
		campusLocations.put(new double[] { 35.210530, -97.443038 }, "Felgar");
		campusLocations.put(new double[] { 35.210792, -97.440442 }, "Sarkeys energy center");
		campusLocations.put(new double[] { 35.210608, -97.448287 }, "Catlett");
		campusLocations.put(new double[] { 35.208180, -97.445840 }, "Bizzell");
		campusLocations.put(new double[] { 35.209961, -97.444204 }, "Union");
		campusLocations.put(new double[] { 35.209987, -97.444258 }, "Quiznos");
		campusLocations.put(new double[] { 35.207289, -97.446609 }, "Nielsen");
		campusLocations.put(new double[] { 35.204456, -97.446552 }, "Dale");
		campusLocations.put(new double[] { 35.209562, -97.447279 }, "Physical Sciences Centers");
		campusLocations.put(new double[] { 35.208036, -97.444448 }, "Adams Hall");
		campusLocations.put(new double[] { 35.209066, -97.445068 }, "Carnegie Building");
		campusLocations.put(new double[] { 35.210535, -97.444224 }, "Carpenter Hall");
		campusLocations.put(new double[] { 35.209648, -97.446660 }, "Chemistry Buildings");
		campusLocations.put(new double[] { 35.196086, -97.446704 }, "Coats Hall");
		campusLocations.put(new double[] { 35.205780, -97.446454 }, "Collings Hall");
		campusLocations.put(new double[] { 35.205110, -97.446593 }, "Copeland Hall");
		campusLocations.put(new double[] { 35.206793, -97.445242 }, "Cross Hall");
		campusLocations.put(new double[] { 35.207196, -97.447505 }, "Farzeneh Hall");
		campusLocations.put(new double[] { 35.210908, -97.447414 }, "Fred Jones");
		campusLocations.put(new double[] { 35.204656, -97.445099 }, "Gaylord");
		campusLocations.put(new double[] { 35.206865, -97.446484 }, "Gittinger Hall");
		campusLocations.put(new double[] { 35.205513, -97.444870 }, "Gould Hall");
		campusLocations.put(new double[] { 35.206162, -97.446659 }, "Kaufman Hall");
		campusLocations.put(new double[] { 35.202512, -97.443915 }, "Observatory");
		campusLocations.put(new double[] { 35.208931, -97.446225 }, "Old Science Hall");
		campusLocations.put(new double[] { 35.207911, -97.443662 }, "Price Hall");
		campusLocations.put(new double[] { 35.207184, -97.444566 }, "Richards Hall");
		campusLocations.put(new double[] { 35.207217, -97.448262 }, "Zarrow Hall");
		campusLocations.put(new double[] { 35.211834, -97.446430 }, "Old Faculty Club");
		campusLocations.put(new double[] { 35.211661, -97.446135 }, "Boyd House");
		campusLocations.put(new double[] { 35.211735, -97.444785 }, "Whitehand Hall");
		campusLocations.put(new double[] { 35.210794, -97.447463 }, "Fred Jones Art Center");
		campusLocations.put(new double[] { 35.210200, -97.447363 }, "Fine Arts Center");
		campusLocations.put(new double[] { 35.210259, -97.446587 }, "Donald W. Reynolds Performing Arts Center");
		campusLocations.put(new double[] { 35.210428, -97.444940 }, "Jacobson Faculty Hall");
		campusLocations.put(new double[] { 35.209558, -97.448431 }, "Elm Avenue Parking Facility");
		campusLocations.put(new double[] { 35.209438, -97.446719 }, "Chemistry Building");
		campusLocations.put(new double[] { 35.209562, -97.445042 }, "Monnet Hall");
		campusLocations.put(new double[] { 35.209733, -97.444226 }, "OMU Parking Center");
		campusLocations.put(new double[] { 35.209442, -97.443166 }, "Engineering Lab");
		campusLocations.put(new double[] { 35.209233, -97.441985 }, "Physical Plant Complex");
		campusLocations.put(new double[] { 35.209047, -97.448705 }, "Burton Hall");
		campusLocations.put(new double[] { 35.208911, -97.447195 }, "Sutton Hall");
		campusLocations.put(new double[] { 35.209270, -97.446229 }, "Wallace Science Hall");
		campusLocations.put(new double[] { 35.209254, -97.445384 }, "Carnegie Building");
		campusLocations.put(new double[] { 35.209009, -97.443296 }, "Nuclear Engineering Laboratory");
		campusLocations.put(new double[] { 35.208485, -97.448568 }, "Goddard Health Center");
		campusLocations.put(new double[] { 35.198638, -97.445768 }, "Jim Thorpe Multicultural Center");
		campusLocations.put(new double[] { 35.208580, -97.445698 }, "Evans Hall");
		campusLocations.put(new double[] { 35.208561, -97.444479 }, "Buchanan Hall");
		campusLocations.put(new double[] { 35.207992, -97.447330 }, "Ellison Hall");
=======
		campusLocations.put(new double[] {35.210985, -97.441888}, "Devon Energy Hall");
		campusLocations.put(new double[] {35.210454, -97.441687}, "EPF");
		campusLocations.put(new double[] {35.211080, -97.442668}, "Carson");
		campusLocations.put(new double[] {35.211046, -97.442727}, "Gallogly");
		campusLocations.put(new double[] {35.210530, -97.443038}, "Felgar");
		campusLocations.put(new double[] {35.210792, -97.440442}, "Sarkeys energy center");
		campusLocations.put(new double[] {35.210608, -97.448287}, "Catlett"); //1
		campusLocations.put(new double[] {35.208180, -97.445840}, "Bizzell");
		campusLocations.put(new double[] {35.209961, -97.444204}, "Union");
		campusLocations.put(new double[] {35.209987, -97.444258}, "Quiznos");
		campusLocations.put(new double[] {35.207289, -97.446609}, "Nielsen");
		campusLocations.put(new double[] {35.209562, -97.447279}, "Physical Sciences Centers");
		campusLocations.put(new double[] {35.209066, -97.445068}, "Carnegie Building");
		campusLocations.put(new double[] {35.210535, -97.444224}, "Carpenter Hall");
		campusLocations.put(new double[] {35.209648, -97.446660}, "Chemistry Buildings");
		campusLocations.put(new double[] {35.205110, -97.446593}, "Copeland Hall");
		campusLocations.put(new double[] {35.207196, -97.447505}, "Farzeneh Hall");
		campusLocations.put(new double[] {35.206865, -97.446484}, "Gittinger Hall");
		campusLocations.put(new double[] {35.205513, -97.444870}, "Gould Hall");
		campusLocations.put(new double[] {35.206162, -97.446659}, "Kaufman Hall");
		campusLocations.put(new double[] {35.202512, -97.443915}, "Observatory");
		campusLocations.put(new double[] {35.208931, -97.446225}, "Old Science Hall");
		campusLocations.put(new double[] {35.207184, -97.444566}, "Richards Hall");
		campusLocations.put(new double[] {35.207217, -97.448262}, "Zarrow Hall");
		campusLocations.put(new double[] {35.211834, -97.446430}, "Old Faculty Club");
		campusLocations.put(new double[] {35.211661, -97.446135}, "Boyd House");
		campusLocations.put(new double[] {35.211735, -97.444785}, "Whitehand Hall");
		campusLocations.put(new double[] {35.210794, -97.447463}, "Fred Jones Art Center");
		campusLocations.put(new double[] {35.210200, -97.447363}, "Fine Arts Center");
		campusLocations.put(new double[] {35.210259, -97.446587}, "Donald W. Reynolds Performing Arts Center");
		campusLocations.put(new double[] {35.210428, -97.444940}, "Jacobson Faculty Hall");
		campusLocations.put(new double[] {35.209558, -97.448431}, "Elm Avenue Parking Facility");
		campusLocations.put(new double[] {35.209562, -97.445042}, "Monnet Hall");
		campusLocations.put(new double[] {35.209733, -97.444226}, "OMU Parking Center");
		campusLocations.put(new double[] {35.209233, -97.441985}, "Physical Plant Complex");
		campusLocations.put(new double[] {35.209047, -97.448705}, "Burton Hall");
		campusLocations.put(new double[] {35.208911, -97.447195}, "Sutton Hall");
		campusLocations.put(new double[] {35.209270, -97.446229}, "Wallace Science Hall");
		campusLocations.put(new double[] {35.209009, -97.443296}, "Nuclear Engineering Laboratory");
		campusLocations.put(new double[] {35.208485, -97.448568}, "Goddard Health Center");
		campusLocations.put(new double[] {35.198638, -97.445768}, "Jim Thorpe Multicultural Center");
		campusLocations.put(new double[] {35.208580, -97.445698}, "Evans Hall");
		campusLocations.put(new double[] {35.208561, -97.444479}, "Buchanan Hall");
		campusLocations.put(new double[] {35.207992, -97.447330}, "Ellison Hall");
		campusLocations.put(new double[] {35.207885, -97.443662}, "Michael F. Price Hall");
		campusLocations.put(new double[] {35.208433, -97.443108}, "Lissa and Cy Wagner Hall");
		campusLocations.put(new double[] {35.208268, -97.442324}, "McCasland Field House");
		campusLocations.put(new double[] {35.207099, -97.447505}, "Hester Hall");
		campusLocations.put(new double[] {35.206345, -97.447529}, "Robertson Hall");
		campusLocations.put(new double[] {35.206976, -97.443820}, "Armory");
		campusLocations.put(new double[] {35.206616, -97.445243}, "George Lynn Cross Hall");
		campusLocations.put(new double[] {35.206924, -97.444917}, "Noble Microscopy Laboratory");
		campusLocations.put(new double[] {35.205701, -97.446486}, "Ellsworth Collings Hall");
		campusLocations.put(new double[] {35.204436, -97.447204}, "Dale Hall Tower");
		campusLocations.put(new double[] {35.204369, -97.446616}, "Dale Hall Classroom Bldg");
		campusLocations.put(new double[] {35.205786, -97.443769}, "Asp Avenue Parking Facility");
		campusLocations.put(new double[] {35.204193, -97.440333}, "Jefferson House Dormitory");
		campusLocations.put(new double[] {35.204548, -97.439688}, "Collums Bldg");
		campusLocations.put(new double[] {35.204490, -97.440797}, "Bud Wilkinson Dormitory");
		campusLocations.put(new double[] {35.204586, -97.438280}, "Mosier Indoor Athletic Facility");
		campusLocations.put(new double[] {35.204928, -97.438898}, "Everest Training Center");
		campusLocations.put(new double[] {35.203622, -97.446313}, "Cate Center");
		campusLocations.put(new double[] {35.203312, -97.444969}, "David L. Boren Hall");
		campusLocations.put(new double[] {35.202863, -97.443872}, "Henderson-Tolson Cultural Center");
		campusLocations.put(new double[] {35.201670, -97.444954}, "Walker Tower");
>>>>>>> e8f26a9fbcba8fdb7c0a5b492752ba277e7824c6
		campusLocations.put(new double[] { 35.207819, -97.444318 }, "Adams Hall");
		campusLocations.put(new double[] { 35.205950, -97.442325 }, "Gaylord Family Oklahoma Memorial Stadium");
		campusLocations.put(new double[] { 35.204621, -97.445099 }, "Gaylord Hall");
<<<<<<< HEAD
		campusLocations.put(new double[] { 35.204193, -97.440333 }, "Jefferson House Dormitory");
		campusLocations.put(new double[] { 35.204548, -97.439688 }, "Collums Bldg");
		campusLocations.put(new double[] { 35.204490, -97.440797 }, "Bud Wilkinson Dormitory");
		campusLocations.put(new double[] { 35.204586, -97.438280 }, "Mosier Indoor Athletic Facility");
		campusLocations.put(new double[] { 35.204928, -97.438898 }, "Everest Training Center");
		campusLocations.put(new double[] { 35.203622, -97.446313 }, "Cate Center");
		campusLocations.put(new double[] { 35.203330, -97.445012 }, "David L. Boren Hall");
		campusLocations.put(new double[] { 35.202828, -97.443861 }, "Henderson-Tolson Cultural Center");
		campusLocations.put(new double[] { 35.201678, -97.446525 }, "Adams Center");
		campusLocations.put(new double[] { 35.201621, -97.444916 }, "Walker Tower");
		campusLocations.put(new double[] { 35.201621, -97.444916 }, "Huston Huffman Center");
		campusLocations.put(new double[] { 35.200701, -97.444841 }, "Couch Center Cafeteria");
		campusLocations.put(new double[] { 35.198878, -97.444908 }, "McCarter Hall of Advanced Studies");
		campusLocations.put(new double[] { 35.198881, -97.443110 }, "Cross Center B-123");
		campusLocations.put(new double[] { 35.198133, -97.445336 }, "Thurman J. White Forum Building");
		campusLocations.put(new double[] { 35.197982, -97.442191 }, "Cross Center Bldg. D");
		campusLocations.put(new double[] { 35.198123, -97.444596 }, "Outreach Office Bldg.");
		campusLocations.put(new double[] { 35.197600, -97.443981 }, "Murray Case Sells Swim Complex");
		campusLocations.put(new double[] { 35.195963, -97.446683 }, "Andrew M. Coats Hall");
		campusLocations.put(new double[] { 35.192328, -97.443452 }, "Kraettli Apartments");
		campusLocations.put(new double[] { 35.195168, -97.442207 }, "Women’s Softball Facility");
		campusLocations.put(new double[] { 35.195879, -97.444747 }, "OU Foundation");
		campusLocations.put(new double[] { 35.194508, -97.449047 }, "Sam Noble Oklahoma Museum of Natural History");
		campusLocations.put(new double[] { 35.191031, -97.444110 }, "Our Children’s World Learning Center");
		campusLocations.put(new double[] { 35.190957, -97.446072 }, "L. Dale Mitchell Baseball Park");
		campusLocations.put(new double[] { 35.190400, -97.443793 }, "Sam Viersen Gymnastics Center");
		campusLocations.put(new double[] { 35.191860, -97.433348 }, "Charlie Coe Golf Learning Center");
		campusLocations.put(new double[] { 35.189914, -97.437843 }, "Fears Structural Engineering Lab");
		campusLocations.put(new double[] { 35.190115, -97.435175 }, "Joseph K. Lester Police Headquarters");
		campusLocations.put(new double[] { 35.187714, -97.444058 }, "Lloyd Noble Center");
		campusLocations.put(new double[] { 35.183880, -97.440321 }, "Stephenson Research Center");
		campusLocations.put(new double[] { 35.181543, -97.439992 }, "National Weather Center");
		campusLocations.put(new double[] { 35.200454, -97.444759 }, "Couch Tower");
=======
		campusLocations.put(new double[] {35.201621, -97.444916}, "Huston Huffman Center");
		campusLocations.put(new double[] {35.200701, -97.444841}, "Couch Center Cafeteria");
		campusLocations.put(new double[] {35.198878, -97.444908}, "McCarter Hall of Advanced Studies");
		campusLocations.put(new double[] {35.198881, -97.443110}, "Cross Center B-123");
		campusLocations.put(new double[] {35.198133, -97.445336}, "Thurman J. White Forum Building");
		campusLocations.put(new double[] {35.197982, -97.442191}, "Cross Center Bldg. D");
		campusLocations.put(new double[] {35.198123, -97.444596}, "Outreach Office Bldg.");
		campusLocations.put(new double[] {35.197600, -97.443981}, "Murray Case Sells Swim Complex");
		campusLocations.put(new double[] {35.195963, -97.446683}, "Andrew M. Coats Hall");
		campusLocations.put(new double[] {35.192328, -97.443452}, "Kraettli Apartments");
		campusLocations.put(new double[] {35.195168, -97.442207}, "Women’s Softball Facility");
		campusLocations.put(new double[] {35.195879, -97.444747}, "OU Foundation");
		campusLocations.put(new double[] {35.194508, -97.449047}, "Sam Noble Oklahoma Museum of Natural History");
		campusLocations.put(new double[] {35.191031, -97.444110}, "Our Children’s World Learning Center");
		campusLocations.put(new double[] {35.190957, -97.446072}, "L. Dale Mitchell Baseball Park");
		campusLocations.put(new double[] {35.190400, -97.443793}, "Sam Viersen Gymnastics Center");
		campusLocations.put(new double[] {35.191860, -97.433348}, "Charlie Coe Golf Learning Center");
		campusLocations.put(new double[] {35.189914, -97.437843}, "Fears Structural Engineering Lab");
		campusLocations.put(new double[] {35.190115, -97.435175}, "Joseph K. Lester Police Headquarters");
		campusLocations.put(new double[] {35.187714, -97.444058}, "Lloyd Noble Center");
		campusLocations.put(new double[] {35.183880, -97.440321}, "Stephenson Research Center");
		campusLocations.put(new double[] {35.181543, -97.439992}, "National Weather Center");
>>>>>>> e8f26a9fbcba8fdb7c0a5b492752ba277e7824c6
	}

	// This method returns the center location for a list of n locations.
	public double[] center(double[][] locations) {
		double xSum = 0;
		double ySum = 0;
		for (int i = 0; i < locations.length; i++) {
			xSum += locations[i][0];
			ySum += locations[i][1];
		}
		return new double[] { xSum / locations.length, ySum / locations.length };
	}

	// This method returns the closest buildings to a center point of multiple
	// locations.
	public String closestBuilding(double[][] locations) {
		// Finds the center locations
		double[] center = center(locations);

		// Creates the first location as the closest and computes its distance from the
		// center
		double[] closestBuildingLoc = (double[]) campusLocations.keySet().toArray()[0];
		double closestBuildingDist = distFrom(closestBuildingLoc, center);

		// This runs through each location in campusLocations
		for (double[] location : campusLocations.keySet()) {
			// This updates the clostestBuildingLoc and closestBuildingDist if the location
			// is closer.
			if (closestBuildingDist > distFrom(location, center)) {
				closestBuildingLoc = location;
				closestBuildingDist = distFrom(location, center);
			}
		}

		String location = campusLocations.get(closestBuildingLoc);
		campusLocations.remove(closestBuildingLoc);
		return location;
	}

	// This computes the distance between two points in (x, y)
	public double distFrom(double[] locTo, double[] locFrom) {
		return Math.sqrt(Math.pow(locTo[0] - locFrom[0], 2) + Math.pow(locTo[1] - locFrom[1], 2));
	}

	public double[] getKeyFromValue(String location) {
		for (double[] key : campusLocations.keySet()) {
			if (campusLocations.get(key).equals(location)) {
				return key;
			}
		}
		return null;
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