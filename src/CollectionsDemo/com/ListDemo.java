package CollectionsDemo.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ListDemo {
	
	
	
	

	public static void main(String[] args) {
		
		
		//without generics
		ArrayList oarraylist=new ArrayList();
		
		oarraylist.add("Nucot");
		oarraylist.add(20);
		oarraylist.add(20.000f);
		oarraylist.add('a');
	
		System.out.println(oarraylist.size());
		//using for loop
		for(int i=0;i<oarraylist.size();i++)
		{
			System.out.println(oarraylist.get(i));
		}
		
		//using for each
		
		for(Object olist:oarraylist)
		{
			System.out.println(olist);
		}
		
		//iterating the items
		
		Iterator it=oarraylist.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		

	}

}
