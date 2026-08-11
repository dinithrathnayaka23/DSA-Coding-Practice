# 116. Longest Repeating Character Replacement

**Question:** Find the longest substring that can become one repeated character after at most `k` replacements.

**Answer:** A window is valid when its length minus its most frequent character count is at most `k`.

```java
int left = 0, maxCount = 0, answer = 0; int[] count = new int[26];
for (int right = 0; right < text.length(); right++) { maxCount = Math.max(maxCount, ++count[text.charAt(right) - 'A']);
    while (right - left + 1 - maxCount > k) count[text.charAt(left++) - 'A']--;
    answer = Math.max(answer, right - left + 1);
}
return answer;
```

**Complexity:** O(n) time, O(1) alphabet space.
