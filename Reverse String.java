Approach 1

class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        for(int i=0; i<n/2; i++)
        {
            swap(i,n-1-i,s);
        }

    }
    void swap(int index1, int index2, char [] arr )
    {
        char temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
Approach 2 (Recursive)

class Solution 
{
    public void reverseString(char[] s) 
    {
       reverse(s,0);

    }
    void reverse(char[] s, int i)
    {
        int n = s.length;
        if(i<n/2)
        {
            reverse(s,i+1);
            swap(i , n-1-i , s);
        }

    }
    void swap(int index1, int index2, char [] arr )
    {
        System.out.println("Swapping "+index1+" "+index2);
        char temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
