# 358. Longest Palindromic Substring

**Question:** Return the longest palindromic substring of a string.

**Answer:** Expand around every center and keep the widest palindrome found.

```java
int start = 0, len = 0;
for (int c = 0; c < 2 * s.length() - 1; c++) {
    int l = c / 2, r = l + c % 2;
    while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) { l--; r++; }
    if (r - l - 1 > len) { len = r - l - 1; start = l + 1; }
}
return s.substring(start, start + len);
```

**Complexity:** O(n²) time, O(1) space.
