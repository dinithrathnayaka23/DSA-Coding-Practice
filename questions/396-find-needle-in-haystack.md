# 396. Find the Index of the First Occurrence in a String

**Question:** Return the first index where needle appears in haystack, or -1.

**Answer:** Try every start position and compare the next needle-length characters.

```java
for (int i = 0; i + needle.length() <= haystack.length(); i++)
    if (haystack.startsWith(needle, i)) return i;
return -1;
```

**Complexity:** O(n · m) time, O(1) space.
