package tasks.first;

public class FirstTaskSolution implements FirstTask {
    @Override
    public String breadthFirst(boolean[][] adjacencyMatrix, int startIndex) {
        GraphDeque graphDeque = new GraphDeque();
        return graphDeque.breadthFirst(adjacencyMatrix, startIndex);
    }

    @Override
    public Boolean validateBrackets(String s) {
        Brackets brackets = new Brackets();
        return brackets.checkBrackets(s);
    }

    @Override
    public Long polishCalculation(String s) {
        PolishNotation polishNotation = new PolishNotation();
        return polishNotation.reverseCalculator(s);
    }
}
