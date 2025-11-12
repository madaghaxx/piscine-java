import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        if (set1 == null) {
            return set2;
        }
        if (set2 == null) {
            return set1;
        }
        Set<Integer> res = set1;
        for (int i : set2) {
            if (!set1.contains(i)) {
                res.add(i);
            }
        }
        return res;
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        if (set1 == null) {
            return set2;
        }
        if (set2 == null) {
            return set1;
        }
        Set<Integer> res = new HashSet<>();
        for (int i : set2) {
            if (set1.contains(i)) {
                res.add(i);
            }
        }
        return res;
    }
}