package assignments;

public class Assignment6_Arrays_DataTypes_Operators {

	public static void main(String[] args) {

		// 1D Array: A single row of data, like a list of Students name
		String[] studentNames = new String[3]; // This can hold 3 students names.

		studentNames[0] = "Suresh";
		studentNames[1] = "Mahesh";
		studentNames[2] = "Naresh";

		// 1D Array: A single row of data, like a list of Students marks
		int[] marks = new int[3]; // This can hold 3 students marks.
		marks[0] = 75;
		marks[1] = 80;
		marks[2] = 82;

		System.out.println("Before Update Marks");
		System.out.println(studentNames[0] + ": " + marks[0]);
		System.out.println(studentNames[1] + ": " + marks[1]);
		System.out.println(studentNames[2] + ": " + marks[2]);

		marks[0] = marks[0] + 10;
		marks[1] = marks[1] + 10;
		marks[2] = marks[2] + 10;

		System.out.println("After Update Marks");
		System.out.println(studentNames[0] + ": " + marks[0]);
		System.out.println(studentNames[1] + ": " + marks[1]);
		System.out.println(studentNames[2] + ": " + marks[2]);

		float avgMarks = ((marks[0] + marks[1] + marks[2]) / marks.length);

		System.out.printf("Average Marks : " + avgMarks);

		// Declare an array of student names
		String[] studentNames1 = { "Suresh", "Mahesh", "Naresh" };

		// Declare an array of original marks for each student
		int[] marks1 = { 75, 80, 82 };

		// Create an array to store updated marks after adding bonus
		int[] updatedMarks = new int[3];

		// Add 10 bonus marks to each student and store in updatedMarks array
		updatedMarks[0] = marks1[0] + 10;
		updatedMarks[1] = marks1[1] + 10;
		updatedMarks[2] = marks1[2] + 10;

		// Print updated marks for each student
		System.out.println(studentNames1[0] + " : " + updatedMarks[0]);
		System.out.println(studentNames1[1] + " : " + updatedMarks[1]);
		System.out.println(studentNames1[2] + " : " + updatedMarks[2]);

		// Calculate the average of updated marks
		int averageMarks = (updatedMarks[0] + updatedMarks[1] + updatedMarks[2]) / updatedMarks.length;

		// Print the average marks
		System.out.println("Average Marks: " + averageMarks);
	}

}
