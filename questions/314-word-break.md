# 314. Word Break

**Question:** Decide whether a string can be segmented into dictionary words.

**Answer:** dp[i] is true when some dp[j] is true and s[j..i) is in the dictionary.

```java
Set<String> dict = new HashSet<>(words);
boolean[] dp = new boolean[s.length() + 1];
dp[0] = true;
for (int i = 1; i <= s.length(); i++)
    for (int j = 0; j < i; j++)
        if (dp[j] && dict.contains(s.substring(j, i))) { dp[i] = true; break; }
return dp[s.length()];
```

**Complexity:** O(n²) substring checks, O(n) space.
