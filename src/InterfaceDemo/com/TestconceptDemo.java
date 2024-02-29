package InterfaceDemo.com;

public interface TestconceptDemo {

	//it contains only un-implemented methods
	//we cannot create object
	
	abstract void display1();
	abstract void display2();
	abstract void display3();
	
}



class TestconceptDemo2 implements TestconceptDemo 
{

	@Override
	public void display1() {
		System.out.println("display1");
		
	}

	@Override
	public void display2() {
		
		System.out.println("display2");
	}

	@Override
	public void display3() {
		System.out.println("display2");
		
	}
	
	
}











