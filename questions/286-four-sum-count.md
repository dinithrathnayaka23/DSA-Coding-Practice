# 286. Four Sum Count

**Question:** Count quadruples from four arrays whose sum is zero.

**Answer:** Count all pair sums from the first two arrays and look up opposite sums from the other two.

```java
Map<Integer, Integer> sums = new HashMap<>(); for (int a : first) for (int b : second) sums.merge(a + b, 1, Integer::sum); long answer = 0; for (int c : third) for (int d : fourth) answer += sums.getOrDefault(-(c + d), 0); return answer;
```

**Complexity:** O(n²) time, O(n²) space.
