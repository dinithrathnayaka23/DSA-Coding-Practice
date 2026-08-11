# 087. Meeting Rooms

**Question:** Decide whether one person can attend every meeting.

**Answer:** Sort by start time and reject any meeting that begins before the previous one ends.

```java
Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
for (int i = 1; i < intervals.length; i++) if (intervals[i][0] < intervals[i - 1][1]) return false;
return true;
```

**Complexity:** O(n log n) time, O(1) extra space.
