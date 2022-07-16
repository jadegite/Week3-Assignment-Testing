package assignment;

public class QuestionTwo {

	public static void main(String[] args) {
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		int sumOfLetters = 0;
		for (String name : names) {
			int numOfLetters = name.length();
			sumOfLetters += numOfLetters;
		}
		double averageNumOfLetters = sumOfLetters / names.length;
		System.out.println("average number of letters per name is: " + averageNumOfLetters);
		
		String allNames = "";
		for (String name : names) {
			if (name == names[0]) {
				allNames += name;
			} else {
				allNames += " " + name;
			}
			
		}
		System.out.println(allNames);
		
		
		int[] nameLengths = new int[names.length];
		
		int i = 0;
		for (String name : names) {
			
			int nameLength = name.length();
			nameLengths[i] = nameLength;
			i++;
		}
		System.out.println(nameLengths);
		
		int sumOfLength = 0;
		for (int length : nameLengths) {
			sumOfLength += length;
		}
		System.out.println("the sum of all the elements in the array is: " + sumOfLength);

	}

}
