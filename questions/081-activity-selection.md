# 081. Activity Selection

**Question:** Select the maximum number of non-overlapping activities.

**Answer:** Sort by finishing time and always choose the next activity whose start is after the last finish.

```java
Arrays.sort(activities, Comparator.comparingInt(Activity::finish));
int chosen = 0, finish = Integer.MIN_VALUE;
for (Activity activity : activities) if (activity.start() >= finish) { chosen++; finish = activity.finish(); }
return chosen;
```

**Complexity:** O(n log n) time, O(1) extra space.
