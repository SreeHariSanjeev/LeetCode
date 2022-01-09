class Solution {
    public int orangesRotting(int[][] grid) 
    {
        int rows = grid.length;
        if(rows<= 0)
            return -1;
        int columns = grid[0].length;
        int rotten = 2;
        int fresh = 1;
        int empty = 0;
        int freshCount = 0;
        //First find the number of oranges and add rotten oranges to queue
        Queue<Pair> q = new LinkedList<Pair>();

        for(int i = 0; i<rows; i++)
        {
            for(int j = 0; j<columns; j++)
            {
                if(grid[i][j] != empty)
                {

                    if(grid[i][j] == rotten)
                    {
                        q.add(new Pair(i,j));
                    }
                    else
                    {
                        freshCount++;
                    }

                }
            }
        }
        if(freshCount == 0)
            return 0;

        int minutes = -1; // Think of it as distance from rotten orange
        int dir[][] = {{1,0},{-1,0},{0,1},{0,-1}};
        int count = 0;
        while(!q.isEmpty())
        {

            Queue<Pair> tempq = new LinkedList<Pair>();
            while(!q.isEmpty())
            {

                Pair p = q.remove();
                int row = p.row;
                int column = p.column;
                System.out.println(row +" "+column);
                if(grid[row][column] == rotten)
                {
                    for(int i = 0; i<4; i++)
                    {
                        int newr = row + dir[i][0];
                        int newc = column + dir[i][1];

                        //If new indexes are withing array range and orange is fresh

                        if(newr>=0 && newr < rows && newc>=0 && newc<columns && grid[newr][newc] == fresh)
                        {
                            count++;
                            grid[newr][newc] = rotten;   

                            tempq.add(new Pair(newr,newc));   
                        }

                    }
                }
            }
            minutes++;
            q = tempq;
        }

        //Totoal count of oranges becames rotten and total no.of fresh orange initially are same means all the oranges are rotten
        System.out.println(count+" "+freshCount);
        if(count == freshCount)
            return minutes;
        else 
            return -1;

    }
}
class Pair
{
    int row,column;
    Pair(int row, int column)
    {
        this.row = row;
        this.column = column;
    }
}
