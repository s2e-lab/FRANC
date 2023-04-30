import pandas as pd

def pivot_dataframe(df: pd.DataFrame) -> pd.DataFrame:
    """
    Pivot the dataframe so that the column names are the values of the column 'name'
    and the values are the values of the column 'value'.

    Example:
    pivot_dataframe(pd.DataFrame({'id': [1, 2, 3], 'name': ['a', 'b', 'c'], 'value': [1, 2, 3]}))
    -> pd.DataFrame({'a': [1, np.nan, np.nan], 'b': [np.nan, 2, np.nan], 'c': [np.nan, np.nan, 3]})
    """
    columns = set(df.columns)
    pivot_index = pd.MultiIndex.from_product([c for c in columns if c in df.columns])
    pivot = df.pivot(index=pivot_index, columns=columns, values=df.values)

    pivot.index = pivot_index
    pivot.columns = columns
    pivot.values = df.values

    return pivot


