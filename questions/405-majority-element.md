# 405. Majority Element

**Question:** Find the element that appears more than n/2 times.

**Answer:** Boyer-Moore voting: pair off different elements; the survivor is the majority.

```java
int cand = 0, count = 0;
for (int x : nums) {
    if (count == 0) cand = x;
    count += x == cand ? 1 : -1;
}
return cand;
```

**Complexity:** O(n) time, O(1) space.
