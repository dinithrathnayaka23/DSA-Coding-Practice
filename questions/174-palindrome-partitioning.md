# 174. Palindrome Partitioning

**Question:** Split a string into substrings that are all palindromes.

**Answer:** Backtrack over every palindromic prefix, then solve the remaining suffix.

```java
void split(int start) { if (start == text.length()) { answer.add(new ArrayList<>(path)); return; } for (int end = start; end < text.length(); end++) if (isPalindrome(start, end)) { path.add(text.substring(start, end + 1)); split(end + 1); path.remove(path.size() - 1); } }
```

**Complexity:** O(n · 2^n) output-scale time, O(n) recursion space.
