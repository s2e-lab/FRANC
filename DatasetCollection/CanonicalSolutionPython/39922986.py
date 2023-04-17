import pandas as pd

def get_sum_by_group(df: pd.DataFrame, groups:list, sum_col:str) -> pd.DataFrame:
    """
    Returns a dataframe with the sum of the sum_col grouped by the groups.

    Example:
    get_sum_by_group(pd.DataFrame({'a': [1, 1, 2, 2], 'b': [1, 2, 3, 4], 'c': [5, 6, 7, 8]}), ['a'], 'c') -> {a: 1, c: 11}, {a: 2, c: 15}
    get_sum_by_group(pd.DataFrame({'a': [1, 1, 2, 2], 'b': [1, 2, 3, 4], 'c': [5, 6, 7, 8]}), ['a','b'], 'c') -> {a: 1, b: 1, c: 5}, {a: 1, b: 2, c: 6}, {a: 2, b: 3, c: 7}, {a: 2, b: 4, c: 8}
    """
    return df.groupby(groups).sum()[sum_col]
