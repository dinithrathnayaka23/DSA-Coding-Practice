# 328. Group Anagrams

**Question:** Group strings that are anagrams of each other.

**Answer:** Use the sorted characters of each word as the hash key.

```java
Map<String, List<String>> map = new HashMap<>();
for (String w : words) {
    char[] ch = w.toCharArray();
    Arrays.sort(ch);
    map.computeIfAbsent(new String(ch), k -> new ArrayList<>()).add(w);
}
return new ArrayList<>(map.values());
```

**Complexity:** O(n · k log k) time, O(n · k) space.
