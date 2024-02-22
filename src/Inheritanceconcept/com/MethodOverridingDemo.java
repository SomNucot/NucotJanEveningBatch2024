package Inheritanceconcept.com;



class AAA
{
	
	void iphoneContactlist()
	{
		System.out.println("Normal iphone");
	}
	
	
	
}

class BBB extends AAA
{
	
	@Override
	void iphoneContactlist()
	{
		System.out.println("Normal iphone");
		System.out.println("Extra features");
		
	}
	
	
}




public class MethodOverridingDemo {

	public static void main(String[] args) {
		
		BBB obj=new BBB();
		obj.iphoneContactlist();
		
		

	}

}
