# 170. Task Scheduler

**Question:** Schedule tasks with a cooldown interval between equal tasks in the fewest time units.

**Answer:** The most frequent task determines the frame size; fill idle slots with other tasks.

```java
int maximum = Arrays.stream(counts).max().orElse(0), tied = (int) Arrays.stream(counts).filter(x -> x == maximum).count();
return Math.max(tasks.length, (maximum - 1) * (cooldown + 1) + tied);
```

**Complexity:** O(n + alphabet) time, O(alphabet) space.
