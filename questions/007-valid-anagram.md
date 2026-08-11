# 007. Valid Anagram

**Question:** Decide whether two lowercase strings contain the same character counts.

**Answer:** Increment counts for the first string and decrement them for the second.

```java
int[] count = new int[26];
for (char c : first.toCharArray()) count[c - 'a']++;
for (char c : second.toCharArray()) count[c - 'a']--;
for (int value : count) if (value != 0) return false;
return first.length() == second.length();
```

**Complexity:** O(n) time, O(1) space.
