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
        //Making the parent of the current node as -1, then adding it into the queue and marking it as visited
        while (queue.size()!=0){
            //Iterating over the loop till the queue is empty
            int node = queue.peek().node;
            int parent = queue.peek().parent;
            queue.remove();
            //Taking node and parent from the first element in the queue and then removing it
            for (int presentNode:adj.get(node)) {
                //Now checking for the adjacent (or in this case the children of the node)
                if (!isVisited[presentNode]){//If it has not already been visited, then
                    queue.add(new Node(presentNode,node));//Adding it into the queue with parent as node
                    isVisited[presentNode] = true;//And marking it as true
                }else if (presentNode != parent){//else if the node has been already visited, then
                    //If the present node (i.e., the adjacent of the node also meaning that it is the child of the node)
                    //is not equal to parent, then it means that there are two different parent of this node
                    // which can only be possible if there is a cycle present in the given graph. Hence, returning true
                    return true;
                }
            }
        }
        return false;//Else returning false in the end
    }
    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){
        boolean [] isVisited = new boolean[V+1];//Making a boolean array to check whether a node is visited or not
        for(int i = 1 ; i <= V ; i++){
            //For every node given
            if(!isVisited[i]){//If that node is not visited
                if(checkForCycle(adj,i,isVisited)){//We will check for cycle
                    //If cycle is present, returning true
                    return true;
                }
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