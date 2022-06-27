package DSA.Graphs;

import java.util.HashSet;

public class S_05_UnreachablePairsOfNodes {
    public static void main(String[] args) {
        int n = 7;
        int[][] edges =
                {
                        {0,2},
                        {0,5},
                        {2,4},
                        {1,6},
                        {5,4}
                };
        System.out.println(countPairs(n,edges));
    }
    public static long countPairs(int n, int[][] edges) {
        long ans = 0L;
        boolean[] isVisited = new boolean[n+1];
        for (int i = 0; i < n; i++) {
            HashSet<Integer> hash = new HashSet<>();
            for (int j = 0; j < edges.length ; j++) {
                if (edges[i][0]==i){
                    int adj = edges[i][1];
                    if (!isVisited[adj]){
                        hash.add(adj);
                        isVisited[adj] = true;
                    }
                }
            }
        }
        return ans;
    }
}
