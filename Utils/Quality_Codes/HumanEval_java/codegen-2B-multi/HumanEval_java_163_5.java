import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class GenerateIntegers {
    /**
     * * Given two positive integers a and b, return the even digits between a
     * and b, in ascending order.

     * For example:
     * generate_integers(2, 8) => [2, 4, 6, 8]
     * generate_integers(8, 2) => [2, 4, 6, 8]
     * generate_integers(10, 14) => []
     *
     * > generateIntegers(2, 10)
     * [2, 4, 6, 8]
     * > generateIntegers(10, 2)
     * [2, 4, 6, 8]
     * > generateIntegers(132, 2)
     * [2, 4, 6, 8]
     * > generateIntegers(17, 89)
     * []
     */
    public static List<Object> generateIntegers(int a, int b) {
        List<Object> result = new ArrayList<>();

        if (a > b) {
            return result;
        }

        for (int i = a; i < b; i++) {
            result.add(i);
        }

        return result;
    }

    // vv Solution
    public static void main(String[] args) throws IOException {
        // vv Solution
        InputStream input = new FileInputStream(new File(SolutionConstants.SUBDIR, "input_test_case_1.txt"));
        
}
}