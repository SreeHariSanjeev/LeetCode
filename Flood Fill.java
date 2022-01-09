class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) 
    {
        int startColor = image[sr][sc];

        return floodFill(image,sr,sc,startColor,newColor);

    }
    int[][] floodFill(int[][] image, int sr, int sc, int startColor, int newColor)
    {
        if(sr>=0 && sr < image.length && sc >= 0 && sc < image[sr].length)
        {
            /* image[sr][sc] != newColor this  check is added to avoid loop. We check if it is already visited.
               Ex:[[0,0,0],[0,1,1]]
                1
                1
                1
                */

            if(image[sr][sc] == startColor && image[sr][sc] != newColor)
            {
                image[sr][sc]  = newColor;

                floodFill(image,sr+1,sc,startColor,newColor);
                floodFill(image,sr-1,sc,startColor,newColor);
                floodFill(image,sr,sc+1,startColor,newColor);
                floodFill(image,sr,sc-1,startColor,newColor);
            } 
        }
        return image;
    }
}
