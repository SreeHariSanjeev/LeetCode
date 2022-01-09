class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] result = new int[k][2];
        CustomComp ct = new CustomComp();
        PriorityQueue<Point> pq = new PriorityQueue<>(ct);
        for(int i =0; i<points.length; i++)
        {
           int x = points[i][0];
            int y = points[i][1];

            Point pt = new Point(x,y,Math.sqrt((x*x)+(y*y)));
            pq.offer(pt);
        }
        for(int l = 0; l <k ; l++)
        {
            Point pt = pq.poll();
            result[l][0] = pt.x;
            result[l][1] = pt.y;
        }
        return result;
    }
}

class CustomComp implements Comparator<Point>
{
    @Override
    public int compare(Point p1, Point p2)
    {
        return Double.compare(p1.distance,p2.distance);
    }
}
 class Point
{
    double distance;
    int x;
    int y;
    Point(int x, int y, double d)
    {
        this.x = x;
        this.y = y;
        distance = d;
    }
}
