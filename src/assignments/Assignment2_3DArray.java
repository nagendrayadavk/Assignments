package assignments;

public class Assignment2_3DArray {

	public static void main(String[] args) {
		
		 // 3D Array: [Semester][Subject/Marks][Values]
		
		// Step 1: Subjects in one Array , Marks in Another Array for each semester (1 D Array)
		// Step 2: Add above 2 Arrays in Another Array for each Semester (2 D Array)
		// Step 3: Add all above 5 semesters in another array (3 D Array)
		
        String[][][] data = {
                { // Semester 1
                        {"Mathematics I", "Physics", "Chemistry", "Computer Programming", "Engineering Drawing", "Basic Electrical Eng."},
                        {"78(Pass)", "85", "91", "74", "88", "79"}
                },
                { // Semester 2
                        {"Mathematics II", "Mechanics", "Environmental Sci.", "Basic Electronics", "Engineering Physics", "Engineering Graphics"},
                        {"82", "77", "93", "69", "84", "90"}
                },
                { // Semester 3
                        {"Data Structures", "Discrete Mathematics", "Digital Electronics", "Operating Systems", "Signals and Systems", "Object-Oriented Prog."},
                        {"88", "81", "76", "92", "85", "78"}
                },
                { // Semester 4
                        {"Algorithms", "Computer Networks", "Database Systems", "Microprocessors", "Communication Eng.", "Software Engineering"},
                        {"91", "73", "89", "80", "76", "87"}
                },
                { // Semester 5
                        {"Probability & Stats", "Machine Learning", "Compiler Design", "Theory of Computation", "Embedded Systems", "Computer Graphics"},
                        {"86", "88", "84", "95", "73", "90"}
                }
        };

        // Print Semester 3 Subject 4 and Subject 5 names
        System.out.println("Semester 3, Subject 4: " + data[2][0][3]); // Operating Systems
        System.out.println("Semester 3, Subject 5: " + data[2][0][4]); // Signals and Systems

        // Print marks of Semester 5, Subject 3 and Subject 6
        System.out.println("Semester 5, Subject 3 Marks: " + data[4][1][2]); // Compiler Design - 84
        System.out.println("Semester 5, Subject 6 Marks: " + data[4][1][5]); // Computer Graphics - 90


	}

}
