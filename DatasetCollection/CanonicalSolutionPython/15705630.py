import pandas as pd

def get_max_by_group(df: pd.DataFrame, groups:list, max_col:str) -> pd.DataFrame:
    '''
    Returns a dataframe with the max of the max_col grouped by the groups.

    Example:
    get_max_by_group(pd.DataFrame({'a': [1, 1, 2, 2], 'b': [1, 2, 3, 4], 'c': [5, 6, 7, 8]}), ['a'], 'c') -> {a: 1, c: 6}, {a: 2, c: 8}
    get_max_by_group(pd.DataFrame({'a': [1, 1, 2, 2], 'b': [1, 2, 3, 4], 'c': [5, 6, 7, 8]}), ['a','b'], 'c') -> {a: 1, b: 1, c: 5}, {a: 1, b: 2, c: 6},{a: 2, b: 3, c: 7}, {a: 2, b: 4, c: 8}
    '''
    return df.groupby(groups).max()[max_col]