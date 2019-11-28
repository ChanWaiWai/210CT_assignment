/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q8;
import java.io.*; 
import java.util.*; 
/**
 *
 * @author ChanWai
 */
public class Graph {
    private int point;
    private LinkedList<Integer> adj[];
    
    public Graph(int v){
        point = v;
        adj = new LinkedList[v];
        for(int i=0; i<v; ++i){
            adj[i] = new LinkedList();
        }
    }
    public void addEdge(int v, int w){
        adj[v].add(w);
    }
    
    public void DFSUtil(int v,boolean visited[]) 
    {
        visited[v] = true; 
        System.out.print(v+" "); 
  
        Iterator<Integer> i = adj[v].listIterator(); 
        while (i.hasNext()){ 
            int n = i.next(); 
            if (!visited[n]) 
                DFSUtil(n, visited); 
        } 
    }
    
    public void DFS(){
        boolean visited[] = new boolean[point];
        for(int i=0; i<point; ++i){
            if(visited[i]==false){
                DFSUtil(i, visited);
            }
        }
        System.out.println();
    }
}
