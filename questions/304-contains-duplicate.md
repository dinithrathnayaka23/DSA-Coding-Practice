# 304. Contains Duplicate

**Question:** Return true if any value appears at least twice in an array.

**Answer:** Insert into a hash set; a failed add means a duplicate.

```java
Set<Integer> seen = new HashSet<>();
for (int x : nums) if (!seen.add(x)) return true;
return false;
```

**Complexity:** O(n) time, O(n) space.
