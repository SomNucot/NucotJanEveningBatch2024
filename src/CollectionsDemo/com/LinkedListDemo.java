package CollectionsDemo.com;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		
		LinkedList<String> olist=new LinkedList<String>();
		
		olist.add("API");
		olist.add("JavaScript");
		olist.add("Java");
		olist.add("Selenium");
		olist.add("Rest Assured");
		olist.add("PostMan");
		olist.add("Jenkins");
		System.out.println("******************************");
		System.out.println(olist);
		System.out.println("******************************");
		System.out.println(olist.size());
		
		System.out.println("******************************");
		for(String olist1:olist)
		{
			System.out.println(olist1);
		}
		System.out.println("******************************");
		for(Object olist1:olist)
		{
			System.out.println(olist1);
		}
		
		olist.addFirst("Automation");
		
		System.out.println("******************************");
		System.out.println(olist);
		
		olist.addLast("Jira");
		
		System.out.println("******************************");
		System.out.println(olist);
		
		olist.remove(2);
		
		System.out.println("******************************");
		System.out.println(olist);
		System.out.println("******************************");
		String peekValue=olist.peek();
		System.out.println(peekValue);
		
		
		

	}

}
