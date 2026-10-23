# 305. Valid Anagram

**Question:** Check whether two strings are anagrams of each other.

**Answer:** Count letters of the first string up and the second string down; all counts must end at zero.

```java
if (s.length() != t.length()) return false;
int[] cnt = new int[26];
for (int i = 0; i < s.length(); i++) {
    cnt[s.charAt(i) - 'a']++;
    cnt[t.charAt(i) - 'a']--;
}
for (int c : cnt) if (c != 0) return false;
return true;
```

**Complexity:** O(n) time, O(1) space.
