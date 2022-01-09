class Solution {
    public boolean isValidSudoku(char[][] board) 
    {
        boolean isValid = true;

        for(int in = 0; in < 9 && isValid; in ++)
        {
            int colCount[] = new int[10];
            int rowCount[] = new int[10];

            for(int i=0; i<9; i++)
            {
                if(board[in][i] != '.')
                {
                     int index = board[in][i] - 48;
                      if(rowCount[index] == 1)
                      {
                          System.out.println("Rowwise break");
                          isValid = false;
                          break;
                      }
                    rowCount[index]++;
                }

            }
            for(int j =0; j<9; j++)
            {
                if(board[j][in] != '.')
                {
                    int index = board[j][in] - 48;
                    if(colCount[index] == 1)
                    {
                        System.out.println("colwise break");
                        isValid = false;
                        break;
                    }
                    colCount[index]++;
                }

            }
        }
         for(int row =0; row < 9 && isValid; row = row+3)
       {
           for(int column = 0; column <9 && isValid; column = column +3)
           {
               int count[] = new int[10];
               for(int i = row; i<row+3 && isValid; i++)
               {
                   for(int j = column ; j<column+3 && isValid; j++)
                   {
                      if(board[i][j] != '.')
                      {
                          int index = board[i][j] - 48;
                          if(count[index] == 1)
                          {
                              System.out.println("3*3 break");
                              isValid = false;
                              break;
                          }
                          count[index]++;
                      }
                   }

               }
           }
       }
        return isValid;
    }
}
