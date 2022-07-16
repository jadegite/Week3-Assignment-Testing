package assignment;

public class QueationOne {

	public static void main(String[] args) {
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int firstElement = ages[0];
		int lastElement = ages[ages.length - 1];
		
		System.out.println(lastElement - firstElement);
		
		int sumAges = 0;
		for (int age : ages) {
			sumAges += age;
		} 
		double averageAge = sumAges / ages.length;
		System.out.println("Average age is: " + averageAge);

	}

}
