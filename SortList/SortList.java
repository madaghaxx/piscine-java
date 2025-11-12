import java.util.List;
import java.util.ArrayList;

public class SortList {

    public static List<Integer> sort(List<Integer> list) {
        if (list.isEmpty()) {
            return new ArrayList<>(list);
        }
        List<Integer> newlist = new ArrayList<>(list);
        newlist.sort(null);
        return newlist;
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        if (list.isEmpty()) {
            return new ArrayList<>(list);
        }
        List<Integer> newlist = new ArrayList<>(list);
        newlist.sort((Integer a, Integer b) -> b.compareTo(a));
        return newlist;
    }
}