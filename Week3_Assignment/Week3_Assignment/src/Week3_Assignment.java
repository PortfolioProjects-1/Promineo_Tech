import java.util.Arrays;

public class Week3_Assignment {
	public static void main(String[] args) {
//1
		//a
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int last_index = (ages.length) - 1;
		System.out.println(ages[last_index] - ages[0]);		
		
		//b			
		int[] new_ages = Arrays.copyOf(ages, ages.length + 1);
		new_ages[ages.length] = 57;
		int new_last_index = (new_ages.length) - 1;
		System.out.println(new_ages[new_last_index] - new_ages[0]);	
		
		//c
		float new_ages_avg = 0;
		float new_ages_n = (new_ages.length);
		
		for(int i=0; i<new_ages.length;i++) 
		{				
			new_ages_avg += new_ages[i];				
		}
		System.out.println(new_ages_avg/new_ages_n);	
		
		
//2
		
		//a
		String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		
		float names_avg = 0;
		float names_n = (names.length);
		
		for(int i=0; i<names.length;i++) 
		{				
			names_avg += names[i].length();			
		}
		System.out.println(names_avg/names_n);	
		
		//b		
		String names_cc = "";
		
		for(int i=0; i<names.length;i++) 
		{				
			names_cc += names[i] + " ";			
		}
		System.out.println(names_cc);
		
//3 Answer: array[(array.length)-1]
		
//4 Answer array[0]		
		
//5
		int[] nameLengths = new int[6];
		
		for(int i=0; i<names.length;i++) 
		{				
			nameLengths[i] += names[i].length();			
		}
		//System.out.println(Arrays.toString(nameLengths));
		
		
//6
		
		int nameLengths_sum = 0;
		
		for(int i=0; i<nameLengths.length;i++) 
		{				
			nameLengths_sum += nameLengths[i];			
		}
		System.out.println(nameLengths_sum);	
		
//7		
		ntimesconcatenator("Hello",3);
		
//8		
		fullname("Jean", "Grey");
		
//9 	
		int[] test_array1 = {50, 50, 10};
		
		int[] test_array2 = {70, 10, 10, 10};
		
		ArraySumTest(test_array1);
		
		ArraySumTest(test_array2);
		
//10 
		double[] test_array_double1 = {30.0,40.0};
		ArrayDoubleAvg(test_array_double1);
		
//11
		double[] test_array_double2 = {30.0,10.0,10.0};
		ArrayDoubleAvgTest(test_array_double1, test_array_double2);
		
//12
		boolean isHotOutside = true;
		double moneyInPocket = 10.60;
		WillBuyDrink(isHotOutside, moneyInPocket);

//13
		double Celsius = 25.0;		
		CelsiusToFahrenheit(Celsius);

}	
	
//7
		private static void ntimesconcatenator(String word, int n) 
			{
				String word_cc = "";
				for (int i=0; i<n; i++)
				{
				  	word_cc += word;			
				}
				System.out.println(word_cc);
				//return word_cc;
			}
		
//8    
		private static void fullname(String firstname, String lastname) 
		{
			System.out.println(firstname + " " +lastname);
			//return word_cc;
		}
	
//9 
		
		private static void ArraySumTest(int[] arr) 
		{
			int arr_sum = 0;
			for (int i = 0; i<arr.length;i++) 
			{
				arr_sum += arr[i];				
			}
			
			if (arr_sum > 100) 
			{				
				System.out.println(true);				
			}
			else 
			{
				System.out.println(false);				
			}			
		}
		
//10
		private static void ArrayDoubleAvg(double[] arr)
		{		
			double arr_avg = 0;
			double arr_n = (arr.length);
			
			for(int i=0; i<arr_n;i++) 
			{				
				arr_avg += arr[i];			
			}
			System.out.println(arr_avg/arr_n);	
		}
		
//11
		private static void ArrayDoubleAvgTest(double[] arr1, double[] arr2)
		{		
			double arr1_avg = 0;
			double arr1_n = (arr1.length);
			
			double arr2_avg = 0;
			double arr2_n = (arr2.length);
			
			for(int i=0; i<arr1_n;i++) 
			{				
				arr1_avg += arr1[i];	
				
				for(int j=0;j<arr2_n;j++) 
				{
					arr2_avg += arr2[j];						
				}
			}
			
			if ((arr1_avg/arr1_n) > (arr2_avg/arr2_n)) 
			{				
				System.out.println(true);	
			}
			else 
			{
				System.out.println(false);			
			}
			
		}
		
//12 
		
		private static void WillBuyDrink(boolean isHotOutside, double moneyInPocket) 
		{
			if (isHotOutside == true && moneyInPocket > 10.50)
			{
				System.out.println(true);				
			}
			else 
			{
				System.out.println(false);				
			}
			
			
		}

		
//13	//This method converts Celsius temperatures to Fahrenheit temperature. I created to show this calculation could be done as a Java method.
		private static void CelsiusToFahrenheit(double Celsius) 
		{
			double Fahrenheit =	Celsius*1.8000 + 32.00;		
			System.out.println(Fahrenheit);
		}
}
