# 076. Word Break

**Question:** Decide whether a string can be segmented into dictionary words.

**Answer:** `dp[i]` is true when the prefix ending at `i` can be formed from dictionary entries.

```java
boolean[] dp = new boolean[text.length() + 1]; dp[0] = true;
for (int end = 1; end <= text.length(); end++) for (int start = 0; start < end; start++)
    if (dp[start] && dictionary.contains(text.substring(start, end))) { dp[end] = true; break; }
return dp[text.length()];
```

**Complexity:** O(n²) substring checks plus dictionary lookup, O(n) space.
