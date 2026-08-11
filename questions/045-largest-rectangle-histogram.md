# 045. Largest Rectangle in Histogram

**Question:** Find the largest rectangle area formed by histogram bars.

**Answer:** A monotonic increasing stack identifies the first smaller bar on both sides of each height.

```java
Deque<Integer> stack = new ArrayDeque<>();
int best = 0;
for (int i = 0; i <= heights.length; i++) {
    int current = i == heights.length ? 0 : heights[i];
    while (!stack.isEmpty() && current < heights[stack.peek()]) {
        int height = heights[stack.pop()];
        int width = stack.isEmpty() ? i : i - stack.peek() - 1;
        best = Math.max(best, height * width);
    }
    stack.push(i);
}
return best;
```

**Complexity:** O(n) time, O(n) space.
