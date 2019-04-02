package search.bfs;

import java.io.*;
import java.util.*;

public class BreadthFirstSearchClean {

    private static int E;
    private static int S;
    private static List<Integer>[] graph;

    private static List<Integer> bfs;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        E = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        graph = new ArrayList[E+1];

        //각 정점의 간선으로 연결되어있는 정점들에 대한 정보를 담을 리스트를 초기화
        for (int i = 1; i <= E; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            //방향성이 없는 그래프이기 때문에 연결되는 양쪽에 서로에 대한 정보를 넣어줌
            graph[x].add(y);
            graph[y].add(x);
        }

        //연결된 간선 정보를 정렬
        for (int i=1; i<=E; i++){
            Collections.sort(graph[i]);
        }

        bfsSol();
        for (Integer bf : bfs) {
            System.out.print(bf + " ");
        }
    }

    private static void bfsSol(){
        bfs = new ArrayList<>();
        //이미 방문한 정점의 정보를 담을 배열
        boolean[] visit = new boolean[E + 1];
        Queue<Integer> q1 = new LinkedList<>();

        //시작정점을 큐에 넣어줌
        q1.add(S);
        //시작정점을 방문했다는 정보 저장
        visit[S] = true;

        //큐에 정점이 없어질 때까지 반복
        while(!q1.isEmpty()){
            //큐에서 정점을 poll해서 이동함
            int q = q1.poll();
            bfs.add(q);
            //이동한 정점에서 연결된 정점들을 큐에 넣어주고 visit배열에 체크
            for(int i : graph[q]){
                if(!visit[i]){
                    q1.add(i);
                    visit[i] = true;
                }
            }
        }

    }
}
