# 319. Meeting Rooms II

**Question:** Find the minimum number of rooms needed for a set of meeting intervals.

**Answer:** Sort starts and ends separately and sweep, counting concurrent meetings.

```java
int[] s = new int[iv.length], e = new int[iv.length];
for (int i = 0; i < iv.length; i++) { s[i] = iv[i][0]; e[i] = iv[i][1]; }
Arrays.sort(s); Arrays.sort(e);
int rooms = 0, j = 0;
for (int i = 0; i < s.length; i++) {
    if (s[i] >= e[j]) j++; else rooms++;
}
return rooms;
```

**Complexity:** O(n log n) time, O(n) space.
