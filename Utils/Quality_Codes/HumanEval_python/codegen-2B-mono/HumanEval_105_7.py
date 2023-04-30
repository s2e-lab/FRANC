
def by_length(arr):
    """
    Given an array of integers, sort the integers that are between 1 and 9 inclusive,
    reverse the resulting array, and then replace each digit by its corresponding name from
    "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine".

    For example:
      arr = [2, 1, 1, 4, 5, 8, 2, 3]   
            -> sort arr -> [1, 1, 2, 2, 3, 4, 5, 8] 
            -> reverse arr -> [8, 5, 4, 3, 2, 2, 1, 1]
      return ["Eight", "Five", "Four", "Three", "Two", "Two", "One", "One"]
    
      If the array is empty, return an empty array:
      arr = []
      return []
    
      If the array has any strange number ignore it:
      arr = [1, -1 , 55] 
            -> sort arr -> [-1, 1, 55]
            -> reverse arr -> [55, 1, -1]
      return = ['One']
    """
    
    def swap(a, b, i):
        a[i] = b[i]
        b[i] = a[i]

    def sorte(ls):
        if ls == []: return ls
        
        for i, _ in enumerate(ls):
            if i % 2 == 0:
                if not _ % 9 <= 10 - _ and not (i == len(ls) - 1 and _ >= 10):
                    ls[i], ls[i + 1] = ls[i + 1], ls[i]
        
        