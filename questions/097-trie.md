# 097. Implement a Trie

**Question:** Implement insert, exact search, and prefix search for lowercase words.

**Answer:** Each edge represents one character; a terminal flag marks complete words.

```java
class TrieNode { TrieNode[] child = new TrieNode[26]; boolean word; }
void insert(String text) { TrieNode node = root; for (char c : text.toCharArray()) node = node.child[c - 'a'] == null ? (node.child[c - 'a'] = new TrieNode()) : node.child[c - 'a']; node.word = true; }
boolean startsWith(String prefix) { return find(prefix) != null; }
```

**Complexity:** O(L) per operation for word/prefix length `L`, O(total characters) space.
