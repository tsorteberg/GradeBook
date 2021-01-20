import java.util.ArrayList;

/**
 * GradeBook class.
 * @author Tom Sorteberg
 * Exercise for CIS-175 Week 1.
 */
public class GradeBook {
	
	// Local constant declaration and initialization.
	private final int MaxGrade = 100;
	private final int GradeA = 90;
	private final int GradeB = 80;
	private final int GradeC = 70;
	private final int GradeD = 60;
		
	// Instance variable declaration and initialization.
	private String name;
	private ArrayList<Integer> grades = new ArrayList<Integer>();
	private ArrayList<String> letterGrades = new ArrayList<String>();

	/**
	 * Default constructor.
	 */
	public GradeBook() {
	}
	
	/**
	 * Primary constructor.
	 * @param name: Required string.
	 * @param grades: Required ArrayList<Integer>.
	 */
	public GradeBook(String name, ArrayList<Integer> grades) {
		super();
		this.setName(name);
		this.setGrades(grades);
		this.determineGrade();
	}

	/**
	 * Get method for name instance.
	 * @return: Returns an String.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Get method for grades instance.
	 * @return: Returns an ArrayList<Integer>.
	 */
	public ArrayList<Integer> getGrades() {
		return grades;
	}
	
	/**
	 * Get method for letterGrades instance.
	 * @return: Returns an ArrayList<String>.
	 */
	public ArrayList<String> getLetterGrades() {
		return letterGrades;
	}
	
	/**
	 * Set method for the name instance.
	 * @param tickets: Required String.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Set method for the grades instance.
	 * @param tickets: Required ArrayList<Integer>.
	 */
	public void setGrades(ArrayList<Integer> grades) {
		this.grades = grades;
	}

	/**
	 * Set method for the grades instance.
	 * @param tickets: Required ArrayList<String>.
	 */
	public void setLetterGrades(ArrayList<String> letterGrades) {
		this.letterGrades = letterGrades;
	}
	
	/**
	 * Helper function to populate letter grades into ArrayList<String>.
	 */
	public void determineGrade() 
	{
		for (int grade: this.grades) 
		{
			// Selection logic to determine grade and append to ArrayList.
			if (grade <= MaxGrade && grade >= GradeA) 
			{
				this.letterGrades.add("A");
			}
			else if (grade < GradeA && grade >= GradeB) 
			{
				this.letterGrades.add("B");
			}
			else if (grade < GradeB && grade >= GradeC) 
			{
				this.letterGrades.add("C");
			}
			else if (grade < GradeC && grade >= GradeD) 
			{
				this.letterGrades.add("D");
			}
			else 
			{
				this.letterGrades.add("F");
			}
		}
	}
	
	/**
	 * Helper function to print contents of object to console.
	 */
	public void display() 
	{
		// Local variable declaration and initialization.
		int arraySize = this.grades.size();
		
		// Print header to console.
		System.out.println("\nGradebook for test: " + this.getName());
		System.out.println("Score -------- Grade");
		
		// For loop to print ArrayList contents.
		for (int counter = 0; counter < arraySize; counter++) 
		{
			// Local variable declaration and initialization.
			int numGrade = this.grades.get(counter);
			String letterGrade = this.letterGrades.get(counter);
			int length = String.valueOf(numGrade).length();
			
			// Selection logic to produce consistent formatting.
			if (length == 1) 
			{
				System.out.println("   " + numGrade + "  --------   " + letterGrade);
			}
			else if (length == 2) 
			{
				System.out.println("  " + numGrade + "  --------   " + letterGrade);
			}
			else 
			{
				System.out.println(" " + numGrade + "  --------   " + letterGrade);
			}		
		}
	}
}