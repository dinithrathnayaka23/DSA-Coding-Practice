# 118. Minimum Window Substring

**Question:** Find the shortest substring containing every character of a target string.

**Answer:** Expand until all required counts are covered, then shrink from the left while valid.

```java
Map<Character, Integer> need = countsOf(target), window = new HashMap<>(); int formed = 0, left = 0;
for (int right = 0; right < text.length(); right++) { char c = text.charAt(right); add(window, c); if (matches(c, need, window)) formed++;
    while (formed == need.size()) { saveBest(left, right); char removed = text.charAt(left++); if (removesMatch(removed, need, window)) formed--; remove(window, removed); }
}
```

**Complexity:** O(n) time, O(alphabet) space.
