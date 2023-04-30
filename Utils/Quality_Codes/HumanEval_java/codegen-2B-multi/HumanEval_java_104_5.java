import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class UniqueDigits {
    /**
     * Given a list of positive integers x. return a sorted list of all 
     * elements that hasn't any even digit.

     * Note: Returned list should be sorted in increasing order.
     * 
     * For example:
     * >>> unique_digits([15, 33, 1422, 1])
     * [1, 15, 33]
     * >>> unique_digits([152, 323, 1422, 10])
     * []
     *
     * > uniqueDigits([15, 33, 1422, 1])
     * [1, 15, 33]
     * > uniqueDigits([152, 323, 1422, 10])
     * []
     * > uniqueDigits([12345, 2033, 111, 151])
     * [111, 151]
     * > uniqueDigits([135, 103, 31])
     * [31, 135]
     */
    public static List<Object> uniqueDigits(List<Integer> x) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = x.size() - 1; i > 0; --i) {
            for (Integer t : x) {
                if (map.containsKey(t)) {
                    map.put(t + x.get(i), map.get(t) + 1);
                } else {
                    map.put(t, 1);
                }
            }
        }
        List<Object> res = new ArrayList<>();
}
}