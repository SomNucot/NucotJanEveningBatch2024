package OOPSConcept.com;

public class StudentsResult {

	
	int p;
	int c;
	int b;
	int z;
	
	int totalmarks(int p,int c,int b,int z)
	{
		
		int result=p+c+b+z;
		//System.out.println(result);
		//System.out.println(result*100);
		return result;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		StudentsResult obj=new StudentsResult();
		int a=obj.totalmarks(10,20,30,40);
		System.out.println(a);
		int b=obj.totalmarks(50,50,50,50);
		System.out.println(b);
		int c=obj.totalmarks(5,5,5,5);
		System.out.println(c);
		
	}

}
