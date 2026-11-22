# 444. Palindrome Partitioning

**Question:** Partition a string so every part is a palindrome and return all partitions.

**Answer:** Backtrack over cut points, recursing only when the chosen prefix is a palindrome.

```java
void dfs(String s, int start, List<String> cur, List<List<String>> res) {
    if (start == s.length()) { res.add(new ArrayList<>(cur)); return; }
    for (int end = start + 1; end <= s.length(); end++) {
        if (isPal(s, start, end - 1)) {
            cur.add(s.substring(start, end));
            dfs(s, end, cur, res);
            cur.remove(cur.size() - 1);
        }
    }
}
boolean isPal(String s, int l, int r) {
    while (l < r) if (s.charAt(l++) != s.charAt(r--)) return false;
    return true;
}
```

**Complexity:** O(n · 2ⁿ) time, O(n) recursion space.
