# 027. Quick Sort

**Question:** Sort an array in place using divide and conquer.

**Answer:** Partition around a pivot so smaller values precede it and larger values follow it, then recurse.

```java
void quickSort(int[] a, int lo, int hi) {
    if (lo >= hi) return;
    int pivot = partition(a, lo, hi);
    quickSort(a, lo, pivot - 1);
    quickSort(a, pivot + 1, hi);
}
```

**Complexity:** O(n log n) average time, O(n²) worst case, O(log n) average stack space.
