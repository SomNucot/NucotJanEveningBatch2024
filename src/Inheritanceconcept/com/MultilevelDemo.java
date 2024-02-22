package Inheritanceconcept.com;

class AA
{
	int a=10;
	
	void test1()
	{
		System.out.println("test1");
	}
	
}
class BB extends AA
{
	int b=20;
	
	void test2()
	{
		System.out.println("test2");
	}
	
}
class CC extends BB
{
	int c=30;
	void test3()
	{
		System.out.println("test3");
	}
	

}
class DD extends CC
{
	int d=40;
	
	
	
	void test4()
	{
		System.out.println("test4");
	}
	
}



public class MultilevelDemo {

	public static void main(String[] args) {
	/*	
		AA obj1=new AA();
		System.out.println(obj1.a);
		
		BB obj2=new BB();
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		
		CC obj3=new CC();
		System.out.println(obj3.a);
		System.out.println(obj3.b);
		System.out.println(obj3.c);
		
	*/	
		
		DD obj4=new DD();
		System.out.println(obj4.a);
		System.out.println(obj4.b);
		System.out.println(obj4.c);
		System.out.println(obj4.d);
		obj4.test1();
		obj4.test2();
		obj4.test3();
		obj4.test4();
		
		
		
		
		
		
	}

}
