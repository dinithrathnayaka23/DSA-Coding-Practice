# 327. Minimum Window Substring

**Question:** Find the smallest substring of s containing every character of t.

**Answer:** Expand the right edge until valid, then shrink the left edge while it stays valid.

```java
int[] need = new int[128];
for (char c : t.toCharArray()) need[c]++;
int missing = t.length(), l = 0, bs = 0, bl = Integer.MAX_VALUE;
for (int r = 0; r < s.length(); r++) {
    if (need[s.charAt(r)]-- > 0) missing--;
    while (missing == 0) {
        if (r - l + 1 < bl) { bl = r - l + 1; bs = l; }
        if (++need[s.charAt(l++)] > 0) missing++;
    }
}
return bl == Integer.MAX_VALUE ? "" : s.substring(bs, bs + bl);
```

**Complexity:** O(n + m) time, O(1) space.
