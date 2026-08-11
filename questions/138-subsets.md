# 138. Subsets

**Question:** Generate the power set of an array of distinct values.

**Answer:** For each value, duplicate the current subsets and append that value to the copies.

```java
List<List<Integer>> answer = new ArrayList<>(); answer.add(new ArrayList<>());
for (int value : nums) { int size = answer.size(); for (int i = 0; i < size; i++) { List<Integer> next = new ArrayList<>(answer.get(i)); next.add(value); answer.add(next); } }
return answer;
```

**Complexity:** O(n · 2^n) output time, O(n · 2^n) space.
