package search.bfs;

import search.dfs.DepthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BreadthFirstSearch {

    private static int[][] graph;
    private static boolean[] visited;
    private static int N;

    private static void bfs(int i){

        Queue<Integer> q = new LinkedList<>();
        q.offer(i);
        visited[i] = true;
        System.out.print(i+" ");

        int temp;
        while(!q.isEmpty()){
            temp = q.poll();
            for(int j=0; j<N+1; j++){
                if(graph[temp][j]==1&& !visited[j]){
                    q.offer(j);
                    visited[j]=true;
                    System.out.print(j+" ");
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        graph = new int[1001][1001];
        int e = sc.nextInt();
        visited = new boolean[10001];
        int startPoint = sc.nextInt();

        int a,b;

        for(int i = 1; i<= e; i++){
            a = sc.nextInt();
            b = sc.nextInt();

            graph[a][b] = graph[b][a] = 1;
        }

        DepthFirstSearch.initDfs(N);

        DepthFirstSearch.dfs(startPoint);

        for(int j=1; j<=N; j++){
            visited[j]=false;
        }
        System.out.println();

        bfs(startPoint);
    }

}
