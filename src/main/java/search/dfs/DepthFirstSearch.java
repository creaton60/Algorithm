package search.dfs;

public class DepthFirstSearch {

    private static int[][] graph;
    private static boolean[] visited;
    private static int num;

    public static void initDfs(int num){
        DepthFirstSearch.num = num;
    }

    public static void dfs(int i){
        visited[i] = true;
        System.out.print(i+" ");

        for(int j=1; j<=num; j++){
            if(graph[i][j]==1&& !visited[j]){
                dfs(j);
            }
        }
    }

    public static void setGraph(int[][] graph) {
        DepthFirstSearch.graph = graph;
    }
}
