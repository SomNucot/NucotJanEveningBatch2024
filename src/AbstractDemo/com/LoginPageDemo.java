package AbstractDemo.com;

abstract class LoginPage2 {

	static void abc() {
		System.out.println("abc");
	}

	static {
		System.out.println("static block");
	}

	LoginPage2() {
		System.out.println("this constuctor");
	}

	void userName() {
		System.out.println("UserName");
	}

	void passWord() {
		System.out.println("passWord");
	}

	void loginBtn() {
		System.out.println("loginBtn");
	}

	abstract void forgottenBtn();

}

class HomePage extends LoginPage2 {

	HomePage() {
		System.out.println("This child class constructor");
	}

	void forgottenBtn() {
		System.out.println("forgottenBtn");
	}

}

public class LoginPageDemo {

	public static void main(String[] args) {

		HomePage obj = new HomePage();
		obj.userName();
		obj.passWord();
		obj.loginBtn();
		obj.forgottenBtn();

	}

}
