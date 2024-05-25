
public class SortDesc {

	public static void main(String[] args) {
		int arr[] = new int [] {1, 2, 7, 4, 3, 8};
		int temp = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		for(int a:arr) {
			System.out.println(a);
		}
		
		System.out.println(arr[arr.length-3]);
	}

}
