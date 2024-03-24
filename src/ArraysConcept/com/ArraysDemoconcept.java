package ArraysConcept.com;

import java.util.Arrays;

public class ArraysDemoconcept {

	public static void main(String[] args) {
		//Array literals
	//The general form of a one-dimensional array declaration is 
	//syntax-->	Data_type var-name[];
	//	Example-->int a[];
	//	syntax ---> Data_type[] var-name;
	//  Example-->int[] a;
		
		
//The general form of a one-dimensional array init is 
		
		//syntax-->	Data_type var-name[]={val1,val2,val3--valn};
			//Example--->1-->int a[]={2,3,4,5,1};
		    //Example-->int[] a={1,2,3,4,5};
		
		
		int a[]= {1,2,3,4,5};
		System.out.println(a.length);
		System.out.println(a[0]);
		System.out.println(a[3]);
		//System.out.println(a[5]);
		System.out.println("Print all the values");
		//one way of printing the array values
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
		
		//second way of printing the array values without using for loop)
		
		System.out.println("second way of printing the array values without using for loop)");
		System.out.println(Arrays.toString(a));
		
		System.out.println("Third way of printing the array values with using foreach loop)");
		for(int aa:a)
		{
			System.out.println(aa);
			
		}
		System.out.println("Array of strings");
		
		String s[]= {"Java","Javascript","Selenium","WebDriver","API","Github"};
		
		System.out.println(s.length);
		System.out.println("Print all the values");
		//one way of printing the array values
		for(int i=0;i<a.length;i++)
		{
			System.out.println(s[i]);
			
		}
		
		//second way of printing the array values without using for loop)
		
				System.out.println("second way of printing the array values without using for loop)");
				System.out.println(Arrays.toString(s));
				
				//Third way of printing the array values w using foreach loop)			
		
				System.out.println("Third way of printing the array values with using foreach loop)");
		
				//syntax forach loop
				/*
				 * 
				 * for(Data_type new_variable:old_variable)
				 * {
				 * 
				 * }
				 * 
				 * 
				 * 
				 * 
				 */
		
		for(String ss:s)
		{
			System.out.println(ss);
			
		}
		
		System.out.println(s[3]);
		
		
		

	}

}
