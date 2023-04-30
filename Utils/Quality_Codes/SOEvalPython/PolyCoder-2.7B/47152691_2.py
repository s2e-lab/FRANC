import pandas as pd

def pivot_dataframe(df: pd.DataFrame) -> pd.DataFrame:
    """
    Pivot the dataframe so that the column names are the values of the column 'name'
    and the values are the values of the column 'value'.

    Example:
    pivot_dataframe(pd.DataFrame({'id': [1, 2, 3], 'name': ['a', 'b', 'c'], 'value': [1, 2, 3]}))
    -> pd.DataFrame({'a': [1, np.nan, np.nan], 'b': [np.nan, 2, np.nan], 'c': [np.nan, np.nan, 3]})
    """

    # if 'id' missing and 'name' missing
    ids = df['id'].unique()
    df = df.assign(name = _pivot_col(df, 'name'), id = df['id'], value = df['value']).dropna(axis=0)

    names = df.columns.to_list()
    df.columns = ['name', 'value', 'id']
    return df


