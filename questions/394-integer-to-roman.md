# 394. Integer to Roman

**Question:** Convert an integer from 1 to 3999 to a Roman numeral.

**Answer:** Greedily subtract the largest value from a descending table.

```java
int[] val = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
String[] sym = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
StringBuilder sb = new StringBuilder();
for (int i = 0; i < val.length; i++)
    while (num >= val[i]) { num -= val[i]; sb.append(sym[i]); }
return sb.toString();
```

**Complexity:** O(1) time, O(1) space.
