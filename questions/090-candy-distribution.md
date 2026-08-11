# 090. Candy Distribution

**Question:** Give children candies so higher-rated children get more than adjacent lower-rated children, using the minimum total.

**Answer:** Make one pass for increasing runs and one reverse pass for decreasing runs.

```java
int[] candy = new int[ratings.length]; Arrays.fill(candy, 1);
for (int i = 1; i < ratings.length; i++) if (ratings[i] > ratings[i - 1]) candy[i] = candy[i - 1] + 1;
for (int i = ratings.length - 2; i >= 0; i--) if (ratings[i] > ratings[i + 1]) candy[i] = Math.max(candy[i], candy[i + 1] + 1);
return Arrays.stream(candy).sum();
```

**Complexity:** O(n) time, O(n) space.
