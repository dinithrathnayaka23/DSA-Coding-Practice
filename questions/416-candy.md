# 416. Candy

**Question:** Give each child at least one candy so that a child with a higher rating than a neighbor gets more candy; minimize the total.

**Answer:** Two passes: left-to-right enforces the left neighbor rule, right-to-left enforces the right neighbor rule.

```java
int n = r.length;
int[] c = new int[n];
Arrays.fill(c, 1);
for (int i = 1; i < n; i++) if (r[i] > r[i - 1]) c[i] = c[i - 1] + 1;
for (int i = n - 2; i >= 0; i--) if (r[i] > r[i + 1]) c[i] = Math.max(c[i], c[i + 1] + 1);
int sum = 0;
for (int x : c) sum += x;
return sum;
```

**Complexity:** O(n) time, O(n) space.
