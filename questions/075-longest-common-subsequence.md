# 075. Longest Common Subsequence

**Question:** Find the length of the longest subsequence shared by two strings.

**Answer:** Equal characters extend the diagonal result; otherwise take the better result from skipping one character.

```java
int[][] dp = new int[a.length() + 1][b.length() + 1];
for (int i = 1; i <= a.length(); i++) for (int j = 1; j <= b.length(); j++)
    dp[i][j] = a.charAt(i - 1) == b.charAt(j - 1) ? dp[i - 1][j - 1] + 1 : Math.max(dp[i - 1][j], dp[i][j - 1]);
return dp[a.length()][b.length()];
```

**Complexity:** O(nm) time, O(nm) space.
