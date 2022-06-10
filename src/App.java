public class App {
    public static void main(String[] args) throws Exception {
        
        char[] vertices = {'a', 'b', 'c', 'd'};

        Graph graph = new Graph(4);

        for(Character element: vertices){
            graph.addVertex(element);
        }
        
        graph.addEdge('a', 'b');
        graph.addEdge('a', 'c');
        graph.addEdge('b', 'c');
        graph.addEdge('c', 'd');
        

        graph.printGraph();

    }
}
