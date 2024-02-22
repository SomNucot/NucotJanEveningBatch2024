package OOPSConcept.com;

public class Methodoverloadingdemo3 {

	
	public static void display()
	{
		System.out.println("Display");
	}
	public static void display(String name)
	{
		System.out.println("Display----?"+name);
	}
	
	

	public static void main(int a,int b) {
		
			System.out.println("Main method with two arguments");
	}

	public static void main(int a,int b,int c) {
		
		System.out.println("Main method with 3 arguments");

	}
	public static void main(char a) {
		
		System.out.println("Main method with one  char arguments");
	}
	
	public static void main(int a) {
		
		System.out.println("Main method with one int  arguments");

	}
	
	
	void show()
	{
		System.out.println("show");
	}
	
	
	public static void main(String[] args) {
		Methodoverloadingdemo3 obj=new Methodoverloadingdemo3();
		obj.show();
		display();
		main(10);
		display("Modi");
		main(10,20);
		main(2,3,4);
		
		main('a');
		main(10);
		
		
		
		
		
	}

}
