import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Monotonic {
    /**
     * Return True is list elements are monotonically increasing or decreasing.
     * >>> monotonic([1, 2, 4, 20])
     * True
     * >>> monotonic([1, 20, 4, 10])
     * False
     * >>> monotonic([4, 1, 0, -10])
     * True
     *
     * > monotonic([1, 2, 4, 10])
     * true
     * > monotonic([1, 2, 4, 20])
     * true
     * > monotonic([1, 20, 4, 10])
     * false
     * > monotonic([4, 1, 0, -10])
     * true
     * > monotonic([4, 1, 1, 0])
     * true
     * > monotonic([1, 2, 3, 2, 5, 60])
     * false
     * > monotonic([1, 2, 3, 4, 5, 60])
     * true
     * > monotonic([9, 9, 9, 9])
     * true
     */
    public static Boolean monotonic(List<Integer> l) {
        if (l.size() < 1) {return true;}
        int previous = l.get(0), current, numberOfIncreasing = 0, numberOfDecreasing = 0;

        for (int i = 1; i < l.size(); i++) {
            current = l.get(i);

            if (current < previous) {numberOfDecreasing += 1;}
            if (current > previous) {numberOfIncreasing+= 1;}

            previous = current;
        }

        return numberOfIncreasing == numberOfDecreasing;
    }


}