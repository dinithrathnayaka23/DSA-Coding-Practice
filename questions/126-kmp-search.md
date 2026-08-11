# 126. Knuth–Morris–Pratt Search

**Question:** Search for a pattern in linear time.

**Answer:** Build the longest-prefix-suffix table so mismatches reuse previous matches.

```java
int[] lps = buildLps(pattern); int i = 0, j = 0;
while (i < text.length()) { if (text.charAt(i) == pattern.charAt(j)) { i++; j++; if (j == pattern.length()) return i - j; }
    else if (j > 0) j = lps[j - 1]; else i++; }
return -1;
```

**Complexity:** O(n + m) time, O(m) space.
