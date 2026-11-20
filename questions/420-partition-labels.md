# 420. Partition Labels

**Question:** Split a string into as many parts as possible so each letter appears in at most one part.

**Answer:** Record each letter's last index and cut when the scan reaches the farthest last index.

```java
int[] last = new int[26];
for (int i = 0; i < s.length(); i++) last[s.charAt(i) - 'a'] = i;
List<Integer> res = new ArrayList<>();
int start = 0, end = 0;
for (int i = 0; i < s.length(); i++) {
    end = Math.max(end, last[s.charAt(i) - 'a']);
    if (i == end) { res.add(end - start + 1); start = i + 1; }
}
return res;
```

**Complexity:** O(n) time, O(1) space.
