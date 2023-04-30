def permutations(lst: list) -> list:
    '''
    Return a list of all permutations of the given list.

    Example:
    permutations([1, 2, 3]) -> [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
    '''
    c = 0
    for i in range(len(lst)):

      cnt1_len = 1
      cnt2_len = 1

      while c!= cnt1_len:

        if len(lst) % c == 0:
          c = 1

          cnt1_len += lst.count(lst[i])
          cnt2_len += lst.count(lst[i] % (c+1))

        elif len(lst) % c == 1:

          cnt1_len += 1
          cnt2_len += (lst.count(lst[i]) % (c/c+1))
         