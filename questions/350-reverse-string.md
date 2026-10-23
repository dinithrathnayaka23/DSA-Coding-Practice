# 350. Reverse String

**Question:** Reverse a character array in place.

**Answer:** Swap characters from both ends moving toward the middle.

```java
int l = 0, r = s.length - 1;
while (l < r) {
    char t = s[l]; s[l++] = s[r]; s[r--] = t;
}
```

**Complexity:** O(n) time, O(1) space.
