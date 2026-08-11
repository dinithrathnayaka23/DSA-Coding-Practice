# 226. Hand of Straights

**Question:** Decide whether cards can be divided into consecutive groups of a fixed size.

**Answer:** Always start the next group at the smallest remaining card.

```java
TreeMap<Integer, Integer> counts = frequencies(hand); for (int start : new ArrayList<>(counts.keySet())) { int amount = counts.getOrDefault(start, 0); for (int value = start; value < start + groupSize; value++) { if (counts.getOrDefault(value, 0) < amount) return false; counts.put(value, counts.get(value) - amount); } } return true;
```

**Complexity:** O(n log n) time, O(n) space.
