package nested_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlayerTest {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        players.add(new Player(1, "Ronaldo", 39, 1000, 5, 200));
        players.add(new Player(2, "Messi", 37, 900, 6, 500));
        players.add(new Player(3, "Lewandowski", 35, 800, 3, 180));
        players.add(new Player(4, "Mbappe", 25, 700, 2, 170));
        players.add(new Player(5, "Neymar", 32, 600, 1, 160));

        Collections.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        Collections.sort(players, PlayerComparator.BY_GOAL_ASC);

        System.out.println(players);


        int vlera = PlayerComparator.BY_GOAL_ASC.compare(players.get(0), players.get(1));

        System.out.println(vlera);

    }
}
