package Other;

import java.util.*;

public class ReturnNthHighestRepetitiveElementOfStringArray {

	public static void main(String[] args) {
		String[] arr = new String[] {"the", "the", "a", "is", "is", "is"};
		System.out.println(retrieveNMostRepetitiveElement(arr, 3));
	}

	
	private static String retrieveNMostRepetitiveElement(String[] arr, int nth) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0; i<arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String,Integer>>(map.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare (Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});
		
		int i =1;
		
		for(Map.Entry<String, Integer> entry: list) {
			if(i==nth) {
				return entry.getKey();
			} else {
				i++;
			}
		}
		
		
		
		return "new string";
	}
}
