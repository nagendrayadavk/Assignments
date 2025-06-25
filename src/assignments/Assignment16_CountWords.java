package assignments; 

//Count the occurrences of the word "Java" in a paragraph
public class Assignment16_CountWords { 

	public static void main(String[] args) {
		
		// Initialize a paragraph
		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";
		
		// Split the paragraph into words based on spaces
		String[] words = paragraph.split(" ");
		
		// Initialize a counter to keep track of how many times the word "Java" appears
		int count = 0;
		
		// Loop through the array of words
		for (int i = 0; i < words.length; i++) {
			
			// Check if the current word is "Java", ignoring case (e.g., "java", "JAVA", etc.)
			// Also remove punctuation like '.', ',' from word if present
			String word = words[i].replaceAll("[^a-zA-Z]", ""); // remove punctuation
			
			if (word.equalsIgnoreCase("Java")) {
				System.out.println("Java word is present in Array with Index: " + i);
				count++; // Increment the count for each match
			}
		}
		
		// Print the total number of occurrences of the word "Java"
		System.out.println("Total words with Java are: " + count);
	}
}
