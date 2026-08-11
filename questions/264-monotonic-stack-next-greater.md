# 264. Next Greater Element

**Question:** For each value, find the next greater value to its right.

**Answer:** Keep unresolved indices in a decreasing stack and resolve them when a larger value arrives.

```java
for (int i = 0; i < nums.length; i++) { while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) answer[stack.pop()] = nums[i]; stack.push(i); }
```

**Complexity:** O(n) time, O(n) space.
