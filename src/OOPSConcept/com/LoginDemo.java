package OOPSConcept.com;

public class LoginDemo {

	
	void login()
	{
	
		System.out.println("Login with out username and pwd");
		
	}
	
	void login(String username)
	{
		
		System.out.println("Login with username -->"+ username);
		
	}

	void login(String username,String pw)
	{
		System.out.println("Login with username and pwd--->"+username+":-->"+pw);
		
	}
	
	
	public static void main(String[] args) {
		LoginDemo obj=new LoginDemo();
		
		obj.login();
		obj.login("Modi");
		obj.login("Modi","Modi@123");
		
		
		

	}

}
