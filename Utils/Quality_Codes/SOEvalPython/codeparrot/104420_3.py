def permutations(lst: list) -> list:
    '''
    Return a list of all permutations of the given list.

    Example:
    permutations([1, 2, 3]) -> [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
    '''
    for i in range(len(lst) - 2, 0, -1):
        temp = deque()
        for elem in lst:
            temp.append(elem)
            if i == 0 and elem == lst[-1]:  # no need to start a new element
                yield elem
            temp.popleft()
    else:
        raise ValueError("input must have length 1 or more permutations")
    return [item for pair in temp for item in pair]


