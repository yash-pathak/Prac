import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Collection {
	
	public static void main(String[] args) {
		Vector v = new Vector();
		int i = 0;
		while(i <10) {
			v.addElement(i);
			i++;
		}
		System.out.println(v);
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			Integer I = (Integer)e.nextElement();
			if(I%2==0) {
				System.out.print(I);
				
				
			}
		}
		
		
		
		
		
		
	}
}
	


