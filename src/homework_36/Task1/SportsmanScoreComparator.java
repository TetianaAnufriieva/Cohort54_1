package homework_36.Task1;

import java.util.Comparator;

public class SportsmanScoreComparator implements Comparator <Sportsman> {
    @Override
    public int compare(Sportsman sMan1, Sportsman sMan2) {
        return sMan1.getScore() - sMan2.getScore();
    }
}
