
def make_a_pile(n):
    """
    Given a positive integer n, you have to make a pile of n levels of stones.
    The first level has n stones.
    The number of stones in the next level is:
        - the next odd number if n is odd.
        - the next even number if n is even.
    Return the number of stones in each level in a list, where element at index
    i represents the number of stones in the level (i+1).

    Examples:
    >>> make_a_pile(3)
    [3, 5, 7]
    """
    num_layers = 0
    layer = 0
    odds = [0 for l in range(layer + 1)]
    evens = [0 for l in range(layer + 1)]
    while num_layers < layer:
        layer = num_layers
        if num_layers == 0:
            odds[layer] = num_layers
        elif num_layers == layer:
            odds[layer] = OddsPerLevel(num_layers)
        else:
            if num_layers % 2:
