
public class SumArray {

	public static void main(String[] args) {
		int arr[] = new int [] {1, 2, 3, 4, 7, 8};
		int sum = 0;
		for(int i = 0; i<=arr.length-1;i++) {
			sum = sum + arr[i];
		}
		System.out.println("summ of array element: " + sum);

	}

}
