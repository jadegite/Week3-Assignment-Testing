package assignment;

public class QuestionSeven {

	public static void main(String[] args) {
		System.out.println(true);

	}
	
	public static String multiplyString(String word, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += word;
		}
		return result;
	}
	
	public static String createFullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	
	}
	
	public static void isSumOver100 (int[] array) {
		int sumOfNumbers = 0;
		for (int numbers : array) {
			sumOfNumbers += numbers;
		}
		if (sumOfNumbers > 100) {
			System.out.println((sumOfNumbers > 100));;
		}
		
	}
	
	public static double arrayAverage (double[] array) {
		double sumOfDouble = 0;
		for (double doubleNum : array) {
			sumOfDouble += doubleNum;
		}
		return sumOfDouble / array.length;
	}
	
	public static void isFirstArrayGreater (double[] array1, double[] array2) {
		double sumOfDouble1 = 0;
		for (double doubleNum1 : array1) {
			sumOfDouble1 += doubleNum1;
		} double average1 = sumOfDouble1 / array1.length;
		
		double sumOfDouble2 = 0;
		for (double doubleNum2 : array1) {
			sumOfDouble2 += doubleNum2;
		} double average2 = sumOfDouble2 / array2.length;
		
		if (average1 > average2) {
			System.out.println(average1 > average2);
		}
	}
	
	public static void willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket > 10.5) {
			System.out.println(true);
		}
	}
	

	
	public static double fahrenheitToCelcius (double tempF) {
		/*
		 * This is a method that converts temperature from Fahrenheit(F) to Celcius(C). it takes a double and returns a double.
		 */
		double tempC = (tempF - 32) * (5/9);
		return tempC;
	} 
	
	

}
