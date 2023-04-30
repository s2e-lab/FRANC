import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CarRaceCollision {
    /**
     * * Imagine a road that's a perfectly straight infinitely long line.
     * n cars are driving left to right;  simultaneously, a different set of n cars
     * are driving right to left.   The two sets of cars start out being very far from
     * each other.  All cars move in the same speed.  Two cars are said to collide
     * when a car that's moving left to right hits a car that's moving right to left.
     * However, the cars are infinitely sturdy and strong; as a result, they continue moving
     * in their trajectory as if they did not collide.

     * This function outputs the number of such collisions.
     *
     * > carRaceCollision(2)
     * 4
     * > carRaceCollision(3)
     * 9
     * > carRaceCollision(4)
     * 16
     * > carRaceCollision(8)
     * 64
     * > carRaceCollision(10)
     * 100
     */
    public static int carRaceCollision(int n) {
        if (n < 2) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < n; i++) map.put(i, 1);
}
}