package DSA.Graphs;

import java.util.ArrayList;

public class S_04_CycleDetectionDFS {
    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){
        boolean [] isVisited = new boolean[V+1];//Making a boolean array to check whether a node is visited or not
        for(int i = 1 ; i <= V ; i++){//For every node given
            if(!isVisited[i]){//If that node is not visited
                if(checkForCycle(adj,i,isVisited, -1)){//We will check for cycle
                    //And give parent as -1 by default for the initial node
                    //If cycle is present, returning true
                    return true;
                }
            }
        }
        return false;//Else returning false
    }

    private static boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, int node, boolean[] isVisited, int parent) {
        isVisited[node] = true;//Marking the node as visited
        for (int currentNode:adj.get(node)) {//Now checking for its adjacent nodes
            if (!isVisited[currentNode]){//If it is not yet visited
                if (checkForCycle(adj,currentNode,isVisited,node)){//Then assigning node as the parent of the current node and checking for its adjacent or child
                    //If this call returns true, then returning true back to here from where it was called. (Recursion)
                    return true;
                }
            }else if(parent != currentNode){//else if the node has been already visited, then
                //If the present node (i.e., the adjacent of the node also meaning that it is the child of the node)
                //is not equal to parent, then it means that there are two different parent of this node
                // which can only be possible if there is a cycle present in the given graph. Hence, returning true
                return true;
            }
        }
        return false;//Else returning false
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
