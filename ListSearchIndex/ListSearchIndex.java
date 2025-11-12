import java.util.List;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        if (list == null || !list.contains(value)) {
            return null;
        }
        return list.lastIndexOf(value);
    }

    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        if (list == null || !list.contains(value)) {
            return null;
        }
        return list.indexOf(value);
    }

    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        if (list == null || !list.contains(value)) {
            return null;
        }
        List<Integer> indices = new java.util.ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Integer v = list.get(i);
            if (value == null ? v == null : value.equals(v)) {
                indices.add(i);
            }
        }
        return indices;
    }
}