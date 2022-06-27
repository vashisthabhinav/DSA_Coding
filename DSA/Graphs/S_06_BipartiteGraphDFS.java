package DSA.Graphs;

import java.util.ArrayList;

public class S_06_BipartiteGraphDFS {
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
                if (!dfsBipartite(adj,i,colour)){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean dfsBipartite(ArrayList<ArrayList<Integer>> adj, int node, int[] colour) {
        if (colour[node]==-1){
            colour[node] = 1;
        }
        for (int adjacent:adj.get(node)) {
            if (colour[adjacent]==-1){
                colour[adjacent] = 1 - colour[node];
                if(!dfsBipartite(adj,adjacent,colour)){
                    return false;
                }
            }else if (colour[adjacent] == colour[node]){
                return false;
            }
        }
        return true;
    }
}