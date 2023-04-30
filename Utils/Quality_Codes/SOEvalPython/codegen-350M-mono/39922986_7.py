import pandas as pd

def get_sum_by_group(df: pd.DataFrame, groups:list, sum_col:str) -> pd.DataFrame:
    """
    Return a dataframe with the sum of the sum_col grouped by the groups.

    Example:
    get_sum_by_group(pd.DataFrame({'a': [1, 1, 2, 2], 'b': [1, 2, 3, 4], 'c': [5, 6, 7, 8]}), ['a'], 'c') -> {a: 1, c: 11}, {a: 2, c: 15}
    get_sum_by_group(pd.DataFrame({'a': [1, 1, 2, 2], 'b': [1, 2, 3, 4], 'c': [5, 6, 7, 8]}), ['a','b'], 'c') -> {a: 1, b: 1, c: 5}, {a: 1, b: 2, c: 6}, {a: 2, b: 3, c: 7}, {a: 2, b: 4, c: 8}
    """

    if not isinstance(groups, list) or len(groups) < 2:
        raise ValueError("group must be a list of length 2.")

    # check if group exists in the given group
    for group in groups:
        if group not in df.columns:
            raise ValueError("The group \"{}\" must be present in the dataframe.".format(group))


    df_temp = pd.DataFrame({x: [0] * len(groups) for x in df.columns})
    for i, x in enumerate