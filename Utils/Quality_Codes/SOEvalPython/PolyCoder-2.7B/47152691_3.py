import pandas as pd

def pivot_dataframe(df: pd.DataFrame) -> pd.DataFrame:
    """
    Pivot the dataframe so that the column names are the values of the column 'name'
    and the values are the values of the column 'value'.

    Example:
    pivot_dataframe(pd.DataFrame({'id': [1, 2, 3], 'name': ['a', 'b', 'c'], 'value': [1, 2, 3]}))
    -> pd.DataFrame({'a': [1, np.nan, np.nan], 'b': [np.nan, 2, np.nan], 'c': [np.nan, np.nan, 3]})
    """
    cols = df.columns
    df = df.pivot(cols=cols, index=df.columns, columns=cols, values=df.values, method='fill')
    pivot_index = df.index
    pivot_values = df.values
    for i, col in enumerate(pivot_index):
        # pivot_index has 3 columns on each side, so 3 for each value
        pivot_index[i] = pivot_values[i, pivot_index