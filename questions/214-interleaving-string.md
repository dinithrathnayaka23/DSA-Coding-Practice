# 214. Interleaving String

**Question:** Decide whether a string is formed by interleaving two other strings while preserving each order.

**Answer:** DP tracks how many characters have been taken from the first string; the second count follows from the total.

```java
boolean[] dp = new boolean[b.length() + 1]; dp[0] = true;
for (int i = 0; i <= a.length(); i++) for (int j = 0; j <= b.length(); j++) if (i + j > 0) dp[j] = (i > 0 && dp[j] && a.charAt(i - 1) == target.charAt(i + j - 1)) || (j > 0 && dp[j - 1] && b.charAt(j - 1) == target.charAt(i + j - 1));
return dp[b.length()];
```

**Complexity:** O(nm) time, O(m) space.
