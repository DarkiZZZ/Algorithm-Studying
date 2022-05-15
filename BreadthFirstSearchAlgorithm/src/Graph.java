import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

    private int vertices;
    private LinkedList<Integer> lists[];
    private boolean visited[];

    Graph(int verts){
        vertices = verts;
        visited = new boolean[vertices];
        lists = new LinkedList[vertices];

    }
}
