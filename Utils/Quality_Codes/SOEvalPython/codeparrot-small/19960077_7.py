import pandas as pd

def filter_data(df: pd.DataFrame, column: str, value: list) -> pd.DataFrame:
    '''
    Filter a dataframe by a list of values for a given column.

    Example:
    filter_data({'a': [1, 2, 3], 'b': [4, 5, 6]}, 'a', [1, 3]) -> {'a': [1, 3], 'b': [4, 6]}
    '''
    filtered_data = {}
    for value in value:
        if value in column: filtered_data[value] = []
    return filtered_data

