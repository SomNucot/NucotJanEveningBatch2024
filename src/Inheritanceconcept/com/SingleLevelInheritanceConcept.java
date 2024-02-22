package Inheritanceconcept.com;

//syntax for creating child class
/* class child_class_name extends parent_class_name
{
	
}
*/

class A
{
	int a=10;
	
	void show()
	{
		System.out.println("show in parent class");
	}
	
	
	
	
}

class B extends A
{
	int b=30;
	
	void display()
	{
		System.out.println("display in child class");
	}
	
	
	
}

public class SingleLevelInheritanceConcept {

	public static void main(String[] args) {
		
		A obj1=new A();
		System.out.println(obj1.a);
		obj1.show();
		
	//	System.out.println(obj.b);
		
		
		B obj2=new B();
		
		System.out.println(obj2.b);
		obj2.display();
		
		System.out.println(obj2.a);
		obj2.show();
		
		
	}

}
