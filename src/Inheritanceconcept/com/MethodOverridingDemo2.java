package Inheritanceconcept.com;


class AAAA
{
	 void show()
	{
		System.out.println("Show method in parent class");
	}
	
	void test()
	{
		System.out.println("test");
	}
	
	
}
class BBBB extends AAAA
{
	@Override
	void show()
	{
		
		System.out.println("Show method in child  class");
	}
	
	
	void display()
	{
		System.out.println("Display ");
	}
	
	
}

public class MethodOverridingDemo2 {


	public static void main(String[] args) {
		
		
		
		BBBB obj=new BBBB();
		obj.show();
		obj.display();
		obj.test();
		
		
//Top casting -->creating object of child class by taking the ref parent class
		
	AAAA obj1=new BBBB();
	
	obj1.show();
	//obj1.display();
	obj1.test();
		
		
		
		
		

	}

}
