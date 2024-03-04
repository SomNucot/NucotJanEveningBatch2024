package Encapsulation.com;

public class EncapsulationConcept {
	
	// Java Encapsulation is a way of hiding data  and implementation details of a class
	//from outside access and only exposing methods through getter and setter methods
	
	//hiding data and methods in a single unit is called Encapsulation
	
	
	public String name="abc";
	private  int account_num=444123456;
	private int atmpin=123456;
	
	
	public int getAccount_num() {
		return account_num;
	}


	public void setAccount_num(int account_num) {
		this.account_num = account_num;
	}



	public int getAtmpin() {
		
		return atmpin;
	}


	public void setAtmpin(int atmpin) {
		this.atmpin = atmpin;
	}








	public static void main(String[] args) {
		EncapsulationConcept obj=new EncapsulationConcept();
		System.out.println(obj.name);
		System.out.println(obj.account_num);
		System.out.println(obj.atmpin);

	}

}
