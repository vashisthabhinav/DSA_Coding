package DSA.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class S_03_CycleDetectionBFS {
    private static class Node{
        int node;
        int parent;
        public Node(int node,int parent){
            this.node = node;
            this.parent = parent;
        }
    }
    static boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, int currentNode , boolean [] isVisited){
        Queue<Node> queue = new LinkedList<>();
        //Adding the parent node into the queue
        queue.add(new Node(currentNode,-1));
        isVisited[currentNode] = true;
        while (queue.size()!=0){
            int node = queue.peek().node;
            int parent = queue.peek().parent;
            queue.remove();
            for (int presentNode:adj.get(node)) {
                if (!isVisited[presentNode]){
                    queue.add(new Node(presentNode,node));
                    isVisited[presentNode] = true;
                }else if (presentNode != parent){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){
        boolean [] isVisited = new boolean[V+1];
        for(int i = 1 ; i <= V ; i++){
            if(!isVisited[i]){
                if(checkForCycle(adj,i,isVisited)){
                    return true;
                }
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