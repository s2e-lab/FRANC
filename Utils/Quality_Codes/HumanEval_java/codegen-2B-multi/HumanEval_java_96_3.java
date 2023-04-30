import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CountUpTo {
    /**
     * Implement a function that takes an non-negative integer and returns an array of the first n
     * integers that are prime numbers and less than n.
     * for example:
     * count_up_to(5) => [2,3]
     * count_up_to(11) => [2,3,5,7]
     * count_up_to(0) => []
     * count_up_to(20) => [2,3,5,7,11,13,17,19]
     * count_up_to(1) => []
     * count_up_to(18) => [2,3,5,7,11,13,17]
     *
     * > countUpTo(5)
     * [2, 3]
     * > countUpTo(6)
     * [2, 3, 5]
     * > countUpTo(7)
     * [2, 3, 5]
     * > countUpTo(10)
     * [2, 3, 5, 7]
     * > countUpTo(0)
     * []
     * > countUpTo(22)
     * [2, 3, 5, 7, 11, 13, 17, 19]
     * > countUpTo(1)
     * []
     * > countUpTo(18)
     * [2, 3, 5, 7, 11, 13, 17]
     * > countUpTo(47)
     * [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43]
     * > countUpTo(101)
     * [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]
     */
    public static List<Object> countUpTo(int n) {
        Set<Integer> set = new HashSet<>();

        for(int i = 1; i <= n; i++) {
            if(set.contains(i))
                continue;

            while(true) {
                int x = i * i + i;
                if(x > n)
                    break;
                else {
                    set.add(x);
                    if(findPrime(x))
                        break;
                }
            }
        }

        List<Object> re = new ArrayList<>();
}
}