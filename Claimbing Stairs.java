```
class Solution {
    public int climbStairs(int n) {
       
        if(n == 1)
            return 1;
        
        int memoize[] = new int[n+1];
        memoize[1] =  1;
        memoize[2] = 2;
        for(int i = 3; i<=n; i++  )
        {
            memoize[i] = memoize[i-1] + memoize[i-2];
        }
        return memoize[n];
    }
}
```
n = 1 combination are " 1"
n = 2 combinations are "1 1", "2"
we know these two so hardcoding them

n= 3 combinations are
" 1 1 1"
"2 1"
"1 2"

Can you see the pattern here?
To reach step i, we can make 1 step from all the combinations of mem[ i-1] and make 2 step from all the combinations of mem[ i-2].

Example: i = 3
We can make 1 step from Combinations of i-1 ,
" 1 1" | " 1 "
" 2 " | " 1"
We can make 2 step from Combinations of i-2
" 1 " | " 2 "
So Total Combinations of N = 2 + 1 = 3
