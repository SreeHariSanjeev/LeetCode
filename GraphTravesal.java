import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
          Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT*/

        //Scanner
        Scanner s = new Scanner(System.in);
        int total = Integer.parseInt(s.nextLine());
        Graph graph = new Graph(total);
        for(int t = 0; t<total; t++)
        {
            int node = Integer.parseInt(s.nextLine());
           // System.out.println(node);
            graph.addNode(node);
            
        }

        int totalEdge = Integer.parseInt(s.nextLine());
        for(int e=0; e<totalEdge; e++)
        {
          
           int follower = Integer.parseInt(s.next());
           int following = Integer.parseInt(s.next());
           graph.addEdge(follower,following);
          // System.out.println(follower+" "+following);
        }
        
        int A = Integer.parseInt(s.next());
        int B = Integer.parseInt(s.next());
        graph.findRoute(A,B);

        // System.out.println(A+" "+B);

        // Write your code here

    }
static class Graph
{
    
    Map<Integer,Node> map;
    Graph(int size)
    {
        map = new HashMap<>(size);
    }

    void addNode(int node)
    {
        map.put(node, new Node(node));
    }

    void addEdge(int A, int B)
    {
        Node node = map.get(A);
        node.addAdj(B);
    }

    void findRoute(int A, int B)
    {
        
        
        Queue<Integer> queue = new LinkedList();
        queue.add(A);

        while(!queue.isEmpty())
        {
            Integer item = queue.remove();
            Node node = map.get(item);
            ArrayList<Integer> adjacents = node.getAdj();
            
            for(int adj : adjacents)
            {
                if(adj == B)
                {
                    System.out.println(1);
                    return;
                }
                queue.add(adj);
            }
        }
        System.out.println(0);
        
    }


    class Node
    {
        int name;
        ArrayList<Integer> adjacentList;

        Node(int name)
        {
            this.name = name;
            adjacentList = new ArrayList<>();
        }
        void addAdj(int adj)
        {
            adjacentList.add(adj);
        }
        ArrayList<Integer> getAdj()
        {
            return adjacentList;
        }


    }
}


}

