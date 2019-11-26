package leetcode;

//706

public class DesignHashMap {

	public static void main(String[] args) {
		MyHashMap myHashMap = new MyHashMap();
		myHashMap.put(1, 10000);
		System.out.println(myHashMap.get(1));
		myHashMap.remove(1);
		System.out.println(myHashMap.get(1));
	}

}

class MyHashMap {
	int[] arr = new int[1000001];
	public MyHashMap() {
		for(int i=0;i<arr.length;i++) {
			arr[i] = -1;
		}
	}

	/** value will always be non-negative. */
	public void put(int key, int value) {
		arr[key] = value;
	}

	/**
	 * Returns the value to which the specified key is mapped, or -1 if this map
	 * contains no mapping for the key
	 */
	public int get(int key) {
		return arr[key];
	}

	/**
	 * Removes the mapping of the specified value key if this map contains a mapping
	 * for the key
	 */
	public void remove(int key) {
		arr[key] = -1;
	}
}