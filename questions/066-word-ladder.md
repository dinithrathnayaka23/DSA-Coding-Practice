# 066. Word Ladder

**Question:** Find the shortest one-letter transformation sequence from a start word to an end word.

**Answer:** Treat words as graph nodes and use BFS; generate neighbors by changing each character.

```java
Queue<String> queue = new ArrayDeque<>(); queue.offer(begin); seen.add(begin);
while (!queue.isEmpty()) {
    for (int size = queue.size(); size > 0; size--) {
        String word = queue.poll();
        for (String next : neighbors(word)) if (seen.add(next)) queue.offer(next);
    }
    distance++;
}
```

**Complexity:** O(N · L²) with direct neighbor generation for `N` words of length `L`.
