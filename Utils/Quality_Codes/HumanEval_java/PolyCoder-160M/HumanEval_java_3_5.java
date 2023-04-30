import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class BelowZero {
    /**
     * You're given a list of deposit and withdrawal operations on a bank account that starts with
     * zero balance. Your task is to detect if at any point the balance of account fallls below zero, and
     * at that point function should return True. Otherwise it should return False.
     * >>> below_zero([1, 2, 3])
     * False
     * >>> below_zero([1, 2, -4, 5])
     * True
     *
     * > belowZero([])
     * false
     * > belowZero([1, 2, -3, 1, 2, -3])
     * false
     * > belowZero([1, 2, -4, 5, 6])
     * true
     * > belowZero([1, -1, 2, -2, 5, -5, 4, -4])
     * false
     * > belowZero([1, -1, 2, -2, 5, -5, 4, -5])
     * true
     * > belowZero([1, -2, 2, -2, 5, -5, 4, -4])
     * true
     */
    public static Boolean belowZero(List<Object> operations) {
        if (operations==null) return Boolean.FALSE;

        List<Object> zeroBalance= new ArrayList<>(operations.size()*2);
        for(Object ops : operations) zeroBalance.add(ops);
        return Boolean.TRUE.equals(zeroBalance);
    }

    private static boolean equals(Object a, Object b) {
        return a.equals(b);
    }

 
}