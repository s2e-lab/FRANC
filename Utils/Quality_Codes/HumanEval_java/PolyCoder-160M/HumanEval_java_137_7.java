import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CompareOne {
    /**
     * * Create a function that takes integers, floats, or strings representing
     * real numbers, and returns the larger variable in its given variable type.
     * Return null if the values are equal.
     * Note: If a real number is represented as a string, the floating point might be . or ,

     * compare_one(1, 2.5) ➞ 2.5
     * compare_one(1, "2,3") ➞ "2,3"
     * compare_one("5,1", "6") ➞ "6"
     * compare_one("1", 1) ➞ None
     *
     * > compareOne(1, 2)
     * 2
     * > compareOne(1, 2.5)
     * 2.5
     * > compareOne(2, 3)
     * 3
     * > compareOne(5, 6)
     * 6
     * > compareOne(1, "2,3")
     * "2,3"
     * > compareOne("5,1", "6")
     * "6"
     * > compareOne("1", "2")
     * "2"
     * > compareOne("1", 1)
     * null
     */
    public static Object compareOne(Object a, Object b) {
        final Object comp0 = a.getClass().getMethod(a.getClass().toString(), a.length(), a.getClass().getName(), "toString", a.toString());
        final Object comp1 = b.getClass().getMethod(b.getClass().toString(), b.length(), b.getClass().getName(), "toString", b.toString());
        return comp1 == null? null : comp1;
    }
}