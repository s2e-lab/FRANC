

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
    assert 2 <= n <= 100, 2 <= n <= 100

    cars = {}
    total_collisions = 0
    while total_collisions < n:
        for car1 in cars:
            car1_loc = cars[car1]
            for car2 in cars:
                car2_loc = cars[car2]

                if car1!= car2:
                    if car2_loc in range(car1_loc, 4) or car1_loc in range(car2_loc):
                        total_collisions += 1
                else:
