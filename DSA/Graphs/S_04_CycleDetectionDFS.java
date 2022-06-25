package DSA.Graphs;

import java.util.ArrayList;

public class S_04_CycleDetectionDFS {
    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){
        boolean [] isVisited = new boolean[V+1];
        for(int i = 1 ; i <= V ; i++){
            if(!isVisited[i]){
                if(checkForCycle(adj,i,isVisited, -1)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, int node, boolean[] isVisited, int parent) {
        isVisited[node] = true;
        for (int currentNode:adj.get(node)) {
            if (!isVisited[currentNode]){
                if (checkForCycle(adj,currentNode,isVisited,node)){
                    return true;
                }
            }else if(parent != currentNode){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V = 11;
        for (int i = 0; i <= V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(4);
        adj.get(3).add(5);
        adj.get(4).add(2);
        adj.get(5).add(3);
        adj.get(5).add(10);
        adj.get(5).add(6);
        adj.get(6).add(5);
        adj.get(6).add(7);
        adj.get(7).add(6);
        adj.get(7).add(8);
        adj.get(8).add(7);
        adj.get(8).add(11);
        adj.get(8).add(9);
        adj.get(9).add(8);
        adj.get(9).add(10);
        adj.get(10).add(5);
        adj.get(10).add(9);
        adj.get(11).add(8);
        System.out.println(isCycle(V,adj));
    }
}
