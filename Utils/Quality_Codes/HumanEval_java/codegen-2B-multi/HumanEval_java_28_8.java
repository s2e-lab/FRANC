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
        return strings == null || strings.isEmpty()? "" : join(strings, "");
    }

    public static String join(List<Object> strings, String delimiter) {
        if (strings == null || strings.isEmpty())
            return "";
        StringBuilder sb = new StringBuilder();
}
}