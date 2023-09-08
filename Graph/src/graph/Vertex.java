package graph;

import java.util.LinkedList;

public class Vertex {
	String vertex;
	LinkedList<Edge> edges;
	int id;
	
	public Vertex(String _vertex, int _id) {
		vertex = _vertex;
		id=_id;
		edges = new LinkedList<>();
	}
	
	public String GetVertex() {
		return vertex;
	}
	
	
	public int GetVertexId() {
		return id;
	}
	public LinkedList<Edge> GetEdges(){
		return edges;
	}
	
	
}
