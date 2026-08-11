# 276. Parking Lot Allocation

**Question:** Allocate vehicles to the smallest suitable available parking space.

**Answer:** Keep a min-heap of free spaces by size and remove the first compatible space.

```java
PriorityQueue<Space> available = new PriorityQueue<>(Comparator.comparingInt(Space::size));
Space allocate(Vehicle vehicle) { return available.stream().filter(space -> space.size() >= vehicle.requiredSize()).min(Comparator.comparingInt(Space::size)).map(this::occupy).orElse(null); }
```

**Complexity:** O(n) with a scan; use size-specific heaps for O(log n) allocation.
