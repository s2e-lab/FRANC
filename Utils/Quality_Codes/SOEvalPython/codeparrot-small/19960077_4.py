import pandas as pd

def filter_data(df: pd.DataFrame, column: str, value: list) -> pd.DataFrame:
    '''
    Filter a dataframe by a list of values for a given column.

    Example:
    filter_data({'a': [1, 2, 3], 'b': [4, 5, 6]}, 'a', [1, 3]) -> {'a': [1, 3], 'b': [4, 6]}
    '''
    if column not in df:
        raise ValueError(column)

    # Filter by value
    filtered_rows = []

    for i in range(len(value)):
        filtered_rows.append(df.loc[df[(value == i, i)].isin(value[i])])

    return filtered_rows

