
def add(lst):
    """Given a non-empty list of integers lst. add the even elements that are at odd indices..


    Examples:
        add([4, 2, 6, 7]) ==> 2 
    """
    counter = 0
    list_length = len(lst)
    output = []
    for i in range(list_length):
        counter = i%2
        if counter == 0:
            output.append(lst[i])
        else:
            pass # Do nothing...
            
    return output
