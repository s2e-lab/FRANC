

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
    total_collisions = 0
    for i in range(n):
        for j in range(n):
            if i == j: continue
            dif = get_dist(car_pos[i], car_pos[j])  # difference in distances in any direction
            if dif < 2: # no need to move if within two spaces
                total_collisions += 1
    return total_collisions


