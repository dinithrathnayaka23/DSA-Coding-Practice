# 094. Single Number

**Question:** Every value appears twice except one; find the single value.

**Answer:** XOR is commutative and cancels equal pairs.

```java
int answer = 0;
for (int value : nums) answer ^= value;
return answer;
```

**Complexity:** O(n) time, O(1) space.
