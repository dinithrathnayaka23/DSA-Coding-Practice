# 402. Happy Number

**Question:** Decide whether repeatedly summing the squares of digits reaches 1.

**Answer:** Detect a cycle with Floyd's slow and fast pointers on the digit-square sequence.

```java
int next(int n) {
    int s = 0;
    while (n > 0) { int d = n % 10; s += d * d; n /= 10; }
    return s;
}
int slow = n, fast = next(n);
while (fast != 1 && slow != fast) { slow = next(slow); fast = next(next(fast)); }
return fast == 1;
```

**Complexity:** O(log n) time, O(1) space.
