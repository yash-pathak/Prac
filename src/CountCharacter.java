
public class CountCharacter {

	public static void main(String[] args) {
		int count = 0;
		String str =  "TODO Auto-generated method stub";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println(count);

	}

}
