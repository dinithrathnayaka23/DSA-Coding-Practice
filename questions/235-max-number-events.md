# 235. Maximum Number of Events

**Question:** Attend the maximum number of one-day events with given start and end dates.

**Answer:** Process days in order, adding events that start today and attending the available event with the earliest end.

```java
Arrays.sort(events, Comparator.comparingInt(a -> a[0])); PriorityQueue<Integer> ends = new PriorityQueue<>(); for (int day = 1, index = 0; day <= lastDay; day++) { while (index < events.length && events[index][0] == day) ends.offer(events[index++][1]); while (!ends.isEmpty() && ends.peek() < day) ends.poll(); if (!ends.isEmpty()) { ends.poll(); attended++; } }
```

**Complexity:** O(n log n) time, O(n) space.
