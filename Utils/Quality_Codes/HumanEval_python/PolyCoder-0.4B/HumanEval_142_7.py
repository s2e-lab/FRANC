


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
    n = len(lst)
    sqr_lst = [0.0 for _ in range(n)]

    for i in range(1, n+1):
        for j in range(i,n):
            sqr_lst[i-1,j] = sqr_lst[j-1,i] = lst[i-1-j]
        sqr_lst[n+1,i] = 0.