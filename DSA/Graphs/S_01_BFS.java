package DSA.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class S_01_BFS {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V = 10;
        for (int i = 0; i <= 10; i++) {
            adj.add(i,new ArrayList<>());
        }
        /*
        Component 1
        1
      2   3
    4       5
    Component 2
        10
      6    7
    8        9
         */
        adj.get(1).add(2);
        adj.get(1).add(3);
        adj.get(2).add(1);
        adj.get(2).add(4);
        adj.get(3).add(1);
        adj.get(3).add(5);
        adj.get(4).add(2);
        adj.get(5).add(3);
        adj.get(6).add(10);
        adj.get(6).add(8);
        adj.get(7).add(10);
        adj.get(7).add(9);
        adj.get(8).add(6);
        adj.get(9).add(7);
        adj.get(10).add(6);
        adj.get(10).add(7);
        System.out.println(bfs(V,adj));
    }
    public static ArrayList<Integer> bfs(int V , ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] isVisited = new boolean[V+1];
        for (int i = 1; i < adj.size(); i++) {
            //Added to reassure that every element has been visited
            if (!isVisited[i]){
                //Now, if the element is not visited,
                Queue<Integer> queue = new LinkedList<>();
                isVisited[i] = true;
                queue.add(i);
                //We add that element into the queue and mark it as isVisited
                while (queue.size()!=0){
                    //Now, checking the queue till its empty
                    int node = queue.poll();//The current node in which we are at
                    ans.add(node);//We can add this into the final answer arraylist
                    for (int adjacent:adj.get(node)) {
                        //Now checking for its adjacent nodes.
                        if (!isVisited[adjacent]){//If the adjacent node is not visited,
                            queue.add(adjacent);//Adding that adjacent node in the queue
                            isVisited[adjacent] = true;//And marking it as true
                        }
                    }
                }
            }
        }
        return ans;//Returning the final ans of Breadth-first Search
    }
}
