
public class DivideString {

	public static void main(String[] args) {
		String str = "aaaabbbbcccc";
		int len = str.length();
		int n =3;
		int temp = 0, chars = len/n;
		System.out.println(chars);
		String[] divarray = new String[n];
		if(len%n!=0) {
			throw new RuntimeException(" string cant be divided in to given equal parts");
		}
		else {
			for(int i = 0; i<len; i = i+chars) {
				String part = str.substring(i, i+chars);  
				divarray[temp] = part;  
                temp++;  
			}
		}
		System.out.println("equal strings are");
		for(int i = 0; i < divarray.length; i++) {  
            System.out.println(divarray[i]);  
            }  
		

	}

}
