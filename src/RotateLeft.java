
public class RotateLeft {

	public static void main(String[] args) {
		int [] arr = new int [] {1, 2, 3, 4, 5};
		
		int n = 3;
		
		for(int i=0; i<n; i++) {
			int j, first;
			first = arr[0];
			for (j=0; j<arr.length-1;j++) {
				arr[j]=arr[j+1];
				
			}
			arr[j]= first;
			
		
		}
		System.out.println("array after rotation");
		  for(int i = 0; i< arr.length; i++){    
	            System.out.print(arr[i] + " ");    
	        }
				
		//}

	}

}
