import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class AddElements {
    /**
     * * Given a non-empty array of integers arr and an integer k, return
     * the sum of the elements with at most two digits from the first k elements of arr.

     * Example:

     *     Input: arr = [111,21,3,4000,5,6,7,8,9], k = 4
     *     Output: 24 # sum of 21 + 3

     * Constraints:
     *     1. 1 <= len(arr) <= 100
     *     2. 1 <= k <= len(arr)
     *
     * > addElements([1, -2, -3, 41, 57, 76, 87, 88, 99], 3)
     * -4
     * > addElements([111, 121, 3, 4000, 5, 6], 2)
     * 0
     * > addElements([11, 21, 3, 90, 5, 6, 7, 8, 9], 4)
     * 125
     * > addElements([111, 21, 3, 4000, 5, 6, 7, 8, 9], 4)
     * 24
     * > addElements([1], 1)
     * 1
     */
    public static int addElements(List<Integer> arr, int k) {
        int sum = 0;
        while (!arr.isEmpty()) {
            int now = addElements(arr, arr.size() - 1);
            if (now == 0) {
                sum += k;
                break;
            }
            for(int i = 0; i < k; i++) {
                sum += now;
            }
            sum += arr.size();
            arr.remove(arr.size() - 1);
        }
        return sum;
    }
}
