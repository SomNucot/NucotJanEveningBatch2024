package Encapsulation.com;

public class ABC {

	
	
	
	public static void main(String[] args) {
		EncapsulationConcept obj=new EncapsulationConcept();
		System.out.println(obj.name);
		//System.out.println(obj.account_num);
		//System.out.println(obj.atmpin=111111);
		obj.setAtmpin(123456);
		System.out.println(obj.getAtmpin());
		
		obj.setAccount_num(3333);
		System.out.println(obj.getAccount_num());

	}

}
