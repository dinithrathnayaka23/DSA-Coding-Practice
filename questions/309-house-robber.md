# 309. House Robber

**Question:** Maximize money robbed from a row of houses without robbing two adjacent ones.

**Answer:** At each house choose between skipping it or robbing it plus the best from two houses back.

```java
int prev = 0, cur = 0;
for (int x : nums) {
    int next = Math.max(cur, prev + x);
    prev = cur;
    cur = next;
}
return cur;
```

**Complexity:** O(n) time, O(1) space.
