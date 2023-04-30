import pandas as pd

def get_max_by_group(df: pd.DataFrame, groups:list, max_col:str) -> pd.DataFrame:
    '''
    Return a dataframe with the max of the max_col grouped by the groups.

    Example:
    get_max_by_group(pd.DataFrame({'a': [1, 1, 2, 2], 'b': [1, 2, 3, 4], 'c': [5, 6, 7, 8]}), ['a'], 'c') -> {a: 1, c: 6}, {a: 2, c: 8}
    get_max_by_group(pd.DataFrame({'a': [1, 1, 2, 2], 'b': [1, 2, 3, 4], 'c': [5, 6, 7, 8]}), ['a','b'], 'c') -> {a: 1, b: 1, c: 5}, {a: 1, b: 2, c: 6},{a: 2, b: 3, c: 7}, {a: 2, b: 4, c: 8}
    '''
    assert groups is not None, "One of a list of groups was None"
    groups_data = df[groups]
    groups_max = pd.Series(groups_data.max(axis=1), fill_value=groups_data.max(axis=0).max(axis=1), name=groups, index=True, is_monotonic=True)
    if len(groups_data) > len(max_col):
        groups_max = groups_max.append(groups_data