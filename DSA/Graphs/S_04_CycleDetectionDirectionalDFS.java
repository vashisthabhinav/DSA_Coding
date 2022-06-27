package DSA.Graphs;

import java.util.ArrayList;

public class S_04_CycleDetectionDirectionalDFS {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int n = 11;
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        /*
        //False case
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(2).add(4);
        adj.get(3).add(5);
        adj.get(3).add(4);
        adj.get(5).add(7);
        adj.get(5).add(6);
        adj.get(6).add(9);
        adj.get(6).add(10);
        adj.get(7).add(8);
        adj.get(8).add(9);
        adj.get(11).add(10);
         */
        //True Case
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(4);
        adj.get(4).add(5);
        adj.get(4).add(6);
        adj.get(5).add(6);
        adj.get(6).add(7);
        adj.get(7).add(8);
        adj.get(8).add(9);
        adj.get(9).add(10);
        adj.get(10).add(11);
        adj.get(11).add(7);
        System.out.println(isCycle(n,adj));
    }

    private static boolean isCycle(int n, ArrayList<ArrayList<Integer>> adj) {
        boolean[] isVisited = new boolean[n+1];
        boolean[] dfsVisited = new boolean[n+1];
        for (int i = 1; i <= n; i++) {
            if (!isVisited[i]){
                if (checkCycleDFS(i,adj,isVisited,dfsVisited)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkCycleDFS(int node, ArrayList<ArrayList<Integer>> adj, boolean[] isVisited, boolean[] dfsVisited) {
        isVisited[node] = true;
        dfsVisited[node] = true;
        for (int adjacent: adj.get(node)) {
            if (!isVisited[adjacent]){
                if (checkCycleDFS(adjacent,adj,isVisited,dfsVisited)){
                    return true;
                }
            }else if (dfsVisited[adjacent]){
                return true;
            }
        }
        dfsVisited[node] = false;
        return false;
    }
}
