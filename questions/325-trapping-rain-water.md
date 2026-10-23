# 325. Trapping Rain Water

**Question:** Compute how much water an elevation map traps after rain.

**Answer:** Two pointers track the max height from each side; the lower side decides the water level.

```java
int l = 0, r = h.length - 1, lm = 0, rm = 0, water = 0;
while (l < r) {
    if (h[l] < h[r]) {
        lm = Math.max(lm, h[l]);
        water += lm - h[l++];
    } else {
        rm = Math.max(rm, h[r]);
        water += rm - h[r--];
    }
}
return water;
```

**Complexity:** O(n) time, O(1) space.
