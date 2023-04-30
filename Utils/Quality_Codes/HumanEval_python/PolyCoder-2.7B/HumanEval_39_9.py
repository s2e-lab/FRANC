

def prime_fib(n: int):
    """
    prime_fib returns n-th number that is a Fibonacci number and it's also prime.
    >>> prime_fib(1)
    2
    >>> prime_fib(2)
    3
    >>> prime_fib(3)
    5
    >>> prime_fib(4)
    13
    >>> prime_fib(5)
    89
    """
    result = 2
    for left_val in range(n - 1):
        current_val = int(next_prime(n))
        while current_val in prime_arr:
            if current_val == n:
                break
            else:
                result = min(