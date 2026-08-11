# 114. Rearrange Array by Sign

**Question:** Place positive and negative values alternately while preserving relative order within each sign.

**Answer:** Copy positives and negatives into separate positions of a result array.

```java
int positive = 0, negative = 1; int[] answer = new int[nums.length];
for (int value : nums) { if (value > 0) { answer[positive] = value; positive += 2; } else { answer[negative] = value; negative += 2; } }
return answer;
```

**Complexity:** O(n) time, O(n) space.
