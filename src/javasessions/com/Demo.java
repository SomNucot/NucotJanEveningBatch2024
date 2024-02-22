package javasessions.com;

import java.io.IOException;

public class Demo {
	
	public void check(String s)
	{
		//System.out.println(s);
		
		if(s.equals("abc"))
		{
			System.out.println("hello");
		}
		else
		{
			System.out.println("chsdgchdsghf");
		}
		
	}
	

	public static void main(String[] args) {
		Demo obj=new Demo();
		obj.check("abc");
		
	}

}
