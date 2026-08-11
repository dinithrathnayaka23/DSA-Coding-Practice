# 009. Longest Substring Without Repeating Characters

**Question:** Find the length of the longest substring with no repeated character.

**Answer:** Keep a sliding window and jump its left edge past the last occurrence of a duplicate.

```java
Map<Character, Integer> last = new HashMap<>();
int left = 0, best = 0;
for (int right = 0; right < text.length(); right++) {
    char c = text.charAt(right);
    if (last.containsKey(c)) left = Math.max(left, last.get(c) + 1);
    last.put(c, right);
    best = Math.max(best, right - left + 1);
}
return best;
```

**Complexity:** O(n) time, O(min(n, alphabet)) space.
