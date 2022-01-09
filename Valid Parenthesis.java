class Solution {
    public boolean isValid(String s) 
    {
        char[] ch = s.toCharArray();
         Stack st = new Stack(3);
        for(char c : ch)
        {
            if(c == '{' || c == '[' || c == '(')
            {
                 st.push(c);
            } 
            else
            {
                if(st.isEmpty())
                {
                    return false;
                }
                char top = st.top();
                if(!((c == '}' && top == '{')|| (c ==']' && top =='[') || (c == ')' && top == '(')))
                {
                return false;  
                }
                st.pop();
            }
                

        }
        return st.isEmpty();
        
    }
   
    class Stack
    {
        int size;
        int top=-1;
        char[] arr;
        int max;
        Stack(int size)
        {
             this.size = size;
            this.max = size;
             this.arr = new char[size];
        }
        void push(char c)
        {
            if(top == max-1)
            {
                System.out.println("increasing size");
                char[] temp = arr;
                arr = new char[max*2];
                
                for(int i=0; i<max;i++)
                {
                    arr[i] = temp[i];
                }
                max = max*2;
            }
           
            arr[++top] = c; 
            
            
        }
        char pop()
        {
            isEmpty();
            return arr[top--];
        }
        boolean isEmpty()
        {
            if(top == -1)
            {
                System.out.println("Stack is empty");
                return true;
            }
            return false;
        }
        char top()
        {
            return arr[top];
        }
        
    }
}
