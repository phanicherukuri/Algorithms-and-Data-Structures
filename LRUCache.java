package Amazon;

import java.util.*;

public class LRUCache {

	int capacity;
	Map<String, String> cacheMap;
	LinkedList<String> lastUsedElements;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		this.cacheMap = new HashMap<>(capacity);
		this.lastUsedElements = new LinkedList<>();
	}

	public Optional<String> get(String key) {
		if (this.cacheMap.get(key) != null) {
			this.updateList(key);
		}
		return Optional.ofNullable(this.cacheMap.get(key));
	}

	public void put(String key, String value) {
		if (!this.cacheMap.containsKey(key)) {
			if (this.cacheMap.size() >= this.capacity) {
				String lastAccessed = this.lastUsedElements.removeFirst();
				this.cacheMap.remove(lastAccessed);
			}
			this.cacheMap.put(key, value);
			this.lastUsedElements.add(key);
		} else if (this.cacheMap.get(key) != value) {
			this.cacheMap.put(key, value);
			this.updateList(key);
		}
	}

	private void updateList(String key) {
		this.lastUsedElements.removeFirstOccurrence(key);
		this.lastUsedElements.add(key);

	}

}
