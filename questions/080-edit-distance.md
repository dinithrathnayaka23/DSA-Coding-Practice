# 080. Edit Distance

**Question:** Find the minimum insertions, deletions, and replacements needed to transform one word into another.

**Answer:** Equal characters copy the diagonal value; otherwise take one plus the cheapest neighboring operation.

```java
int[] dp = new int[b.length() + 1];
for (int j = 0; j <= b.length(); j++) dp[j] = j;
for (int i = 1; i <= a.length(); i++) { int diagonal = dp[0]; dp[0] = i;
    for (int j = 1; j <= b.length(); j++) { int above = dp[j];
        dp[j] = a.charAt(i - 1) == b.charAt(j - 1) ? diagonal : 1 + Math.min(diagonal, Math.min(dp[j], dp[j - 1])); diagonal = above; }
}
return dp[b.length()];
```

**Complexity:** O(nm) time, O(m) space.
