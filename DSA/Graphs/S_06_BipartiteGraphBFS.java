package DSA.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class S_06_BipartiteGraphBFS {
    public static void main(String[] args) {
        int n = 7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

//        0--1--2--3--4--5
//           |        |
//           |---6----|
        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(2).add(3);
        adj.get(3).add(2);

        adj.get(4).add(3);
        adj.get(3).add(4);

        adj.get(4).add(5);
        adj.get(5).add(4);

        adj.get(4).add(6);
        adj.get(6).add(4);


        adj.get(1).add(6);
        adj.get(6).add(1);

        if(checkBipartite(adj,n)){
            System.out.println("Yes it is a bipartite graph");
        }else{
            System.out.println("Not a bipartite graph");
        }
    }
    private static boolean checkBipartite(ArrayList<ArrayList<Integer>> adj, int n) {
        int[] colour = new int[n];
        for (int i = 0; i < n; i++) {
            colour[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            while (colour[i] == -1){
                if (!bfsBipartite(adj,i,colour)){
                    return false;
                }
            }
        }
        return true;
    }
    private static boolean bfsBipartite(ArrayList<ArrayList<Integer>> adj, int node, int[] colour) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        colour[node] = 1;
        while (queue.size()!=0){
            int currNode = queue.poll();
            for (int adjacent:adj.get(currNode)) {
                if (colour[adjacent] == -1){
                    //Alternating the colour
                    colour[adjacent] = 1 - colour[currNode];
                    queue.add(adjacent);
                }
                else if(colour[adjacent]==colour[currNode]){
                    return false;
                }
            }
        }
        return true;
    }
}
