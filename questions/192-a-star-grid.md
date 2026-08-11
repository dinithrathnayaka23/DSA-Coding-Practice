# 192. A* Grid Search

**Question:** Find a shortest path in a grid using an admissible heuristic.

**Answer:** Prioritize cells by `distanceSoFar + ManhattanDistanceToGoal`.

```java
PriorityQueue<State> open = new PriorityQueue<>(Comparator.comparingInt(State::priority)); open.offer(new State(start, 0, heuristic(start, goal)));
while (!open.isEmpty()) { State current = open.poll(); if (current.cell().equals(goal)) return current.distance(); for (Cell next : neighbors(current.cell())) relax(next, current, open); }
return -1;
```

**Complexity:** Depends on heuristic; worst case O(V log V), O(V) space.
