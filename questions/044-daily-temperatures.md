# 044. Daily Temperatures

**Question:** For every day, find how many days until a warmer temperature.

**Answer:** Keep indices of unresolved days in a decreasing monotonic stack.

```java
int[] answer = new int[temperatures.length];
Deque<Integer> stack = new ArrayDeque<>();
for (int day = 0; day < temperatures.length; day++) {
    while (!stack.isEmpty() && temperatures[day] > temperatures[stack.peek()]) {
        int previous = stack.pop(); answer[previous] = day - previous;
    }
    stack.push(day);
}
return answer;
```

**Complexity:** O(n) time, O(n) space.
