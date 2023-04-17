def read_int(prompt: str) -> int:
    '''
    Read an integer from the user

    Example:
    read_int('Enter an integer: ') -> 1
    read_int('Enter your age: ') -> 21
    '''
    return int(input(prompt))