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
        else {
            StringBuilder sb = new StringBuilder(strings.size());
            for (Object s : strings)
                sb.append(s);
            return sb.toString();
        }
    }
    
    public static void main(String[] args) {
}
}