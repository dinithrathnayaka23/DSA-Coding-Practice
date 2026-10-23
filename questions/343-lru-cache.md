# 343. LRU Cache

**Question:** Design a cache with O(1) get and put that evicts the least recently used entry.

**Answer:** A LinkedHashMap in access order keeps recency; evict the eldest on overflow.

```java
class LRUCache extends LinkedHashMap<Integer, Integer> {
    private final int cap;
    LRUCache(int cap) { super(cap, 0.75f, true); this.cap = cap; }
    public int get(int k) { return super.getOrDefault(k, -1); }
    public void put(int k, int v) { super.put(k, v); }
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> e) { return size() > cap; }
}
```

**Complexity:** O(1) per operation, O(capacity) space.
