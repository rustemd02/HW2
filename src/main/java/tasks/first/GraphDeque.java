package tasks.first;

import java.util.ArrayDeque;

public class GraphDeque {
    ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

    public static void main(String[] args) {
        GraphDeque graphDeque = new GraphDeque();
        System.out.println(graphDeque.breadthFirst(graphDeque.matrix(), 0));
    }

    public String breadthFirst(boolean[][] adjacencyMatrix, int indexStart) {
        String result = "";
        arrayDeque.push(indexStart);
        while (!arrayDeque.isEmpty()) {
            for (int i = 0; i < adjacencyMatrix.length; i++) {
                if ((adjacencyMatrix[i][indexStart] & !result.contains(String.valueOf(i))) & !arrayDeque.contains(i)) {
                    arrayDeque.push(i);
                }

            }
            result += arrayDeque.removeLast();
            if (!arrayDeque.isEmpty()){
                indexStart = arrayDeque.getLast();

            }
        }
        return result;
    }


    private boolean[][] matrix() {

        return new boolean[][]{{false, true, false, true, true},
                {true, false, true, false, true},
                {false, true, false, true, false},
                {true, false, true, false, false},
                {true, true, false, false, false}};
    }

}
