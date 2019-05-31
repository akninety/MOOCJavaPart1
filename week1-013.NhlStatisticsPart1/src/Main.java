
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {

        System.out.println("Top 10 by goals: ");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        System.out.println("Top 25 by penalty minutes: ");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        System.out.println("Sydney Crosby statistics: ");
        NHLStatistics.searchByPlayer("Crosby");

        System.out.println("Philadelphia Flyers statistics: ");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();

        System.out.println("Anaheim Ducks top goal scorers: ");
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByGoals();

    }
}
