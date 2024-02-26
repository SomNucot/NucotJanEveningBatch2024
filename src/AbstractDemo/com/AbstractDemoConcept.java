package AbstractDemo.com;


//We cannot create object of abstract class
//It contains implemented and un-implemented 


abstract class Test
{
	
	//implemented methods
	void userName()
	{
		System.out.println("UserName");
	}
	
	//un-implemented 
	abstract void passWord();
	abstract void loginBtn();
	
}


class Test2 extends Test
{
	
	void passWord()
	{
		System.out.println("passWord");
	}
	
	
	void loginBtn()
	{
		System.out.println("loginBtn");
	}
	
	
}















public class AbstractDemoConcept {

	public static void main(String[] args) {
		
		Test2 obj=new Test2();
		
		obj.passWord();
		obj.loginBtn();
		
		obj.userName();
		
		
		

	}

}
