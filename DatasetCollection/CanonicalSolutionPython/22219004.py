import pandas as pd

def create_list_by_grouping(df: pd.DataFrame, group_by: str, column: str) -> list:
    '''
    Create a list of lists by grouping a column of a DataFrame.

    Example:
    create_list_by_grouping(pd.DataFrame({'a': [1, 1, 2], 'b': [1, 2, 3]}), 'a', 'b') -> [[1, 2], [3]]
    create_list_by_grouping(pd.DataFrame({'a': [1, 1, 2], 'b': [1, 2, 3]}), 'b', 'a') -> [[1], [1], [2]]
    '''
    return df.groupby(group_by)[column].apply(list).tolist()