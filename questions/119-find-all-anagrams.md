# 119. Find All Anagrams

**Question:** Return starting indices of substrings that are anagrams of a pattern.

**Answer:** Use a window with exactly the pattern length and compare its character counts.

```java
int[] need = new int[26], window = new int[26]; for (char c : pattern.toCharArray()) need[c - 'a']++;
for (int right = 0; right < text.length(); right++) { window[text.charAt(right) - 'a']++;
    if (right >= pattern.length()) window[text.charAt(right - pattern.length()) - 'a']--;
    if (Arrays.equals(need, window)) answer.add(right - pattern.length() + 1);
}
```

**Complexity:** O(n · alphabet) with array comparison, O(alphabet) space.
