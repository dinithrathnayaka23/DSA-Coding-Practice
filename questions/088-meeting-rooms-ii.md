# 088. Meeting Rooms II

**Question:** Find the minimum number of rooms needed for all meetings.

**Answer:** Sort starts and ends separately; a start before the earliest end needs a room, otherwise reuse one.

```java
Arrays.sort(starts); Arrays.sort(ends); int rooms = 0, active = 0, end = 0;
for (int start : starts) { if (start < ends[end]) active++; else end++; rooms = Math.max(rooms, active); }
return rooms;
```

**Complexity:** O(n log n) time, O(n) space.
