package DSA.Graphs;

import java.util.ArrayList;
import java.util.List;

public class S_02_DFS {
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

        adj.get(6).add(8);
        adj.get(6).add(10);
        adj.get(7).add(10);
        adj.get(7).add(9);
        adj.get(8).add(6);
        adj.get(9).add(7);
        adj.get(10).add(6);
        adj.get(10).add(7);
        System.out.println(dfs(V,adj));
    }
    public static ArrayList<Integer> dfs(int V , ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] isVisited = new boolean[V+1];
        for (int i = 1; i < adj.size() ; i++) {
            //Checking for every node
            if (!isVisited[i]){//If that node is not visited yet, then
                dfs(adj,isVisited,i , ans);//Return its dfs call
                //isVisited[i] = true;//Mark its node as visited
            }
        }
        return ans;
    }

    private static void dfs(ArrayList<ArrayList<Integer>> adj, boolean[] isVisited, int node , ArrayList<Integer> ans) {
        isVisited[node] = true;
        ans.add(node);
        //Marking the current node as visited and adding it into the ans
        for (int adjacent :adj.get(node)) {
            //Now for every adjacent for the current node
            if (!isVisited[adjacent]){//If that node is not yet visited
                dfs(adj,isVisited,adjacent, ans);
                //We will run the function for that node to bring its adjacent node for the depth first search
                isVisited[adjacent] = true;//Marking that adjacent node as true
            }
        }
    }
}
