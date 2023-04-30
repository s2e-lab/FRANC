

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
    s,e,h,w,s_d,e_d,h_d = 0,1,2,3,4,5,6
    r = range(0, n+1)
    def b_s_l(n,s,e,h,w,s_d,e_d,h_d,lst):
        #print("lst=",lst)
        if n == w:
            lst[s_d].append(s)
        else:
            b_s_l(n+1,