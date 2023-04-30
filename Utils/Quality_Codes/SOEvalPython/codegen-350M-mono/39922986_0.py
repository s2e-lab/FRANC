import pandas as pd

def get_sum_by_group(df: pd.DataFrame, groups:list, sum_col:str) -> pd.DataFrame:
    """
    Return a dataframe with the sum of the sum_col grouped by the groups.

    Example:
    get_sum_by_group(pd.DataFrame({'a': [1, 1, 2, 2], 'b': [1, 2, 3, 4], 'c': [5, 6, 7, 8]}), ['a'], 'c') -> {a: 1, c: 11}, {a: 2, c: 15}
    get_sum_by_group(pd.DataFrame({'a': [1, 1, 2, 2], 'b': [1, 2, 3, 4], 'c': [5, 6, 7, 8]}), ['a','b'], 'c') -> {a: 1, b: 1, c: 5}, {a: 1, b: 2, c: 6}, {a: 2, b: 3, c: 7}, {a: 2, b: 4, c: 8}
    """
    sum_array = []
    for group in groups:
        if group in df:
            df_set = df.loc[df.groupby(group)['group']]
            temp = df_set.agg({sum_col:'sum'})
            temp_list = [temp[c].tolist() for c in temp]
            sum_array.extend(temp_list)
        else:
            sum_array.append([0, 0])

    return pd.DataFrame({sum_col:{x[0]:sumc