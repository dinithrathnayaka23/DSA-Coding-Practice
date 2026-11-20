# 429. Asteroid Collision

**Question:** Simulate asteroids moving left (negative) and right (positive); smaller ones explode on collision.

**Answer:** Stack of surviving asteroids; a negative one fights positives on top of the stack.

```java
Deque<Integer> st = new ArrayDeque<>();
for (int a : asteroids) {
    boolean alive = true;
    while (alive && a < 0 && !st.isEmpty() && st.peek() > 0) {
        if (st.peek() < -a) st.pop();
        else if (st.peek() == -a) { st.pop(); alive = false; }
        else alive = false;
    }
    if (alive) st.push(a);
}
int[] res = new int[st.size()];
for (int i = res.length - 1; i >= 0; i--) res[i] = st.pop();
return res;
```

**Complexity:** O(n) time, O(n) space.
