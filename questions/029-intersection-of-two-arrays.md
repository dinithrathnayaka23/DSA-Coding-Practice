# 029. Intersection of Two Arrays

**Question:** Return the distinct values appearing in both arrays.

**Answer:** Put one array into a set and remove matches from it after adding them to the answer.

```java
Set<Integer> values = new HashSet<>();
for (int value : first) values.add(value);
Set<Integer> result = new HashSet<>();
for (int value : second) if (values.contains(value)) result.add(value);
return result;
```

**Complexity:** O(n + m) average time, O(n) space.
