package graph;

public class Edge {
	 Vertex vertex;

    public Edge(Vertex _vertex){
        vertex = _vertex;
    }
    
    public Edge() {
		
	}
	
    public Vertex Neighbor() {
    	return vertex;
    }
}
