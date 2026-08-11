# 098. Disjoint Set Union

**Question:** Maintain connected components while edges are added.

**Answer:** Union by rank and path compression make repeated connectivity checks nearly constant time.

```java
int find(int node) { return parent[node] == node ? node : (parent[node] = find(parent[node])); }
boolean union(int a, int b) { a = find(a); b = find(b); if (a == b) return false; if (rank[a] < rank[b]) { int t = a; a = b; b = t; } parent[b] = a; if (rank[a] == rank[b]) rank[a]++; return true; }
```

**Complexity:** O(alpha(n)) amortized per operation, O(n) space.
