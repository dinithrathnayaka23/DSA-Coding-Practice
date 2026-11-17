# 400. Ransom Note

**Question:** Decide whether a ransom note can be built from the letters of a magazine.

**Answer:** Count magazine letters and consume them for each note letter.

```java
int[] cnt = new int[26];
for (char c : magazine.toCharArray()) cnt[c - 'a']++;
for (char c : note.toCharArray())
    if (--cnt[c - 'a'] < 0) return false;
return true;
```

**Complexity:** O(n + m) time, O(1) space.
