# 225. Queue Reconstruction by Height

**Question:** Reconstruct people ordered by height and count of taller people before them.

**Answer:** Sort tallest first, then insert each person at their required index.

```java
Arrays.sort(people, (a, b) -> a[0] != b[0] ? Integer.compare(b[0], a[0]) : Integer.compare(a[1], b[1])); List<int[]> order = new LinkedList<>(); for (int[] person : people) order.add(person[1], person); return order.toArray(new int[0][]);
```

**Complexity:** O(n²) with linked-list insertion by index, O(n) space.
