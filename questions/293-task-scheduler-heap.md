# 293. Task Scheduler With a Heap

**Question:** Schedule tasks with cooldowns using an explicit simulation.

**Answer:** A max-heap chooses the most frequent available task and a queue holds tasks cooling down.

```java
while (!available.isEmpty() || !cooling.isEmpty()) { time++; releaseReadyTasks(); if (!available.isEmpty()) { Task task = available.poll(); if (--task.remaining() > 0) cooling.offer(new State(task, time + cooldown)); } }
```

**Complexity:** O(n log alphabet) time, O(alphabet) space.
