# 399. First Unique Character in a String

**Question:** Return the index of the first non-repeating character, or -1.

**Answer:** Count letters, then find the first letter with count one.

```java
int[] cnt = new int[26];
for (char c : s.toCharArray()) cnt[c - 'a']++;
for (int i = 0; i < s.length(); i++)
    if (cnt[s.charAt(i) - 'a'] == 1) return i;
return -1;
```

**Complexity:** O(n) time, O(1) space.
