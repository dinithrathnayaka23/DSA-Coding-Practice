# 050. Maximum Frequency Stack

**Question:** Pop the most frequent value, breaking ties by most recent insertion.

**Answer:** Track each value's frequency, stacks grouped by frequency, and the highest frequency.

```java
void push(int value) {
    int frequency = counts.merge(value, 1, Integer::sum);
    groups.computeIfAbsent(frequency, key -> new ArrayDeque<>()).push(value);
    maxFrequency = Math.max(maxFrequency, frequency);
}
int pop() {
    int value = groups.get(maxFrequency).pop();
    int remaining = counts.get(value) - 1; counts.put(value, remaining);
    if (remaining == 0) maxFrequency--;
    return value;
}
```

**Complexity:** O(1) average per operation, O(n) space.
