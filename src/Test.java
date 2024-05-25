import java.util.Arrays;

class Test{
	
	public static void main(String[] args) {
		int[] numbers= {3,6,2,1};
		int max = 0;
		
		if(numbers.length==0) {
			System.out.println("array is empty");
		}
		else if(numbers.length-1==1) {
			System.out.println(max);
		}
		else {
			Arrays.sort(numbers);
			System.out.println(numbers[numbers.length-1]);
			System.out.println(Math.max(1, Math.max(3, 2)));
	}
	}

	
}