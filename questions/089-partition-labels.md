# 089. Partition Labels

**Question:** Split a string into as many parts as possible so each character appears in only one part.

**Answer:** Track each character's last index and close a partition when the scan reaches the furthest last index seen.

```java
int[] last = new int[26];
for (int i = 0; i < text.length(); i++) last[text.charAt(i) - 'a'] = i;
for (int i = 0, start = 0, end = 0; i < text.length(); i++) {
    end = Math.max(end, last[text.charAt(i) - 'a']);
    if (i == end) { answer.add(end - start + 1); start = i + 1; }
}
```

**Complexity:** O(n) time, O(1) alphabet space.
