# 004. Product of Array Except Self

**Question:** Return an array where each position contains the product of every other value, without division.

**Answer:** Write prefix products into the result, then multiply by a running suffix product.

```java
int[] answer = new int[nums.length];
int prefix = 1;
for (int i = 0; i < nums.length; i++) { answer[i] = prefix; prefix *= nums[i]; }
int suffix = 1;
for (int i = nums.length - 1; i >= 0; i--) { answer[i] *= suffix; suffix *= nums[i]; }
return answer;
```

**Complexity:** O(n) time, O(1) extra space.
