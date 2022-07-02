import java.util.HashSet;

public class MathHashSets {
    public static <T> HashSet<T> union(HashSet<T> first, HashSet<T> second) {
        first.addAll(second);
        return first;
    }

    public static <T> HashSet<T> intersection(HashSet<T> first, HashSet<T> second) {
        first.retainAll(second);
        return first;
    }

    public static <T> HashSet<T> minus(HashSet<T> first, HashSet<T> second) {
        first.removeAll(second);
        return first;
    }

    public static <T> HashSet<T> difference(HashSet<T> first, HashSet<T> second) {
        HashSet<T> res = new HashSet<>(first);
        HashSet<T> res2 = new HashSet<>(second);
        res.removeAll(second);
        res2.removeAll(first);
        res.addAll(res2);
        return res;
    }
}
