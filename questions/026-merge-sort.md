# 026. Merge Sort

**Question:** Sort an array in ascending order with predictable worst-case performance.

**Answer:** Recursively sort both halves and merge the sorted halves.

```java
void sort(int[] a, int left, int right) {
    if (left >= right) return;
    int mid = left + (right - left) / 2;
    sort(a, left, mid); sort(a, mid + 1, right);
    merge(a, left, mid, right);
}
```

**Complexity:** O(n log n) time, O(n) auxiliary space.
