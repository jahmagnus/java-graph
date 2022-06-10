import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;


public class Graph {
    
    int numberOfVertices;
    HashMap<Character, ArrayList<Character>> adjList;


    public Graph(int num){
        this.numberOfVertices = num;
        this.adjList = new HashMap<>();
    }

    //add vertex
    public void addVertex(char vertex){
        this.adjList.put(vertex, new ArrayList<>());
    }

    //add edge
    public void addEdge(char src, char dest){
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }
    //print graph
    public void printGraph(){

        for(Character element: adjList.keySet()){
            System.out.println(element);
        }
    }
}
