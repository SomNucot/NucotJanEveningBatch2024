package CollectionsDemo.com;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		//generics
		//Dynamic array
		ArrayList<Integer> olist=new ArrayList<Integer>();
		
		olist.add(10);
		olist.add(100);
		olist.add(20);
		olist.add(230);
		olist.add(60);
		olist.add(40);
		olist.add(80);
		
		System.out.println(olist.size());
		
		System.out.println("Directly printing the list"+olist);
		
		System.out.println("using for loop each ");
		for(Object olist1:olist)
		{
			System.out.println(olist1);
		}
		
		
		boolean containValue=olist.contains(230);
		System.out.println(containValue);
		
		
		
		
		olist.remove(1);
		
		
		System.out.println("Directly printing the list"+olist);
		
		
		boolean checkingEmpty=olist.isEmpty();
		System.out.println(checkingEmpty);
		
		//getting item from the list-->
		System.out.println(olist.get(3));
		
		
		int postion=olist.indexOf(60);
		System.out.println(postion);
		
		
		
		

	}

}
