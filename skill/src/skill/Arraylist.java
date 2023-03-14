package skill;

import java.util.ArrayList;

public class Arraylist 
{
	public static void main(String[] args) {
 ArrayList<Integer> l = new ArrayList<Integer>();
 l.add(10);
 l.add(20);
 l.add(30);
 for(int i=0;i<l.size();i++)
 {
	 System.out.println(l.get(i));
 }
 l.remove(1);
 System.out.println(l);
 l.set(0,50);
 System.out.println(l);
 l.clear();
 System.out.println("array is empty");
	}
}
