
def get_odd_collatz(n):
    """
    Given a positive integer n, return a sorted list that has the odd numbers in collatz sequence.

    The Collatz conjecture is a conjecture in mathematics that concerns a sequence defined
    as follows: start with any positive integer n. Then each term is obtained from the 
    previous term as follows: if the previous term is even, the next term is one half of 
    the previous term. If the previous term is odd, the next term is 3 times the previous
    term plus 1. The conjecture is that no matter what value of n, the sequence will always reach 1.

    Note: 
        1. Collatz(1) is [1].
        2. returned list sorted in increasing order.

    For example:
    get_odd_collatz(5) returns [1, 5] # The collatz sequence for 5 is [5, 16, 8, 4, 2, 1], so the odd numbers are only 1, and 5.
    """
    # Your code here
    def sol(a):
        alist = []
        if a >= 1:
            for i in range(1,a):
                alist.append(i)
            for i in range(len(alist)):
                if alist.count(alist[i]) % 2 == 0:
                    alist[i] = 3*alist[i] + 1
                else:
                    alist[i] = 3*alist[i] + 1
            return alist
        else : return [1, a]

    return sol(n)