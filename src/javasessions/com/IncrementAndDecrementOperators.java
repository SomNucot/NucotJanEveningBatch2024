package javasessions.com;

public class IncrementAndDecrementOperators {

	public static void main(String[] args) {
		
		//++ and --
		//Post increment variable_name++; example a++
		//pre increment  ++variable_name; ++a
		
		//--
		
		//Post decrement variable_name--; example a--;
		//pre decrement  --variable_name; --a;
		
		
		//Post increment variable_name++; example a++
		//a++ > a 
		//	    a+1
		
		int i=1;
		int ii=i++;
		System.out.println(i);//2
		System.out.println(ii);//1
		
		int p=2;
		int pp=p++;
		System.out.println(p);//3
		System.out.println(pp);//2
		
		
		
		
		//pre increment  ++variable_name; ++a
		
		//++a > a+1
			//   a
		
		int c=2;
		int cc=++c;
		System.out.println(c);//
		System.out.println(cc);//
		
		
		//Post decrement variable_name--; example a--;
		
		//a-- > a 
		//	    a-1
		
		
		
		int h=2;
		int hh=h--;
		
		System.out.println(h);//1
		System.out.println(hh);//2
		
		//Pre decrement --variable_name; example --a;
		//--a-- > a-1 
				//	a
		int j=2;
		int jj=--j;
		
		System.out.println(j);//1
		System.out.println(jj);//1
		
		
		
		
	}

}
