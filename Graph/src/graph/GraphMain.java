package graph;

import java.util.Random;
import java.util.Scanner;

public class GraphMain {

	public static void main(String[] args) {
		GraphClass graphClass = new GraphClass();

        //vertices
        Vertex v0 = new Vertex("A",0);
        Vertex v1 = new Vertex("B",1);
        Vertex v2 = new Vertex("C",2);
        Vertex v3 = new Vertex("D",3);

        graphClass.AddVertex(v0);
        graphClass.AddVertex(v1);
        graphClass.AddVertex(v2);
        graphClass.AddVertex(v3);

        //edges
        graphClass.AddEdge(v0, v1);
        graphClass.AddEdge(v1, v2);
        graphClass.AddEdge(v2, v0);
        graphClass.AddEdge(v2, v3);
        graphClass.AddEdge(v3, v2);

        
        
        System.out.println("Enter 1 to print list, 2 to get neighbors, 3 to exit");
        int x = Integer.parseInt(new Scanner(System.in).nextLine());
        
        
        while(x == 1 || x==2 || x==3) {
        	
        	if(x==1) {
        		
        		graphClass.printGraph();
        	};
        	
        	if(x==2) {
        		System.out.println("Enter the vertex you want to get its neigbor");
        		String v = new Scanner(System.in).nextLine().toUpperCase();
        		graphClass.GetNeighbors(v);
        	};
        	
        	System.out.println("Enter 1 to print list, 2 to get neighbors, 3 to exit");
            x = Integer.parseInt(new Scanner(System.in).nextLine());
        }
        
        System.out.println("GOOD BYE");
	}

}
