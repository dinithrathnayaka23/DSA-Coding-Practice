# 104. Contiguous Array

**Question:** Find the longest subarray containing equal numbers of zeroes and ones.

**Answer:** Treat zero as `-1`; equal prefix balances delimit valid ranges.

```java
Map<Integer, Integer> first = new HashMap<>(); first.put(0, -1);
int balance = 0, answer = 0;
for (int i = 0; i < nums.length; i++) { balance += nums[i] == 1 ? 1 : -1;
    if (first.containsKey(balance)) answer = Math.max(answer, i - first.get(balance)); else first.put(balance, i);
}
return answer;
```

**Complexity:** O(n) time, O(n) space.
