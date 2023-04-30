import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Modp {
    /**
     * Return 2^n modulo p (be aware of numerics).
     * >>> modp(3, 5)
     * 3
     * >>> modp(1101, 101)
     * 2
     * >>> modp(0, 101)
     * 1
     * >>> modp(3, 11)
     * 8
     * >>> modp(100, 101)
     * 1
     *
     * > modp(3, 5)
     * 3
     * > modp(1101, 101)
     * 2
     * > modp(0, 101)
     * 1
     * > modp(3, 11)
     * 8
     * > modp(100, 101)
     * 1
     * > modp(30, 5)
     * 4
     * > modp(31, 5)
     * 3
     */
    public static int modp(int n, int p) {
        try {
            if ((n & 1) == 0) {
                return n>>1;
            }
            else {
                int[] d = new int[21];
                int dl = d.length;
                int[] dl1 = new int[64];
                int[] dl2 = new int[64];
                int[] dl3 = new int[64];
                long r = Math.abs(p);
                int r1, r2, r3;
                if ((r & 1) == 0) {
                    r1