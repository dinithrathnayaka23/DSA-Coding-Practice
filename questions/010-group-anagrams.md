# 010. Group Anagrams

**Question:** Group words that are anagrams of one another.

**Answer:** Use a sorted word as the canonical key for a hash map.

```java
Map<String, List<String>> groups = new HashMap<>();
for (String word : words) {
    char[] chars = word.toCharArray();
    Arrays.sort(chars);
    groups.computeIfAbsent(new String(chars), key -> new ArrayList<>()).add(word);
}
return new ArrayList<>(groups.values());
```

**Complexity:** O(n · k log k) time for `n` words of maximum length `k`.
