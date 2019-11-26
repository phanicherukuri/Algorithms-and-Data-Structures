package leetcode;

//705

public class DesignHashSet {

	public static void main(String args[]) {
		MyHashSet myHashSet = new MyHashSet();
		myHashSet.add(1);
		myHashSet.add(1000000);
		System.out.println(myHashSet.contains(1000000));
		System.out.println(myHashSet.contains(1));
		myHashSet.remove(1000000);
		System.out.println(myHashSet.contains(1000000));
	}
	
	
    
}


class MyHashSet {
	int[] arr = new int[1000001];
	public MyHashSet() {
		for(int i = 0; i< arr.length;i++) {
			arr[i] = -1;
		}
	}

	public void add(int key) {
        arr[key] = key;
    }
    
    public void remove(int key) {
        arr[key] = -1;
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        if(arr[key] > -1)
        	return true;
        else
        	return false;
    }
	
	
}