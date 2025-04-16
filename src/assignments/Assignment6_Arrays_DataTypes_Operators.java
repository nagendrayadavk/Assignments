package assignments;

public class Assignment6_Arrays_DataTypes_Operators {

	public static void main(String[] args) {
		
		// 1D Array: A single row of data, like a list of Students name
		String[] studentNames = new String[3];    // This can hold 3 students names.

		studentNames[0] = "Suresh";
		studentNames[1] = "Mahesh";
		studentNames[2] = "Naresh";
		
		// 1D Array: A single row of data, like a list of Students marks
		int[] marks = new int[3]; // This can hold 3 students marks.
		marks[0] = 75;
		marks[1] = 80;
		marks[2] = 82;
		
		System.out.println("Before Update Marks");
		System.out.println(studentNames[0]+": "+marks[0]);
		System.out.println(studentNames[1]+": "+marks[1]);
		System.out.println(studentNames[2]+": "+marks[2]);
		
		marks[0]= marks[0]+10;
		marks[1]= marks[1]+10;
		marks[2]= marks[2]+10;
		
		System.out.println("After Update Marks");
		System.out.println(studentNames[0]+": "+marks[0]);
		System.out.println(studentNames[1]+": "+marks[1]);
		System.out.println(studentNames[2]+": "+marks[2]);
		
		float avgMarks = ((marks[0]+marks[1]+marks[2])/marks.length);
		
		System.out.printf("Average Marks : " +avgMarks );
	}

}
