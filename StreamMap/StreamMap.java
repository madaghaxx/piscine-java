import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
public class StreamMap {
    public static Integer sumOfStringLength(Stream<String> s) {
        int res;
        s.map(a -> res += a.length());
        return res;
    }

    public static List<String> upperCaseAllString(Stream<String> s) {
        return s.map(a -> a.toUpperCase()).collect(Collectors.toList());
    }

    public static Set<Integer> uniqIntValuesGreaterThan42(Stream<Double> s) {
        return s.filter(a -> a > 42).map(a -> a.intValue()).collect(Collectors.toSet());
    }
}