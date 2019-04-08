package dataStructures;

import java.util.HashMap;

public class GraphNode {
	private int data;
	private HashMap<Character, GraphNode> edges = new HashMap<>();
	
	public GraphNode(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	
	public void addEdge(char sign, GraphNode node) {
		edges.put(sign, node);
	}
	
	public HashMap<Character, GraphNode> getEdges() {
		return edges;
	}
}
