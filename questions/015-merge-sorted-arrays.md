# 015. Merge Sorted Arrays

**Question:** Merge two sorted arrays into one sorted array.

**Answer:** Compare the front unused values and write the smaller one into the output.

```java
int i = 0, j = 0, write = 0;
int[] merged = new int[first.length + second.length];
while (i < first.length && j < second.length)
    merged[write++] = first[i] <= second[j] ? first[i++] : second[j++];
while (i < first.length) merged[write++] = first[i++];
while (j < second.length) merged[write++] = second[j++];
return merged;
```

**Complexity:** O(n + m) time, O(n + m) space.
