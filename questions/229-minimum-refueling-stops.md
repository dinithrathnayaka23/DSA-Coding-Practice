# 229. Minimum Refueling Stops

**Question:** Reach a target with minimum stops when stations provide fuel.

**Answer:** Add reachable stations to a max-heap and refuel from the largest available tank whenever necessary.

```java
PriorityQueue<Integer> fuel = new PriorityQueue<>(Comparator.reverseOrder()); int stops = 0, position = 0, amount = startFuel; for (Station station : stations) { while (amount < station.position()) { if (fuel.isEmpty()) return -1; amount += fuel.poll(); stops++; } fuel.offer(station.fuel()); } while (amount < target) { if (fuel.isEmpty()) return -1; amount += fuel.poll(); stops++; } return stops;
```

**Complexity:** O(n log n) time, O(n) space.
