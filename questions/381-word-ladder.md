# 381. Word Ladder

**Question:** Find the length of the shortest transformation sequence from one word to another, changing one letter at a time.

**Answer:** BFS over words, trying every single-letter change that exists in the dictionary.

```java
Set<String> dict = new HashSet<>(words);
Queue<String> q = new LinkedList<>();
q.add(begin);
int steps = 1;
while (!q.isEmpty()) {
    for (int i = q.size(); i > 0; i--) {
        char[] w = q.poll().toCharArray();
        for (int p = 0; p < w.length; p++) {
            char old = w[p];
            for (char c = 'a'; c <= 'z'; c++) {
                w[p] = c;
                String nx = new String(w);
                if (nx.equals(end)) return steps + 1;
                if (dict.remove(nx)) q.add(nx);
            }
            w[p] = old;
        }
    }
    steps++;
}
return 0;
```

**Complexity:** O(N · L · 26) time, O(N · L) space.
