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

        // if a!=b, return -1
        if (a==null) return a==null? -1 : 1;
        if (b==null) return b==null? -1 : 1;

        // The following implementation has been adapted to
        // <http://www.w3.org/TR/REC-xml-20001101>
        // <http://www.w3.org
}
}