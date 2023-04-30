

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
    assert n >= 1  # This function would return 0.0 if the inputs are invalid.

    left_to_right = n # The number of cars going left to right
    right_to_left = 0 # The number of cars going right to left
    collisions = 0  # The total number of collisions

    left_to_right_movement = left_to_right
    right_to_left_movement = right_to_left

    while (right_to_left_movement > 0):
        if right_to_left_movement ==