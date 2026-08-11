# 096. LRU Cache

**Question:** Design a fixed-capacity cache that evicts the least recently used entry.

**Answer:** Java's access-ordered `LinkedHashMap` maintains recency and can evict the eldest entry automatically.

```java
class LruCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;
    LruCache(int capacity) { super(capacity, 0.75f, true); this.capacity = capacity; }
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) { return size() > capacity; }
}
```

**Complexity:** O(1) average get/put, O(capacity) space.
