// Package declaration for organizing related classes
package assignments;

// Import statements for required classes
import java.util.ArrayList; // Allows usage of dynamic ArrayList
import java.util.HashMap; // Enables key-value storage using HashMap
import java.util.List; // Provides List interface for ordered collection
import java.util.Map; // Enables Map interface for key-value pairs

// Class definition
public class Assignment5_Collections_WebTables {

	public static void main(String[] args) {

		// Creating a HashMap to store student details (1st row)
		Map<String, String> studentDetails1 = new HashMap<String, String>();

		// Storing student information in key-value pairs
		studentDetails1.put("Name", "John Doe"); // Student's full name
		studentDetails1.put("Age", "20"); // Student's age
		studentDetails1.put("Gender", "Male"); // Student's gender
		studentDetails1.put("Roll Number", "S12345"); // Unique roll number identifier
		studentDetails1.put("Grade", "A"); // Academic grade
		studentDetails1.put("Major", "Computer Science"); // Field of study
		studentDetails1.put("GPA", "3.8"); // Grade Point Average
		studentDetails1.put("Email", "john@example.com"); // Email address
		studentDetails1.put("Contact Number", "9876543210"); // Phone number
		studentDetails1.put("Address", "123 Elm St"); // Residential address

		// Printing student details (1st row)
		System.out.println("Student Details 1st Row: " + studentDetails1);

		// Creating a HashMap to store student details (2nd row)
		Map<String, String> studentDetails2 = new HashMap<String, String>();

		// Storing student information in key-value pairs
		studentDetails2.put("Name", "Jane Smith"); // Student's full name
		studentDetails2.put("Age", "21"); // Student's age
		studentDetails2.put("Gender", "Female"); // Student's gender
		studentDetails2.put("Roll Number", "S12346"); // Unique roll number identifier
		studentDetails2.put("Grade", "B"); // Academic grade
		studentDetails2.put("Major", "Mathematics"); // Field of study
		studentDetails2.put("GPA", "3.5"); // Grade Point Average
		studentDetails2.put("Email", "jane@example.com"); // Email address
		studentDetails2.put("Contact Number", "9876543211"); // Phone number
		studentDetails2.put("Address", "456 Oak St"); // Residential address

		// Printing student details (2nd row)
		System.out.println("Student Details 2nd Row: " + studentDetails2);

		// Creating a HashMap to store student details (3rd row)
		Map<String, String> studentDetails3 = new HashMap<String, String>();

		// Storing student information in key-value pairs
		studentDetails3.put("Name", "Mike Brown"); // Student's full name
		studentDetails3.put("Age", "22"); // Student's age
		studentDetails3.put("Gender", "Male"); // Student's gender
		studentDetails3.put("Roll Number", "S12347"); // Unique roll number identifier
		studentDetails3.put("Grade", "A"); // Academic grade
		studentDetails3.put("Major", "Physics"); // Field of study
		studentDetails3.put("GPA", "3.9"); // Grade Point Average
		studentDetails3.put("Email", "mike@example.com"); // Email address
		studentDetails3.put("Contact Number", "9876543212"); // Phone number
		studentDetails3.put("Address", "789 Pine St"); // Residential address

		// Printing student details (3rd row)
		System.out.println("Student Details 3rd Row: " + studentDetails3);

		// Creating a List to store multiple student records
		List<Map<String, String>> studentList = new ArrayList<Map<String, String>>();

		// Adding individual student maps to the list
		studentList.add(studentDetails1); // Adding student 1 details
		studentList.add(studentDetails2); // Adding student 2 details
		studentList.add(studentDetails3); // Adding student 3 details

		// Printing complete student list
		System.out.println("Student Details : " + studentList);

		// Creating a HashMap to store employee details (1st row)
		Map<String, String> employeeDetails1 = new HashMap<String, String>();

		// Storing Employee information in key-value pairs
		employeeDetails1.put("Employee ID", "E001"); // Unique identifier for the employee
		employeeDetails1.put("Name", "Alice Green"); // Employee's full name
		employeeDetails1.put("Age", "30"); // Employee's age in years
		employeeDetails1.put("Gender", "Female"); // Employee's gender
		employeeDetails1.put("Department", "Engineering"); // Department where the employee works
		employeeDetails1.put("Position", "Software Engineer"); // Employee's job role in the organization
		employeeDetails1.put("Salary", "75,000"); // Employee's annual salary in currency units
		employeeDetails1.put("Email", "alice@example.com"); // Employee's official email address
		employeeDetails1.put("Contact Number", "9876543213"); // Employee's personal or work phone number

		// Printing employee details (1st row)
		System.out.println("Employee Details 1st Row: " + employeeDetails1);

		// Creating a HashMap to store employee details (2nd row)
		Map<String, String> employeeDetails2 = new HashMap<String, String>();

		// Storing Employee information in key-value pairs
		employeeDetails2.put("Employee ID", "E002"); // Unique identifier for the employee
		employeeDetails2.put("Name", "Bob Johnson"); // Employee's full name
		employeeDetails2.put("Age", "35"); // Employee's age in years
		employeeDetails2.put("Gender", "Male"); // Employee's gender
		employeeDetails2.put("Department", "Marketing"); // Department where the employee works
		employeeDetails2.put("Position", "Marketing Manager"); // Employee's job role in the organization
		employeeDetails2.put("Salary", "85,000"); // Employee's annual salary in currency units
		employeeDetails2.put("Email", "bob@example.com"); // Employee's official email address
		employeeDetails2.put("Contact Number", "9876543214"); // Employee's personal or work phone number

		// Printing employee details (2nd row)
		System.out.println("Employee Details 1st Row: " + employeeDetails2);

		// Creating a HashMap to store employee details (3rd row)
		Map<String, String> employeeDetails3 = new HashMap<String, String>();

		// Storing Employee information in key-value pairs
		employeeDetails3.put("Employee ID", "E003"); // Unique identifier for the employee
		employeeDetails3.put("Name", "Carol White"); // Employee's full name
		employeeDetails3.put("Age", "28"); // Employee's age in years
		employeeDetails3.put("Gender", "Female"); // Employee's gender
		employeeDetails3.put("Department", "Sales"); // Department where the employee works
		employeeDetails3.put("Position", "Sales Executive"); // Employee's job role in the organization
		employeeDetails3.put("Salary", "65,000"); // Employee's annual salary in currency units
		employeeDetails3.put("Email", "carol@example.com"); // Employee's official email address
		employeeDetails3.put("Contact Number", "9876543215"); // Employee's personal or work phone number

		// Printing employee details (3rd row)
		System.out.println("Employee Details 1st Row: " + employeeDetails3);

		// Creating a List to store multiple employee records
		List<Map<String, String>> employeeList = new ArrayList<Map<String, String>>();

		// Adding individual Employees maps to the list
		employeeList.add(employeeDetails1); // Adding Employee 1 details
		employeeList.add(employeeDetails2); // Adding Employee 2 details
		employeeList.add(employeeDetails3); // Adding Employee 3 details

		// Printing complete Employees list
		System.out.println("Employee Details : " + employeeList);

		// Creating a HashMap to store product details (1st row)
		Map<String, String> productDetails1 = new HashMap<String, String>();

		// Storing product information in key-value pairs
		productDetails1.put("Product ID", "P001"); // Unique identifier for the product
		productDetails1.put("Name", "Laptop"); // Product name
		productDetails1.put("Category", "Electronics"); // Category the product belongs to
		productDetails1.put("Price", "$1,200"); // Product price in currency format
		productDetails1.put("Stock Quantity", "50"); // Available quantity in stock
		productDetails1.put("Supplier", "Tech Supplies"); // Supplier or vendor providing the product
		productDetails1.put("Warranty", "2 years"); // Duration of warranty coverage
		productDetails1.put("Rating", "4.5"); // Customer rating or review score
		productDetails1.put("Manufacturing Date", "1/15/2023"); // Date when the product was manufactured
		productDetails1.put("Expiry Date", "1/15/2025"); // Expiry date of the product (if applicable)

		// Printing product details (1st row)
		System.out.println("Product Details 1st Row: " + productDetails1);

		// Creating a HashMap to store product details (2nd row)
		Map<String, String> productDetails2 = new HashMap<String, String>();

		// Storing product information in key-value pairs
		productDetails2.put("Product ID", "P002"); // Unique identifier for the product
		productDetails2.put("Name", "Desk Chair"); // Product name
		productDetails2.put("Category", "Furniture"); // Category the product belongs to
		productDetails2.put("Price", "$150"); // Product price in currency format
		productDetails2.put("Stock Quantity", "100"); // Available quantity in stock
		productDetails2.put("Supplier", "Office Depot"); // Supplier or vendor providing the product
		productDetails2.put("Warranty", "1 year"); // Duration of warranty coverage
		productDetails2.put("Rating", "4"); // Customer rating or review score
		productDetails2.put("Manufacturing Date", "2/10/2023"); // Date when the product was manufactured
		productDetails2.put("Expiry Date", "N/A"); // Expiry date of the product (if applicable)

		// Printing product details (1st row)
		System.out.println("Product Details 2nd Row: " + productDetails2);

		// Creating a HashMap to store product details (3rd row)
		Map<String, String> productDetails3 = new HashMap<String, String>();

		// Storing product information in key-value pairs
		productDetails3.put("Product ID", "P003"); // Unique identifier for the product
		productDetails3.put("Name", "Coffee Maker"); // Product name
		productDetails3.put("Category", "Kitchen"); // Category the product belongs to
		productDetails3.put("Price", "$75"); // Product price in currency format
		productDetails3.put("Stock Quantity", "200"); // Available quantity in stock
		productDetails3.put("Supplier", "KitchenWorld"); // Supplier or vendor providing the product
		productDetails3.put("Warranty", "6 months"); // Duration of warranty coverage
		productDetails3.put("Rating", "4.2"); // Customer rating or review score
		productDetails3.put("Manufacturing Date", "3/20/2023"); // Date when the product was manufactured
		productDetails3.put("Expiry Date", "3/20/2024"); // Expiry date of the product (if applicable)

		// Printing product details (1st row)
		System.out.println("Product Details 3rd Row: " + productDetails3);

		// Creating a List to store multiple product records
		List<Map<String, String>> productList= new ArrayList<Map<String, String>>();

		// Adding individual Employees maps to the list
		productList.add(productDetails1); // Adding product 1 details
		productList.add(productDetails2); // Adding product 2 details
		productList.add(productDetails3); // Adding product 3 details

		// Printing complete Products list
		System.out.println("Product Details : " + productList);
		
		// Creating a master Map to store different types of lists (Students, Employees, Products)
		Map<String, List<Map<String, String>>> data = new HashMap<String, List<Map<String, String>>>();
		
		data.put("Student Details", studentList); // Adding the student data list to the master data map with the key "Student Details"
		data.put("Employee Details", employeeList); // Adding the employee data list to the master data map with the key "Employee Details"
		data.put("Product Details", productList); // Adding the product data list to the master data map with the key "Product Details"

		// Printing the entire master data map to verify the stored information
		System.out.println("All Data List :" + data);

		// Retrieving and printing the Supplier Name from the 2nd row in the Product Details list
		System.out.println("Supplier Name of 2nd row Product Details: " + data.get("Product Details").get(1).get("Supplier"));

	}
}