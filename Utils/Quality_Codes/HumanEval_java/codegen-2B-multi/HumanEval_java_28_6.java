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
        if (strings.size() == 0)
            return "";
        int sz = strings.size();
        StringBuilder s = new StringBuilder(sz);
        for (Object str:strings)
            s.append(str);
        return s.toString();
    }

    public static void main(String[] args) {
        String input = "abc";
        String result = concatenate(Arrays.asList(input));
        System.out.println(result);

        Scanner scanner = new Scanner(System.in);

}
}