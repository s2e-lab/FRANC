


def sum_squares(lst):
    """"
    This function will take a list of integers. For all entries in the list, the function shall square the integer entry if its index is a 
    multiple of 3 and will cube the integer entry if its index is a multiple of 4 and not a multiple of 3. The function will not 
    change the entries in the list whose indexes are not a multiple of 3 or 4. The function shall then return the sum of all entries. 
    
    Examples:
    For lst = [1,2,3] the output should be 6
    For lst = []  the output should be 0
    For lst = [-1,-5,2,-1,-5]  the output should be -126
    """
    if isinstance(lst, int): return int(sum([int(a*b) for a, b in zip(lst, list(zip(lst, range(len(lst))))) if b==1]), 2)
    return int(sum([len(seq[i])*(seq[i]+list(l)*(l+1)) for i, seq in zip(range(len(lst))+1, lst+list(l+1)-1, list(range(len(lst))+1)) if i%2==0)), 2)


def sum