# 387. Decode Ways

**Question:** Count how many ways a digit string can be decoded into letters (1 -> A ... 26 -> Z).

**Answer:** dp[i] adds dp[i-1] for a valid single digit and dp[i-2] for a valid two-digit number.

```java
int[] dp = new int[s.length() + 1];
dp[0] = 1;
dp[1] = s.charAt(0) == '0' ? 0 : 1;
for (int i = 2; i <= s.length(); i++) {
    if (s.charAt(i - 1) != '0') dp[i] += dp[i - 1];
    int two = Integer.parseInt(s.substring(i - 2, i));
    if (two >= 10 && two <= 26) dp[i] += dp[i - 2];
}
return dp[s.length()];
```

**Complexity:** O(n) time, O(n) space.
