import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListnListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<String> s = new ArrayList<String>(5);
	s.add("John");
	s.add("Dough");
	s.add("Jason");
	s.add("Stathom");
	s.add("Micheal");
	for(String i: s)
	{
		System.out.println(i);
	}
	System.out.println(s.size());
//	s.addAll(s);
	s.remove(2);
	for(String i: s)
	{
		System.out.println(i);
	}
	System.out.println(s.size());
//	s.trimToSize();
//	System.out.println(s.size());
	//ListIterator use
	ListIterator<String> list = s.listIterator();
	
	while(list.hasNext())
	{
		System.out.println(list.next());
	}
	System.out.println(" ");
	while(list.hasPrevious())
	{
		System.out.println(list.previous());
	}
	}
}
