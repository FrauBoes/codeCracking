package dataStructures;

import dataStructures.GraphNode;
import java.util.LinkedList;

public class GraphDFS {
	
	public static void main(String[] args) {
		GraphDFS g = new GraphDFS(5);  // Instantiate graph with 5 vertices
		
		g.addEdge(0, 4);
		g.addEdge(0, 1);
		g.addEdge(4, 1);
		g.addEdge(4, 3);
		g.addEdge(3, 1);
		g.addEdge(3, 2);
		g.addEdge(2, 1);

		System.out.println("Following is Depth First Traversal (starting from vertex 2)"); 
		
		g.DFS(2);  // DFS with node 2 as starting point
	}
	
	private int V;  // Number of vertices
		
	protected LinkedList<GraphNode> adj[];  // Array of adjacency lists
	
	@SuppressWarnings("unchecked")
	GraphDFS(int v) {
		V = v;
		adj = new LinkedList[v];
		
		for (int i = 0; i < v; i++) 
			adj[i] = new LinkedList<GraphNode>();
	}
	
	// Add edge to graph
	void addEdge(int v, int w) {
		adj[v].add(new GraphNode(w));	
		adj[w].add(new GraphNode(v));
	}
	
	// DFS with v as start vertex
	public void DFS(int curr) {
		boolean[] visited = new boolean[V];  // array to keep track of visited nodes
		
		DFSUtil(curr, visited);		
	}
	
	public void DFSUtil(int curr, boolean[] visited) {
		visited[curr] = true;
		System.out.print(curr + " ");
		
		for (GraphNode n : adj[curr]) {
			if (! visited[n.getData()]) {
				DFSUtil(n.getData(), visited);
			}
		}
	}
}  
