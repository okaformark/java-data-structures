package graph;

import java.util.HashSet;

public class GraphClass {

	HashSet<Vertex> vertex;
	
	public GraphClass() {
		vertex = new HashSet<Vertex>();
	}
	
	 public boolean AddEdge(Vertex v1, Vertex v2){
		 
	       v1.GetEdges().add(new Edge(v2));
	       
	    return v2.GetEdges().add(new Edge(v1));
	
	    }
	 
	 
    public boolean AddVertex(Vertex v){
        return vertex.add(v);
    }

    
    public void printGraph(){
        //I printed it like this. You can print it however you want though
        for(Vertex v : vertex){
            System.out.print("vertex name and id: "+ v.GetVertex() + ":" + v.GetVertexId() +  " : ");
            for(Edge e : v.GetEdges()){
                System.out.print("Destination vertex and id: " + e.Neighbor().GetVertex() + ":" + e.Neighbor().GetVertexId() +  " ==> ");
            }
            System.out.print("\n");
        }
    }
    
    public void GetNeighbors(String _v){
        for(Vertex v : vertex){
        	if(v.vertex.equals(_v)) {
        		System.out.println("Neighbors of "+ _v + " are : " );
        		for(Edge e : v.GetEdges()){
                    System.out.println(e.Neighbor().GetVertex() + ":" + e.Neighbor().GetVertexId() +  " ==> ");
                }
        	}
        }
        if(!(vertex.contains(_v))){

    		System.out.println(_v + " does not exist");
	}
    }
}
