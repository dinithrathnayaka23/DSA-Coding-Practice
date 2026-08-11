# 271. Insert Delete GetRandom O(1)

**Question:** Design a set supporting insertion, deletion, and random retrieval in average O(1).

**Answer:** Store values in an array and map values to indices; delete by swapping with the last element.

```java
boolean remove(int value) { Integer index = positions.remove(value); if (index == null) return false; int last = values.remove(values.size() - 1); if (index < values.size()) { values.set(index, last); positions.put(last, index); } return true; }
```

**Complexity:** O(1) average operations, O(n) space.
