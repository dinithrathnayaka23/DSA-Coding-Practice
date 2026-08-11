# 213. Distinct Subsequences

**Question:** Count how many subsequences of `source` equal `target`.

**Answer:** When characters match, choose or skip the source character; when they differ, only skip.

```java
long[] dp = new long[target.length() + 1]; dp[0] = 1;
for (char sourceChar : source.toCharArray()) for (int j = target.length(); j >= 1; j--) if (sourceChar == target.charAt(j - 1)) dp[j] += dp[j - 1];
return dp[target.length()];
```

**Complexity:** O(nm) time, O(m) space.
