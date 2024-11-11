package nested_class;

import java.util.Comparator;

public class PlayerComparator {
    public static final Comparator<Player> BY_AGE_ASC = new Comparator<Player>() {
        @Override
        public int compare(Player o1, Player o2) {
            return o1.getAge() - o2.getAge();
        }
    };

    public static final Comparator<Player> BY_GOAL_ASC = new Comparator<Player>() {
        @Override
        public int compare(Player o1, Player o2) {
            return o1.getGoals() - o2.getGoals();
        }
    };
}
