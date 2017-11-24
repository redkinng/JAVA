package DijkstraInterpreter;

public class Main {
    public static void main(String[] args) {
        Algorithm algo = new Algorithm();

        algo.interpretExpression("( ( 2 + 4 ) + ( 5 * 1 ) )");

        System.out.println(algo.result());
    }
}
