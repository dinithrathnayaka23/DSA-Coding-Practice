# 413. Intersection of Two Arrays

**Question:** Return the unique values present in both arrays.

**Answer:** Put one array in a set and collect matches from the other, removing as you go.

```java
Set<Integer> a = new HashSet<>();
for (int x : nums1) a.add(x);
List<Integer> out = new ArrayList<>();
for (int x : nums2) if (a.remove(x)) out.add(x);
int[] res = new int[out.size()];
for (int i = 0; i < res.length; i++) res[i] = out.get(i);
return res;
```

**Complexity:** O(n + m) time, O(n) space.
