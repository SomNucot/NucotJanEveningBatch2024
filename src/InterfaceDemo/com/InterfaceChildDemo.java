package InterfaceDemo.com;

public class InterfaceChildDemo implements InterfaceOne,InterfaceTwo{

	@Override
	public void display() {
		
		System.out.println("display");
	}

	@Override
	public void show() {
		
		System.out.println("show");
		
	}

}
