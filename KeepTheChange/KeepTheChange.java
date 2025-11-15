import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public static List<Integer> computeChange(int amount, Set<Integer> coins) {
    List<Integer> res = new ArrayList<>();
    List<Integer> sortedCoins = new ArrayList<>(coins);
    sortedCoins.sort((a, b) -> b - a);
    int i = 0;
    while (amount > 0) {
        if (amount % sortedCoins.get(i) > 1) {
            amount -= sortedCoins.get(i);
        } else {
            i++;
        }
    }

}