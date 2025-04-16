package assignments;

public class Assignment3_EmpGroups {

	public static void main(String[] args) {
		
		//Create object of Employees class
		Assignment3_Employees empData = new Assignment3_Employees();
		
		//Access the data and store in arrays and print the data
		System.out.println("Employee Name: "+ empData.employeeName[0] + ", Employee ID: "+empData.employeeId[0]);
		System.out.println("Employee Name: "+ empData.employeeName[1] + ", Employee ID: "+empData.employeeId[1]);
		System.out.println("Employee Name: "+ empData.employeeName[2] + ", Employee ID: "+empData.employeeId[2]);

	}

}
