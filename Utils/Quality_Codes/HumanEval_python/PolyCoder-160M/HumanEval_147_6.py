
def get_max_triples(n):
    """
    You are given a positive integer n. You have to create an integer array a of length n.
        For each i (1 ≤ i ≤ n), the value of a[i] = i * i - i + 1.
        Return the number of triples (a[i], a[j], a[k]) of a where i < j < k, 
    and a[i] + a[j] + a[k] is a multiple of 3.

    Example :
        Input: n = 5
        Output: 1
        Explanation: 
        a = [1, 3, 7, 13, 21]
        The only valid triple is (1, 7, 13).
    """
    if n == 0:
        return 0
    max_triples = []
    for i in range(min(10, n + 1)):
        max_triples.append(max_triples[len(max_triples) - 1])

    last_pair = ''
    last_pair_num = 0
    max_triples_number = 0
    k = 0

    def find_pairs(num_vals