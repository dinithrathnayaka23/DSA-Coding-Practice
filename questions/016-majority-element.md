# 016. Majority Element

**Question:** Find the value appearing more than half the time.

**Answer:** Boyer–Moore cancellation leaves the majority value as the candidate.

```java
int candidate = 0, votes = 0;
for (int value : nums) {
    if (votes == 0) candidate = value;
    votes += value == candidate ? 1 : -1;
}
return candidate;
```

**Complexity:** O(n) time, O(1) space.
