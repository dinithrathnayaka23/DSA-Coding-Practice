# 120. Substring With Concatenation of All Words

**Question:** Find substrings formed by every given equal-length word exactly once.

**Answer:** Scan once per word offset with a moving window and a frequency map.

```java
for (int offset = 0; offset < wordLength; offset++) { int left = offset, used = 0; Map<String, Integer> window = new HashMap<>();
    for (int right = offset; right + wordLength <= text.length(); right += wordLength) { String word = text.substring(right, right + wordLength); window.merge(word, 1, Integer::sum); used++;
        while (window.getOrDefault(word, 0) > required.getOrDefault(word, 0)) { String old = text.substring(left, left + wordLength); window.merge(old, -1, Integer::sum); left += wordLength; used--; }
        if (used == words.length) answer.add(left);
    }
}
```

**Complexity:** O(n) average time for fixed word length, O(number of words) space.
