

def car_race_collision(n: int):
    """
    Imagine a road that's a perfectly straight infinitely long line.
    n cars are driving left to right;  simultaneously, a different set of n cars
    are driving right to left.   The two sets of cars start out being very far from
    each other.  All cars move in the same speed.  Two cars are said to collide
    when a car that's moving left to right hits a car that's moving right to left.
    However, the cars are infinitely sturdy and strong; as a result, they continue moving
    in their trajectory as if they did not collide.

    This function outputs the number of such collisions.
    """
    # Note: to implement/test this problem, you must first solve and then test the
    # more advanced functions that are implemented in the problems above.
    cars = [(i, 2, (i+1) % n, 0, 0)
            for i in range(n)]
    cars = sorted(cars, key=lambda x: x[2])

    while True:
        for i in range(n):
            other = cars[i]
            x0, y0 = other[2]
            x1, y1 = other[3]

            