import java.util.List;

public class SortList {

    public static List<Integer> sort(List<Integer> list) {
        if (list == null) {
            return null;
        }
        list.sort(null);
        return list;
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        if (list == null) {
            return null;
        }
        List<Integer> newlist = new java.util.ArrayList<>(list);
        newlist.sort((Integer a, Integer b) -> b.compareTo(a));
        return newlist;
    }
}