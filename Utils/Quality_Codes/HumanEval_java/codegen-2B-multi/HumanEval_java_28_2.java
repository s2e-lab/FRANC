import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Concatenate {
    /**
     * Concatenate list of strings into a single string
     * >>> concatenate([])
     * ''
     * >>> concatenate(['a', 'b', 'c'])
     * 'abc'
     *
     * > concatenate([])
     * ""
     * > concatenate(["x", "y", "z"])
     * "xyz"
     * > concatenate(["x", "y", "z", "w", "k"])
     * "xyzwk"
     */
    public static String concatenate(List<Object> strings) {
        String rv = "";
        for (Object s : strings)
            rv += s + " ";
        return truncate(rv, strings.size());
    }

    public static String truncate(String s, int n) {
        return s.substring(0, Math.min(n, s.length()));
    }

    public static void main(String[] args) {
        // String s = concatenate(Arrays.asList(args)); System.out.println(s);
}
}