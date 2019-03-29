package dataStructures;

import dataStructures.GraphNode;
import java.util.LinkedList;
import java.util.Queue;

public class GraphBFS {
	
	public static void main(String[] args) {
		GraphBFS g = new GraphBFS(5);  // Instantiate graph with 5 vertices
		
		GraphNode startNode = new GraphNode(2);  // Instantiate start node
		
		g.addEdge(0, 4);
		g.addEdge(0, 1);
		g.addEdge(4, 1);
		g.addEdge(4, 3);
		g.addEdge(3, 1);
		g.addEdge(3, startNode);
		g.addEdge(1, startNode);
		
		System.out.println("Following is Breath First Traversal (starting from vertex 2)"); 
		
		g.BFS(startNode);  // BFS with startNode as starting point
	}
	
	private int V;  // Number of vertices
		
	protected LinkedList<GraphNode> adj[];  // Array of adjacency lists
	
	@SuppressWarnings("unchecked")
	GraphBFS(int v) {
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
	
	void addEdge(int v, GraphNode n) {
		adj[v].add(n);
		adj[n.getData()].add(new GraphNode(v));
	}
	
	// DFS with curr as start vertex
	public void BFS(GraphNode curr) {
		// Queue to traverse through graph level by level
		Queue<GraphNode> q = new LinkedList<>();
		
		boolean[] visited = new boolean[V];  // Array to keep track of visited nodes

		q.add(curr);
		visited[curr.getData()] = true;

		while (!q.isEmpty()) {
			
			curr = q.poll();
			
			System.out.print(curr.getData());  // Print current node

			// Enqueue all adjacent nodes of current node that have not been visited
			for (GraphNode n : adj[curr.getData()]) {
				
				if (!visited[n.getData()])
					q.add(n);
					visited[n.getData()] = true;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}  
