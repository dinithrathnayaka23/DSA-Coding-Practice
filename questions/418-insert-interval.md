# 418. Insert Interval

**Question:** Insert a new interval into a sorted list of non-overlapping intervals and merge as needed.

**Answer:** Copy intervals ending before the new one, merge the overlapping ones, then copy the rest.

```java
List<int[]> out = new ArrayList<>();
int i = 0, n = iv.length;
while (i < n && iv[i][1] < add[0]) out.add(iv[i++]);
while (i < n && iv[i][0] <= add[1]) {
    add[0] = Math.min(add[0], iv[i][0]);
    add[1] = Math.max(add[1], iv[i][1]);
    i++;
}
out.add(add);
while (i < n) out.add(iv[i++]);
return out.toArray(new int[0][]);
```

**Complexity:** O(n) time, O(n) space.
