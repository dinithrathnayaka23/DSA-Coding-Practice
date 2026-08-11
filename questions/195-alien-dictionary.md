# 195. Alien Dictionary

**Question:** Infer character order from a sorted list of alien words.

**Answer:** Compare adjacent words to create precedence edges, then topologically sort the characters.

```java
for (int i = 1; i < words.length; i++) { String a = words[i - 1], b = words[i]; for (int j = 0; j < Math.min(a.length(), b.length()); j++) if (a.charAt(j) != b.charAt(j)) { addEdge(a.charAt(j), b.charAt(j)); break; } }
return topologicalOrder(graph, indegree);
```

**Complexity:** O(total input characters + alphabet edges) time.
