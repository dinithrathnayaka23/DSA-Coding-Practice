# 234. Minimum Platforms

**Question:** Find the minimum platforms needed for all train arrivals and departures.

**Answer:** Sort arrivals and departures; each arrival before the next departure increases active platforms.

```java
Arrays.sort(arrivals); Arrays.sort(departures); int i = 0, j = 0, active = 0, answer = 0; while (i < arrivals.length) { if (arrivals[i] <= departures[j]) { active++; answer = Math.max(answer, active); i++; } else { active--; j++; } } return answer;
```

**Complexity:** O(n log n) time, O(1) extra space.
