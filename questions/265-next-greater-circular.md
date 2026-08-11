# 265. Next Greater Element II

**Question:** Find next greater values in a circular array.

**Answer:** Scan indices twice using modulo arithmetic while retaining unresolved indices from the first pass.

```java
for (int i = 0; i < 2 * nums.length; i++) { int index = i % nums.length; while (!stack.isEmpty() && nums[stack.peek()] < nums[index]) answer[stack.pop()] = nums[index]; if (i < nums.length) stack.push(index); }
```

**Complexity:** O(n) time, O(n) space.
