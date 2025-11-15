import java.util.*;
import java.util.stream.Stream;
public class StreamMap {
    public static Integer sumOfStringLength(Stream<String> s) {
        int res;
        s.map(a -> res += a.length());
        return res;
    }

    public static List<String> upperCaseAllString(Stream<String> s) {
        return s.map(a -> a.toUpperCase());
    }

    public static Set<Integer> uniqIntValuesGreaterThan42(Stream<Double> s) {
        return s.filter(a -> a > 42);
    }
}