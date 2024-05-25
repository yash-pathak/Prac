import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ElementFrequency {
	public void countFreq(char arr[], int n) {
		Map<Character, Integer> mp = new HashMap<>();
		for(int i = 0; i<n ; i++) {
			if(mp.containsKey(arr[i])) {
				mp.put(arr[i], mp.get(arr[i])+1);
			}
			else {
				mp.put(arr[i], 1);
			}
		}
//		  for (Map.Entry<Integer, Integer> entry : mp.entrySet())
//	        {
//	            System.out.println(entry.getKey() + "-->" + entry.getValue());
//	        }
		  
		  mp.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder())).limit(4).forEach(i->System.out.println(i.getKey()+"-"+i.getValue()));
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Input = "aabbbccddaaabbccceeff";
		char[] arr = Input.toCharArray();
//		int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
		int n = arr.length;
		ElementFrequency ef = new ElementFrequency();
		ef.countFreq(arr, n);

	}

}
