package StatementsDemo;

public class GreatestOfThreeDemo {

	public static void main(String[] args) {
		

		int a=50;
		int b=10;
		int c=5;
		
		if(a>=b && a>=c)
		{
			System.out.println("a is greater");
		}
		else if(b>=a && b>=c)
		{
			System.out.println("b is greater");
			
		}
		else
		{
			System.out.println("c is greater");
		}
		
		System.out.println("Second way to find the largest of 3");
		
		if(a>=b)
		{
			if(a>=c)
			{
				System.out.println("a is greater");
				
			}
			else
			{
				System.out.println("c is greater");
				
			}
			
			
			
			
		}
		else
		{
			System.out.println("thanks");
		}
		
		if(b>=a)
		{
			if(b>=c)
			{
				System.out.println("b is greater");
				
			}
			else
			{
				System.out.println("c is greater");
				
			}

			
			
		}
		else
		{
			System.out.println("thanks");
		}
		
		
		if(c>=a)
		{
			if(c>=b)
			{
				System.out.println("c is greater");
				
			}
			else
			{
				System.out.println("b is greater");
				
			}

			
			
		}
		else
		{
			System.out.println("thanks");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
