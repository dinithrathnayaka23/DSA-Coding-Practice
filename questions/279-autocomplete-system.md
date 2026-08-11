# 279. Autocomplete System

**Question:** Return the three most popular sentences matching a typed prefix.

**Answer:** Store sentences in a trie and rank terminal suggestions by frequency then lexicographic order.

```java
TrieNode node = prefixNode(input); if (node == null) return List.of(); List<String> matches = collect(node); matches.sort(Comparator.comparingInt((String s) -> -frequency.get(s)).thenComparing(s -> s)); return matches.subList(0, Math.min(3, matches.size()));
```

**Complexity:** O(prefix length + matched output), plus trie storage.
