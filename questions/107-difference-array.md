# 107. Difference Array

**Question:** Apply many inclusive range additions efficiently.

**Answer:** Add at the range start and subtract after the range, then take one prefix sum.

```java
int[] difference = new int[n + 1];
void add(int left, int right, int amount) { difference[left] += amount; difference[right + 1] -= amount; }
int running = 0;
for (int i = 0; i < n; i++) { running += difference[i]; result[i] = running; }
```

**Complexity:** O(n + q) for `q` updates, O(n) space.
