package OOPSConcept.com;

public class Student {
	
	//class variables
	String name="abc";
	int age=25;
	char gender='m';
	int usn=123;
	String city="Bangalore";
	
	String country;
	
	
	
	void add()
	{
		int a=10;
		int b=40;
		int sum=a+b;
		System.out.println(sum);
		
		
	}
	
	
	int add(int aaa,int bbb)
	{
		
		int sum1=aaa+bbb;
		
		return sum1;
		
	}
	
	int add1()
	{
		
		int aaaa=10;
		int bbbb=20;
		int sum11=aaaa+bbbb;
		
		return sum11;
		
	}
	
	
	void show(int s)
	{
		System.out.println(s);
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		Student obj1=new Student();
		
		System.out.println("The is name is-->"+obj1.name);
		System.out.println("The age is-->"+obj1.age);
		System.out.println("The gender is--->"+obj1.gender);
		System.out.println("The city is--->"+obj1.city);
		System.out.println("The usn is--->"+obj1.usn);
		
		String countryValue=obj1.country="India";
		
		System.out.println("The country is --->"+countryValue);
		
		
		obj1.add();
		
		
		int result=obj1.add(10, 5);
		System.out.println(result);
		
		
		
		int sum111=obj1.add1();
		System.out.println(sum111);
		
		obj1.show(10);
		
		
		

	}

}
