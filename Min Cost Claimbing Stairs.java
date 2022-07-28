**DP - Top Down approach  **
```
public int minCostClimbingStairs(int[] cost) 
    {
        int n = cost.length;
        int[] mem = new int[n];
        return Math.min(find(n-1,cost,mem), find(n-2,cost,mem));
        
    }
    int find(int n, int cost[],int mem[])
    {
        if(n< 0)
            return 0;
        
        if(mem[n] != 0)
            return mem[n];
        
        mem[n]  = cost[n] + Math.min(find(n-1,cost,mem),find(n-2,cost,mem));
        return mem[n];
    }
```
**DP - Bottom up Approach **
```
public int minCostClimbingStairs(int[] cost) 
    {
         int n = cost.length;
        if(n == 0)
            return 0;
        else if(n == 1)
            return cost[1];
        else if(n==2)
            return Math.min(cost[0],cost[1]);
        
        int[] mem = new int[n];
        mem[0] = cost[0];
        mem[1] = cost[1]; 
        for(int i = 2; i<n; i++)
        {
            mem[i] = Math.min(mem[i-1],mem[i-2]) + cost[i];
        }
        return Math.min(mem[n-1],mem[n-2]);
    }
```
