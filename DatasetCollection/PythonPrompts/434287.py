def create_chunks(data: list, chunk_size: int)-> list:
    '''
    Creates chunks of the given size from the given list.
    
    Example:
    create_chunks([1, 2, 3, 4, 5, 6, 7, 8, 9], 3) -> [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    create_chunks([1, 2, 3, 4, 5, 6, 7, 8, 9], 4) -> [[1, 2, 3, 4], [5, 6, 7, 8], [9]]
    '''