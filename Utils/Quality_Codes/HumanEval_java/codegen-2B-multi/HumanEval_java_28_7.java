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
        return strings.stream().reduce("", (s1, s2) -> s1 + s2);
    }

    public static void main(String[] args) {
        String s1 = concatenate(Arrays.asList("a", "b", "c"));
        System.out.println(s1);
        System.out.println(concatenate(Arrays.asList("x", "y", "z")));
}
}