import java.util.*;
import java.util.AbstractMap.SimpleEntry;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 5, m = 7;
        ArrayList<ArrayList<Map.Entry<Integer, Integer>>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        // edge 1----2
        adj.get(1).add(new SimpleEntry<>(2, 7));
        adj.get(2).add(new SimpleEntry<>(1, 7));
        // edge 1---3
        adj.get(1).add(new SimpleEntry<>(3, 3));
        adj.get(3).add(new SimpleEntry<>(1, 3));
        // edge 1---4
        adj.get(1).add(new SimpleEntry<>(4, 8));
        adj.get(4).add(new SimpleEntry<>(1, 8));
        // edge 2---4
        adj.get(2).add(new SimpleEntry<>(4, 3));
        adj.get(4).add(new SimpleEntry<>(2, 3));
        // edge 3---4
        adj.get(3).add(new SimpleEntry<>(4, 4));
        adj.get(4).add(new SimpleEntry<>(3, 4));
        // edge 3---5
        adj.get(3).add(new SimpleEntry<>(5, 1));
        adj.get(5).add(new SimpleEntry<>(3, 1));
        // edge 4---5
        adj.get(4).add(new SimpleEntry<>(5, 2));
        adj.get(5).add(new SimpleEntry<>(4, 2));

        for (int i = 1; i <= n; i++) {
            System.out.print("Vertex " + i + ": ");
            for (Map.Entry<Integer, Integer> edge : adj.get(i)) {
                System.out.print("(" + edge.getKey() + ", " + edge.getValue() + ") ");
            }
            System.out.println();
        }
    }
}
