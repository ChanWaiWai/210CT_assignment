/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q8;

/**
 *
 * @author ChanWai
 */
public class Test {
    public static void main(String [] args){
        Graph g = new Graph(10);
        g.addEdge(0, 0);
        g.addEdge(0, 2);
        g.addEdge(1, 4);
        g.addEdge(1, 7);
        g.addEdge(1, 8);
        g.addEdge(3, 6);
        g.addEdge(2, 1);
        g.addEdge(3, 5);
        g.addEdge(2, 9);
        
        System.out.println("Following is Depth First Traversal");
        
        g.DFS();
    }
}
