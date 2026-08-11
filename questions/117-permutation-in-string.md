# 117. Permutation in String

**Question:** Decide whether one string contains a permutation of another.

**Answer:** Maintain character-count differences for a fixed-size sliding window.

```java
int[] difference = new int[26]; for (char c : pattern.toCharArray()) difference[c - 'a']++;
for (int right = 0; right < text.length(); right++) { difference[text.charAt(right) - 'a']--;
    if (right >= pattern.length()) difference[text.charAt(right - pattern.length()) - 'a']++;
    if (Arrays.stream(difference).allMatch(value -> value == 0)) return true;
}
return false;
```

**Complexity:** O(n · alphabet) with the shown check, O(alphabet) space.
