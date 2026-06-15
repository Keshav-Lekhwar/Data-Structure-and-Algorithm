import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Graph {

    // DFS
    public static void DFS(int graph[][], int start) {

        boolean[] visited = new boolean[graph.length];
        Arrays.fill(visited, false);

        dfsUtil(graph, visited, start);
    }

    public static void dfsUtil(int graph[][], boolean[] visited, int start) {

        System.out.print(start + " ");
        visited[start] = true;

        for (int i = 0; i < graph.length; i++) {

            if (graph[start][i] == 1 && visited[i] != true) {

                dfsUtil(graph, visited, i);

            }
        }

    }

    // BFS

    public static void BFS(int graph[][], int start){

        boolean[] visited = new boolean[graph.length];

        Arrays.fill(visited, false);

       
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);

        visited[start]= true;

        while (!q.isEmpty()) {

            int u = q.poll();

             System.out.print(u+" ");

            for(int i=0; i<graph.length; i++){

                if (graph[u][i]==1 && visited[i] != true) {

                    q.offer(i);
                    visited[i]= true;
                    
                }
            }
            
        }


    }
    

    public static void main(String[] args) {

        int[][] graph = {
                { 0, 1, 1, 0, 0 },
                { 1, 0, 0, 1, 0 },
                { 1, 0, 0, 0, 1 },
                { 0, 1, 0, 0, 1 },
                { 0, 0, 1, 1, 0 }
        };

        DFS(graph, 0);
        System.out.println();

        BFS(graph,0);

    }
}