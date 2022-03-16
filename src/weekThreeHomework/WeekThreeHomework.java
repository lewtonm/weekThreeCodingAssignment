package weekThreeHomework;

public class WeekThreeHomework {
	
	public static String concatenate(String word, int n) {
		String newString = "";
		for (int  i = 0; i < n; i++) {
			newString += word;
		}
		return newString;
	}

	static String completeName;
	public static String fullName(String firstName, String lastName) {
		return completeName = firstName + " " + lastName;
	}
	
	
	public static boolean sumOfIntegers(int a[]) {
		boolean result = false;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}	if (sum > 100)
				return result = true;
			else
				return result;
	}
	
	public static double averageOfDoubles(double[] d) {
		double sum = 0.0;
		for (int i = 0; i < d.length; i++) {
			sum += d[i];
		}
		return sum / d.length;
	}
	
	public static boolean compareDoubles( double dub1[], double dub2[]) {
		double sum1 = 0, sum2 = 0;
		
		for ( int i = 0; i < dub1.length; i++ ) {
			sum1 += dub1[i];
		}	System.out.println(sum1 / dub1.length);

		for ( int i = 0; i < dub2.length; i++ ) {
			sum2 += dub2[i];
		}  	System.out.println(sum2 / dub2.length); 

		if ( sum1 / dub1.length > sum2 / dub2.length ) {
			return true;
		} else
			return false;
	}
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket > 10.50)
			return true;
		else
			return false;
	}
	
	public static boolean doIWorkToday(String day) {
		// created a method to determine if today is a traditional work day.  Practice with arrays & methods.
		boolean goToWork = false;
		String[] workDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
		
		for (int i = 0; i < workDays.length; i++) {
			goToWork = (day.equals(workDays[i]));
			}
			if (goToWork)	
				return true;
			else
				return false;	
		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Coding steps: 1
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		// 1a.
		System.out.println(ages[ages.length - 1] - ages[0]);
		
		// 1b.
		int[] agesPlusOne = {3, 9, 23, 64, 2, 8, 28, 93, 107};
		System.out.println(agesPlusOne[agesPlusOne.length - 1] - agesPlusOne[0]);
		
		// 1c.
		int sum = 0;
		for (int number : ages)
			 sum += number;
		System.out.println("Array average: " + sum / ages.length);
		
		
		// Coding steps: 2
		String[] names= {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		// 2a.
		int nameLength = 0;
		int sumOfLetters = 0;
		for (int i = 0; i < names.length; i++) {
			nameLength = names[i].length();
			sumOfLetters += nameLength;
		}
		System.out.println("Average number of letters per name: " + sumOfLetters / names.length);
		
		// 2b.
		String concatenatedName = "";
		for (String name : names) {
			concatenatedName += name + " ";
		}
		System.out.println("Concatenated names: " + concatenatedName);
		
		// 5.
		String[] names1= {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

		
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names1.length; i++) {
			nameLengths[i] = names1[i].length();
		}
		
		// 6.
		int sumOfNameLengths = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			sumOfNameLengths += nameLengths[i];
		}
		System.out.println("Sum of name lengths in array: " + sumOfNameLengths);
		
		
		// 7.
		System.out.println(concatenate("test", 4)); 
		
		
		// 8.
		System.out.println(fullName("Mark", "Lewton"));
		
		
		// 9.
		int[] arrayOfIntegers1 = {20,30,40,50,60};
		System.out.println(sumOfIntegers(arrayOfIntegers1));
		
		int[] arrayOfIntegers2 = {20,30,40};
		System.out.println(sumOfIntegers(arrayOfIntegers2));

	
		// 10.
		double[] dubs = {12.5, 23.9, 45.1, 68.7};
		System.out.println("Average of doubles Array items: " +averageOfDoubles(dubs));

	
		// 11.
		double[] dubs1 = {12.5, 23.9, 45.1, 68.7};
		double[] dubs2 = {12.5, 23.9, 45.1, 68.7, 97.5};
		boolean greaterThan = false;
		System.out.println(greaterThan = compareDoubles(dubs1, dubs2));
		System.out.println();
		greaterThan = false;
		System.out.println(greaterThan = compareDoubles(dubs2, dubs1));

	

		// 12.
		System.out.println("Will I buy a drink? " + willBuyDrink(true, 6.50));

		
		//13.
		String dayOfWeek = "Tuesday";
		System.out.println("Today is " + dayOfWeek + "  --  Do I work today? " + doIWorkToday(dayOfWeek));
		

	}
}
