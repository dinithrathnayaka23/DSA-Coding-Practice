# 357. Palindromic Substrings

**Question:** Count how many substrings of a string are palindromes.

**Answer:** Expand around each of the 2n-1 possible centers and count every successful expansion.

```java
int count = 0;
for (int c = 0; c < 2 * s.length() - 1; c++) {
    int l = c / 2, r = l + c % 2;
    while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
        count++; l--; r++;
    }
}
return count;
```

**Complexity:** O(n²) time, O(1) space.
