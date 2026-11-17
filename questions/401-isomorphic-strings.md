# 401. Isomorphic Strings

**Question:** Check whether characters in one string can be consistently replaced to get the other.

**Answer:** Track the last-seen index of each character in both strings; they must match.

```java
int[] a = new int[256], b = new int[256];
for (int i = 0; i < s.length(); i++) {
    if (a[s.charAt(i)] != b[t.charAt(i)]) return false;
    a[s.charAt(i)] = b[t.charAt(i)] = i + 1;
}
return true;
```

**Complexity:** O(n) time, O(1) space.
