package StatementsDemo;

public class NestedifelseDemo {

	public static void main(String[] args) {
		
		int num=40;
		
		if(num < 100)
        { 
           System.out.println("The  number is less than 100"); 
           if(num > 50)
           {
	          System.out.println("The number is greater than 50");
	       }
           else
           {
        	   System.out.println("The number is less than 50");
        	   
           }
           
	    }
	    else
	    {
	        System.out.println("The number is greater than 100");
	    }
     }
		
		

}
