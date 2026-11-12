# 382. Network Delay Time

**Question:** Find how long a signal takes to reach all nodes in a weighted directed graph.

**Answer:** Dijkstra from the source; the answer is the largest shortest distance.

```java
List<int[]>[] g = new List[n + 1];
for (int i = 0; i <= n; i++) g[i] = new ArrayList<>();
for (int[] t : times) g[t[0]].add(new int[]{t[1], t[2]});
int[] dist = new int[n + 1];
Arrays.fill(dist, Integer.MAX_VALUE);
dist[k] = 0;
PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
pq.add(new int[]{k, 0});
while (!pq.isEmpty()) {
    int[] cur = pq.poll();
    if (cur[1] > dist[cur[0]]) continue;
    for (int[] e : g[cur[0]])
        if (cur[1] + e[1] < dist[e[0]]) {
            dist[e[0]] = cur[1] + e[1];
            pq.add(new int[]{e[0], dist[e[0]]});
        }
}
int max = 0;
for (int i = 1; i <= n; i++) max = Math.max(max, dist[i]);
return max == Integer.MAX_VALUE ? -1 : max;
```

**Complexity:** O(E log V) time, O(V + E) space.
