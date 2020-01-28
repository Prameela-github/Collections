package CTSDemo;

import java.util.ArrayList;

public class Collections {
public static void main(String[] args)
{
	ArrayList<String> list1=new ArrayList<>();
	list1.add("Prameela");
	list1.add("Urmila");
	list1.add("Vyshnavi");
	list1.add("Yamini");
	
	ArrayList<String> list2=new ArrayList<>();
	list2.add("Alekya");
	list1.addAll(list2);
	System.out.println(list1);
	
}
}
