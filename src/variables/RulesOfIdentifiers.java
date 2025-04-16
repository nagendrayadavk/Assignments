package variables;

public class RulesOfIdentifiers {

	public static void main(String[] args) {
		
		String name = "Lakshmi Nagendra";
		
		/******* RULES  ******/
		
		//1. The variable/Identifier should not be same as java reserved keywords
		// String long = "Lakshmi Nagendra";
		
		//2. The variable/Identifier should not be same as java literals (true, false, null)
		// String true ="Lakshmi Nagendra";
		
		//3. The variable/Identifier should not contain white space
		// String Emp Name = "Lakshmi Nagendra";

		//4. The variable/Identifier should not starts with number
		// String 1name = "Lakshmi Nagendra";
		
		//5. The variable/Identifier should not contain special chars
		// String emp@name = "Lakshmi Nagendra";
		
		//6. The variable/Identifier should be unique always
		//String name = "Lakshmi Prasanna";
		
		/***** STANDARDS  ********/
		
		//7. The variable/Identifier should starts with lower case when we are creating package, variable, method and it should starts with upper case when we are creating class
		String empName = "Nag";
		
		//8. The variable/Identifier should be meaningful and should have atleast 3 chars and should not cross 15 chars length
		int carNumber = 3344;
		
	}

}
