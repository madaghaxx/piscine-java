import java.util.List;

public class SortList {

    public static List<Integer> sort(List<Integer> list) {
       list.sort(null);
       return list;
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        list.sort((a, b) -> b - a);
        return list;
    }
}