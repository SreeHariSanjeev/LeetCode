Approach 1 - Using Map Time Complexity O(n) Space Complexity O(n)

public int[] twoSum(int[] numbers, int target) 
    {

        Map<Integer,Integer> map = new HashMap<>();
        int n = numbers.length;
        for(int i =0; i < n; i++)
        {
            int required = target - numbers[i];
            if(map.containsKey(required) && map.get(required) != i)
            {
                int result[]  = new int[2];
                result[0] = map.get(required)+1;
                result[1] = i+1;

                return result;
            }
            map.put(numbers[i],i);

        }
        return null;
    }
Approach 2 - Using Binary Search TimeComplexity - O(nLogn) SpaceComplexity - O(1)

 public int[] twoSum(int[] numbers, int target) 
    {


        int n = numbers.length;
        for(int i =0; i < n; i++)
        {
            int required = target - numbers[i];


            if(required>=numbers[i])
            {
                int value = Arrays.binarySearch(numbers,i+1,n,required);
                if(value>0)
                {
                    int result[] = new int[2];
                    result[0] = i+1;
                    result[1] = value+1;
                    return result;
                }

            }


        }
        return null;
    }
Approach 3 - Using Two Pointers TimeComplexity - O(n) SpaceComplexity - O(1)

public int[] twoSum(int[] numbers, int target) 
    {
       //Complexity - O(nLogn)

        int n = numbers.length;
        int low = 0;
        int high = n-1;
        while(low<=high)
        {
            int sum = numbers[low] + numbers[high];
            if(sum == target)
            {
                int result[] = new int[2];

                // 1-based indexing so adding 1
                result[0] = low+1;
                result[1] = high+1;
                return result;
            }
            else if(sum>target)
            {
                high--;
            }
            else
            {
                low++;
            }
        }

        return new int[0];

    }
