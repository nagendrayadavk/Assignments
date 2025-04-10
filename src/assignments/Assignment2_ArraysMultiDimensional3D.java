package assignments;

public class Assignment2_ArraysMultiDimensional3D {

	public static void main(String[] args) {

		// [5] Semesters as the first dimension.
		// [2]Subjects and Status/Marks as the second dimension.
		// [6] Subjects as the third dimension
		String[][][] college = new String[5][2][6];

		// Semester -I 6-Subjects
		college[0][0][0] = "Mathematics I";
		college[0][0][1] = "Physics";
		college[0][0][2] = "Chemistry";
		college[0][0][3] = "Computer Programming";
		college[0][0][4] = "Engineering Drawing";
		college[0][0][5] = "Basic Electrical Eng.";

		// Semester - I Subjects Pass or Fail
		college[0][1][0] = "Pass(78)";
		college[0][1][1] = "Pass(85)";
		college[0][1][2] = "Fail(21)";
		college[0][1][3] = "Pass(74)";
		college[0][1][4] = "Pass(88)";
		college[0][1][5] = "Pass(79)";

		// Semester -II 6-Subjects
		college[1][0][0] = "Mathematics II";
		college[1][0][1] = "Mechanics";
		college[1][0][2] = "Environmental Sci.";
		college[1][0][3] = "Basic Electronics";
		college[1][0][4] = "Engineering Physics";
		college[1][0][5] = "Engineering Graphics";

		// Semester - II Subjects Pass or Fail
		college[1][1][0] = "Pass(82)";
		college[1][1][1] = "Pass(77)";
		college[1][1][2] = "Pass(93)";
		college[1][1][3] = "Fail(19)";
		college[1][1][4] = "Fail(24)";
		college[1][1][5] = "Pass(90)";

		// Semester -III 6-Subjects
		college[2][0][0] = "Data Structures";
		college[2][0][1] = "Discrete Mathematics";
		college[2][0][2] = "Digital Electronics";
		college[2][0][3] = "Operating Systems";
		college[2][0][4] = "Systems and Systems";
		college[2][0][5] = "Object-Oriented Prog.";

		// Semester - III Subjects Pass or Fail
		college[2][1][0] = "Pass(88";
		college[2][1][1] = "Pass(81)";
		college[2][1][2] = "Pass(76)";
		college[2][1][3] = "Fail(32)";
		college[2][1][4] = "Pass(85)";
		college[2][1][5] = "Pass(78)";

		// Semester -IV 6-Subjects
		college[3][0][0] = "Algorithms";
		college[3][0][1] = "Computer Networks";
		college[3][0][2] = "Database Electronics";
		college[3][0][3] = "Microprocessors";
		college[3][0][4] = "Communication Eng.";
		college[3][0][5] = "Software Engineering";

		// Semester - IV Subjects Pass or Fail
		college[3][1][0] = "Pass(91)";
		college[3][1][1] = "Pass(73)";
		college[3][1][2] = "Fail(19)";
		college[3][1][3] = "Pass(80)";
		college[3][1][4] = "Pass(76)";
		college[3][1][5] = "Pass(87)";

		// Semester -V 6-Subjects
		college[4][0][0] = "Probability & Stats";
		college[4][0][1] = "Machine Learning";
		college[4][0][2] = "Compiler Design";
		college[4][0][3] = "Theory of Computation";
		college[4][0][4] = "Embedded Systems";
		college[4][0][5] = "Computer Graphics";

		// Semester - V Subjects Pass or Fail
		college[4][1][0] = "Pass(86)";
		college[4][1][1] = "Pass(88)";
		college[4][1][2] = "Pass(84)";
		college[4][1][3] = "Pass(95)";
		college[4][1][4] = "Pass(73)";
		college[4][1][5] = "Pass(90)";

		// Print Semester 2 Subject 4 and Subject 5 names.
		System.out.println("Printing Semester II Subject 4 and Subject 5 names: " + college[1][0][3] + " and " + college[1][0][4]);
		// here printing Semester 2 Subject 4 name Basic Electronics
		System.out.println("Semester II Subject 4 is: " + college[1][0][3]);
		// here printing Semester 2 Subject 5 name Engineering Physics
		System.out.println("Semester II Subject 5 is: " + college[1][0][4]);

		// Print the Status/Marks of Semester 4 Subject 3 and Subject 6.
		System.out.println("Print the Status/Marks of Semester 4 Subject 3 and Subject 6: " + college[3][1][2] + " and "+ college[3][1][5]);
		// here printing Semester 4 Subject 3 is Fail with 19 Marks
		System.out.println("Semester IV Subject Name " + college[3][0][2] + " is " + college[3][1][2]);
		// here printing Semester 4 Subject 6 is Pass with 87 Marks
		System.out.println("Semester IV Subject Name " + college[3][0][5] + " is " + college[3][1][5]);
	}

}
