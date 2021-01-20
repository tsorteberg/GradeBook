import java.util.ArrayList;
import java.util.Scanner;

/**
 * GradeBookTester class.
 * @author Tom Sorteberg
 * Exercise for CIS-175 Week 1.
 */
public class GradeBookTester {

	public static void main(String[] args) {
		
		// Variable declaration and initialization.
		String testName;
		int numGrades = 0;
		int gradeTemp;
		boolean loop = true;
		ArrayList<Integer> grades = new ArrayList<Integer>();
		
		// Constant declaration and initialization.
		final int Min = 0;
		final int Max = 100;
		
		// Initialize Scanner object.
		Scanner in = new Scanner(System.in);
		
		// Prompt user.
		System.out.print("Please enter the test name: ");
		testName = in.next();
		
		// Continuous prompt for user input.
		System.out.print("\nHow many scores would you like to enter? ");
		
		// Input validation.
		while (loop) 
		{
			try 
			{
				// Attempt to parse string as integer.
				numGrades = Integer.parseInt(in.next());
				// If parse is successful and value is in correct range.
				if (numGrades > 0) 
				{
					// Exit loop.
					loop = false;
				}
				else 
				{
					// Print error to console.
					System.out.print("\nERROR: Please enter a whole number greater than zero: ");
				}
			}
			catch (NumberFormatException exception) 
			{
				// Print error to console.
				System.out.print("\nERROR: Please enter a whole number greater than zero: ");
			}
		}
		
		// For loop to prompt user for requested number of scores.
		for (int counter = 1; counter <= numGrades; counter++) 
		{
			// Initialize variables.
			loop = true;
			
			// Initial user prompt.
			System.out.print("\nPlease enter a whole number between 0-100 for test score " + counter + ": ");
			
			// Input validation.
			while (loop) 
			{
				try 
				{
					// Attempt to parse string as integer.
					gradeTemp = Integer.parseInt(in.next());
					// If parse is successful and value is in correct range.
					if (gradeTemp >= Min && gradeTemp <= Max) 
					{
						// Append ArrayList.
						grades.add(gradeTemp);
						// Exit loop.
						loop = false;
					}
					else 
					{
						// Print error to console.
						System.out.print("\nERROR: Please enter a whole number between 0-100 for score " + counter + ": ");
					}
				}
				catch (NumberFormatException exception) 
				{
					// Print error to console.
					System.out.print("\nERROR: Please enter a whole number between 0-100 for score " + counter + ": ");
				}
			}
			
		}
		// Instantiate GradeBook object.
		GradeBook gradeBook = new GradeBook(testName, grades);
		
		// Output results to console.
		gradeBook.display();
		
		// Close scanner.
		in.close();
	}
}
