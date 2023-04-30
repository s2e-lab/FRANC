import pandas as pd

def get_sum_by_group(df: pd.DataFrame, groups:list, sum_col:str) -> pd.DataFrame:
    """
    Return a dataframe with the sum of the sum_col grouped by the groups.

    Example:
    get_sum_by_group(pd.DataFrame({'a': [1, 1, 2, 2], 'b': [1, 2, 3, 4], 'c': [5, 6, 7, 8]}), ['a'], 'c') -> {a: 1, c: 11}, {a: 2, c: 15}
    get_sum_by_group(pd.DataFrame({'a': [1, 1, 2, 2], 'b': [1, 2, 3, 4], 'c': [5, 6, 7, 8]}), ['a','b'], 'c') -> {a: 1, b: 1, c: 5}, {a: 1, b: 2, c: 6}, {a: 2, b: 3, c: 7}, {a: 2, b: 4, c: 8}
    """

    # calculate the sum
    sum_of_all_col = get_sum(df, sum_col)

    # for each group
    for group in groups:
        # calculate each column
        df_group = df[df[group]==1].groupby(sum_col)

        # calculate the sum of each column
        sum_of_group = get_sum(df_group, sum_col)

        # update sums
        df[group+sum_col] = sum_of_group

    
    return df


def get_