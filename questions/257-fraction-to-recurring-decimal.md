# 257. Fraction to Recurring Decimal

**Question:** Convert a fraction to a decimal string, enclosing repeating digits in parentheses.

**Answer:** Map each remainder to its output position; a repeated remainder begins the cycle.

```java
Map<Long, Integer> positions = new HashMap<>(); long remainder = numerator % denominator; while (remainder != 0 && !positions.containsKey(remainder)) { positions.put(remainder, answer.length()); remainder *= 10; answer.append(remainder / denominator); remainder %= denominator; } if (remainder != 0) answer.insert(positions.get(remainder), "(").append(')'); return answer.toString();
```

**Complexity:** O(period length) time and space.
