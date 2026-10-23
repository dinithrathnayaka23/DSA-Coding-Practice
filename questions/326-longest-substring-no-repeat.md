# 326. Longest Substring Without Repeating Characters

**Question:** Find the length of the longest substring with all distinct characters.

**Answer:** Sliding window with a map of last-seen indices.

```java
Map<Character, Integer> last = new HashMap<>();
int start = 0, best = 0;
for (int i = 0; i < s.length(); i++) {
    char c = s.charAt(i);
    if (last.containsKey(c) && last.get(c) >= start) start = last.get(c) + 1;
    last.put(c, i);
    best = Math.max(best, i - start + 1);
}
return best;
```

**Complexity:** O(n) time, O(k) space for k distinct characters.
