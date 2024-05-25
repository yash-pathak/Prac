
public class MaxElement {

	public static void main(String[] args) {
		int arr[] = new int [] {1, 2, 3, 4, 7, 8};
		int a = arr[0];
		for(int i=1;i<=arr.length-1;i++) {
			if(arr[i]>a) {
				a=arr[i];
			}
		}
		System.out.println("max element:- " + a);

	}

}
