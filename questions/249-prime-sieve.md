# 249. Sieve of Eratosthenes

**Question:** List all primes less than `n`.

**Answer:** Mark multiples of each prime starting at its square.

```java
boolean[] composite = new boolean[n]; for (int p = 2; p * p < n; p++) if (!composite[p]) for (int multiple = p * p; multiple < n; multiple += p) composite[multiple] = true;
```

**Complexity:** O(n log log n) time, O(n) space.
