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
        StringBuilder sb = new StringBuilder();
        for(Object str : strings) {
            sb.append(str);
        }

        return sb.toString();
    }
}
