class Solution {
    public int[][] updateMatrix(int[][] mat) 
    {

        int rows = mat.length;
        if(rows == 0)
        {
            return mat;
        }
        int result[][] = mat;
        int columns = mat[0].length;

        Queue<Index> q = new LinkedList<Index>();
        // add  0 cells to queue and mark other cells as MAX

        for(int i = 0; i<rows; i++)
        {

            for(int j =0; j<columns; j++)
            {
                if(mat[i][j] == 0)
                    q.add(new Index(i,j));
                else
                {
                    mat[i][j] = Integer.MAX_VALUE;
                }
            }
        }


            int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}};

            while(!q.isEmpty())
            {
                Index in = q.remove();
                int r = in.row;
                int c = in.column;

                //check 4 adjacent cells
                for(int k =0; k<4 ;k++)
                {
                    int newr = r+dir[k][0];
                    int newc = c+dir[k][1];

                    if(newr>=0 && newr<rows && newc >=0 && newc<columns)
                    {
                        // If the value new adjust cell is large, update the distance and add that to queue.
                        /*
                        Ex: 0 0 0
                            0 Max 0
                            Max Max Max

                            in this example First we transform it to 
                            0 0 0
                            0 1 0
                            Max Max Max

                            then we take index 1,1 and update 
                            0 0 0
                            0 1 0
                            Max 1 Max
                        */
                        if(mat[newr][newc] > mat[r][c])
                        {
                            result[newr][newc] = mat[r][c]+1;

                            q.add(new Index(newr,newc));
                        }
                    }
                }

        }
        return result;
    }
}
class Index
{
    int row,column;
    Index(int row, int column)
    {
        this.row = row;
        this.column = column;
    }
}
