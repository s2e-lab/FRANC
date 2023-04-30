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
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(6, new MyCompare());
        for (int t : x) {
            while (pq.size() >= 2 && t * pq.peek()!= pq.poll())
                pq.poll();
            pq.offer(t);
        }
        List<Integer> res = new ArrayList<Integer>();
        Iterator<Integer> it = pq.iterator();
        while (it.hasNext()) {
            res.add(it.next());
        }
}
}